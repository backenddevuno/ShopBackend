package com.allshop.framework.persistence.catalogo.calificacion.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import com.allshop.framework.commons.utils.date.DateUtilsCommons;
import com.allshop.framework.persistence.catalogo.calificacion.vo.CatalogoCalificacionVo;
import com.allshop.framework.persistence.common.ElementosComunesVo;
import com.allshop.framework.persistence.common.JdbcDao;

public class CatalogoCalificacionDaoImpl extends JdbcDao implements CatalogoCalificacionDao {

	private static final Logger log = Logger.getLogger(CatalogoCalificacionDaoImpl.class);

	private String qryCrearCalificacion;
	private String qryModificarCalificacion;
	private String qryConsultarCalificacion;
	private String nextIdCalificacion;

	@Override
	public CatalogoCalificacionVo crearCatalogoCalificacionDao(final CatalogoCalificacionVo catalogoCalificacionVo)
			throws Exception {

		if (log.isDebugEnabled()) {
			log.debug("crearCatalogoCalificacionDao...");
		}

		try {
			final int nextIdCalif = jdbcTemplate.queryForInt(nextIdCalificacion);
			
			int affected = jdbcTemplate.update(new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
					PreparedStatement ps = con.prepareStatement(qryCrearCalificacion);
					ps.setInt(1, nextIdCalif);
					ps.setLong(2, catalogoCalificacionVo.getIdCalificacion());
					ps.setString(3, catalogoCalificacionVo.getDescCalificacion());
					ps.setInt(4, catalogoCalificacionVo.getElementosComunesVo().getStatusFlag());
					ps.setDate(5, DateUtilsCommons.convertJavaDateToSqlDate(catalogoCalificacionVo.getElementosComunesVo().getExpiryDt()));
					ps.setDate(6, DateUtilsCommons.convertJavaDateToSqlDate(catalogoCalificacionVo.getElementosComunesVo().getLastUpdateDt()));
					ps.setInt(7, nextIdCalif);
					ps.setString(8, catalogoCalificacionVo.getElementosComunesVo().getLastUpdateUser());
	
					return ps;
				}
			});

		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return catalogoCalificacionVo;
	}

	@Override
	public CatalogoCalificacionVo modificarCatalogoCalificacionDao(final CatalogoCalificacionVo catalogoCalificacionVo)
			throws Exception {
	       if (log.isDebugEnabled()) {
	            log.debug("modificarCatalogoCalificacionDao...");
	        }
	       try {
		        int affected = jdbcTemplate.update(new PreparedStatementCreator() {
		            public PreparedStatement createPreparedStatement(Connection con)
		                    throws SQLException {
		                PreparedStatement ps = con.prepareStatement(qryModificarCalificacion);
						
		                ps.setLong(1, catalogoCalificacionVo.getLangTpCd());
						ps.setString(2, catalogoCalificacionVo.getDescCalificacion());
						ps.setInt(3, catalogoCalificacionVo.getElementosComunesVo().getStatusFlag());
						ps.setDate(4, (Date) catalogoCalificacionVo.getElementosComunesVo().getExpiryDt());
						ps.setDate(5, (Date) catalogoCalificacionVo.getElementosComunesVo().getLastUpdateDt());
						ps.setLong(6, catalogoCalificacionVo.getElementosComunesVo().getLastUpdateTxId());
						ps.setString(7, catalogoCalificacionVo.getElementosComunesVo().getLastUpdateUser());
						ps.setLong(8, catalogoCalificacionVo.getIdCalificacion());
		                return ps;
		            }
		        });

		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return catalogoCalificacionVo;
	}

	@Override
	public List<CatalogoCalificacionVo> consultarCatalogoCalificacionDao(String idCalificacion) throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("consultarCatalogoCalificacionDao...");
		}

		List<Object> parameters = new ArrayList<Object>();
		parameters.add(idCalificacion);
		Object[] args = parameters.toArray();
		List<CatalogoCalificacionVo> consultarCatalogoCalificacionDao = null;

		try {
			consultarCatalogoCalificacionDao = (List<CatalogoCalificacionVo>) jdbcTemplate.query(qryConsultarCalificacion, args,
					MAPPER_CAT_CALIF);

		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return consultarCatalogoCalificacionDao;
	}

	private static ParameterizedRowMapper<CatalogoCalificacionVo> MAPPER_CAT_CALIF = new ParameterizedRowMapper<CatalogoCalificacionVo>() {
		public CatalogoCalificacionVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			CatalogoCalificacionVo obj = new CatalogoCalificacionVo();
			ElementosComunesVo elementosComunesVo = new ElementosComunesVo();

			obj.setLangTpCd(Long.parseLong(rs.getString("LANG_TP_CD")));
			obj.setIdCalificacion(Long.parseLong(rs.getString("ID_CALIFICACION")));
			obj.setDescCalificacion(rs.getString("DESC_CALIFICACION"));
			elementosComunesVo.setStatusFlag(Integer.parseInt(rs.getString("STATUS_FLAG")));
			elementosComunesVo.setExpiryDt(Date.valueOf(rs.getString("EXPIRY_DT")));
			elementosComunesVo.setLastUpdateDt(Date.valueOf(rs.getString("LAST_UPDATE_DT")));
			elementosComunesVo.setLastUpdateTxId(Long.parseLong(rs.getString("LAST_UPDATE_TX_ID")));
			elementosComunesVo.setLastUpdateUser(rs.getString("LAST_UPDATE_USER"));
			obj.setElementosComunesVo(elementosComunesVo);

			return obj;
		}

	};

	public String getQryCrearCalificacion() {
		return qryCrearCalificacion;
	}

	public void setQryCrearCalificacion(String qryCrearCalificacion) {
		this.qryCrearCalificacion = qryCrearCalificacion;
	}

	public String getQryModificarCalificacion() {
		return qryModificarCalificacion;
	}

	public void setQryModificarCalificacion(String qryModificarCalificacion) {
		this.qryModificarCalificacion = qryModificarCalificacion;
	}

	public String getQryConsultarCalificacion() {
		return qryConsultarCalificacion;
	}

	public void setQryConsultarCalificacion(String qryConsultarCalificacion) {
		this.qryConsultarCalificacion = qryConsultarCalificacion;
	}

	public String getNextIdCalificacion() {
		return nextIdCalificacion;
	}

	public void setNextIdCalificacion(String nextIdCalificacion) {
		this.nextIdCalificacion = nextIdCalificacion;
	}

}
