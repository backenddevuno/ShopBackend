package com.allshop.framework.persistence.catalogo.lenguaje.dao;

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
import com.allshop.framework.persistence.catalogo.lenguaje.vo.CatalogoLenguajeVo;
import com.allshop.framework.persistence.common.ElementosComunesVo;
import com.allshop.framework.persistence.common.JdbcDao;

public class CatalogoLenguajeDaoImpl extends JdbcDao implements CatalogoLenguajeDao {
	private static final Logger log = Logger.getLogger(CatalogoLenguajeDaoImpl.class);

	private String qryCrearLenguaje;
	private String qryModificarLenguaje;
	private String qryConsultarLenguaje;
	private String nextIdLenguaje;

	@Override
	public CatalogoLenguajeVo crearCatalogoLenguajeDao(final CatalogoLenguajeVo catalogoLenguajeVo) throws Exception {

		if (log.isDebugEnabled()) {
			log.debug("crearCatalogoLenguajeDao...");
		}

		try {
			final int nextIdLeng = jdbcTemplate.queryForInt(nextIdLenguaje);
			
			int affected = jdbcTemplate.update(new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
					PreparedStatement ps = con.prepareStatement(qryCrearLenguaje);
					ps.setInt(1, nextIdLeng);
					ps.setLong(2, catalogoLenguajeVo.getIdLenguaje());
					ps.setString(3, catalogoLenguajeVo.getDescLenguaje());
					ps.setInt(4, catalogoLenguajeVo.getElementosComunesVo().getStatusFlag());
					ps.setDate(5, DateUtilsCommons.convertJavaDateToSqlDate(catalogoLenguajeVo.getElementosComunesVo().getExpiryDt()));
					ps.setDate(6, DateUtilsCommons.convertJavaDateToSqlDate(catalogoLenguajeVo.getElementosComunesVo().getLastUpdateDt()));
					ps.setInt(7, nextIdLeng);
					ps.setString(8, catalogoLenguajeVo.getElementosComunesVo().getLastUpdateUser());
	
					return ps;
				}
			});

		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return catalogoLenguajeVo;
	}

	@Override
	public CatalogoLenguajeVo modificarCatalogoLenguajeDao(final CatalogoLenguajeVo catalogoLenguajeVo) throws Exception {
	       if (log.isDebugEnabled()) {
	            log.debug("modificarCatalogoLenguajeDao...");
	        }
	       try {
		        int affected = jdbcTemplate.update(new PreparedStatementCreator() {
		            public PreparedStatement createPreparedStatement(Connection con)
		                    throws SQLException {
		                PreparedStatement ps = con.prepareStatement(qryModificarLenguaje);
						
		                ps.setLong(1, catalogoLenguajeVo.getLangTpCd());
						ps.setString(2, catalogoLenguajeVo.getDescLenguaje());
						ps.setInt(3, catalogoLenguajeVo.getElementosComunesVo().getStatusFlag());
						ps.setDate(4, (Date) catalogoLenguajeVo.getElementosComunesVo().getExpiryDt());
						ps.setDate(5, (Date) catalogoLenguajeVo.getElementosComunesVo().getLastUpdateDt());
						ps.setLong(6, catalogoLenguajeVo.getElementosComunesVo().getLastUpdateTxId());
						ps.setString(7, catalogoLenguajeVo.getElementosComunesVo().getLastUpdateUser());
						ps.setLong(8, catalogoLenguajeVo.getIdLenguaje());
		                return ps;
		            }
		        });

		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return catalogoLenguajeVo;
	}

	@Override
	public List<CatalogoLenguajeVo> consultarCatalogoLenguajeDao(String idLenguaje) throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("consultarCatalogoLenguajeDao...");
		}

		List<Object> parameters = new ArrayList<Object>();
		parameters.add(idLenguaje);
		Object[] args = parameters.toArray();
		List<CatalogoLenguajeVo> consultarCatalogoLenguajeDao = null;

		try {
			consultarCatalogoLenguajeDao = (List<CatalogoLenguajeVo>) jdbcTemplate.query(qryConsultarLenguaje, args,
					MAPPER_CAT_LENG);
		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return consultarCatalogoLenguajeDao;
	}

	private static ParameterizedRowMapper<CatalogoLenguajeVo> MAPPER_CAT_LENG = new ParameterizedRowMapper<CatalogoLenguajeVo>() {
		public CatalogoLenguajeVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			CatalogoLenguajeVo obj = new CatalogoLenguajeVo();
			ElementosComunesVo elementosComunesVo = new ElementosComunesVo();

			obj.setLangTpCd(Long.parseLong(rs.getString("LANG_TP_CD")));
			obj.setIdLenguaje(Long.parseLong(rs.getString("ID_LENGUAJE")));
			obj.setDescLenguaje(rs.getString("DESC_LENGUAJE"));
			elementosComunesVo.setStatusFlag(Integer.parseInt(rs.getString("STATUS_FLAG")));
			elementosComunesVo.setExpiryDt(Date.valueOf(rs.getString("EXPIRY_DT")));
			elementosComunesVo.setLastUpdateDt(Date.valueOf(rs.getString("LAST_UPDATE_DT")));
			elementosComunesVo.setLastUpdateTxId(Long.parseLong(rs.getString("LAST_UPDATE_TX_ID")));
			elementosComunesVo.setLastUpdateUser(rs.getString("LAST_UPDATE_USER"));
			obj.setElementosComunesVo(elementosComunesVo);

			return obj;
		}

	};

	public String getQryCrearLenguaje() {
		return qryCrearLenguaje;
	}

	public void setQryCrearLenguaje(String qryCrearLenguaje) {
		this.qryCrearLenguaje = qryCrearLenguaje;
	}

	public String getQryModificarLenguaje() {
		return qryModificarLenguaje;
	}

	public void setQryModificarLenguaje(String qryModificarLenguaje) {
		this.qryModificarLenguaje = qryModificarLenguaje;
	}

	public String getQryConsultarLenguaje() {
		return qryConsultarLenguaje;
	}

	public void setQryConsultarLenguaje(String qryConsultarLenguaje) {
		this.qryConsultarLenguaje = qryConsultarLenguaje;
	}

	public String getNextIdLenguaje() {
		return nextIdLenguaje;
	}

	public void setNextIdLenguaje(String nextIdLenguaje) {
		this.nextIdLenguaje = nextIdLenguaje;
	}

}
