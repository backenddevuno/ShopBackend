package com.allshop.framework.persistence.catalogo.moneda.dao;

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
import com.allshop.framework.persistence.catalogo.moneda.vo.CatalogoMonedaVo;
import com.allshop.framework.persistence.common.ElementosComunesVo;
import com.allshop.framework.persistence.common.JdbcDao;

public class CatalogoMonedaDaoImpl extends JdbcDao implements CatalogoMonedaDao {
	private static final Logger log = Logger.getLogger(CatalogoMonedaDaoImpl.class);

	private String qryCrearMoneda;
	private String qryModificarMoneda;
	private String qryConsultarMoneda;
	private String nextIdMoneda;

	@Override
	public CatalogoMonedaVo crearCatalogoMonedaDao(final CatalogoMonedaVo catalogoMonedaVo) throws Exception {

		if (log.isDebugEnabled()) {
			log.debug("crearCatalogoMonedaDao...");
		}

		try {
			final int nextIdMon = jdbcTemplate.queryForInt(nextIdMoneda);
			
			int affected = jdbcTemplate.update(new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
					PreparedStatement ps = con.prepareStatement(qryCrearMoneda);
					ps.setInt(1, nextIdMon);
					ps.setLong(2, catalogoMonedaVo.getIdMoneda());
					ps.setString(3, catalogoMonedaVo.getCodMoneda());
					ps.setString(4, catalogoMonedaVo.getDescMoneda());
					ps.setInt(5, catalogoMonedaVo.getElementosComunesVo().getStatusFlag());
					ps.setDate(6, DateUtilsCommons.convertJavaDateToSqlDate(catalogoMonedaVo.getElementosComunesVo().getExpiryDt()));
					ps.setDate(7, DateUtilsCommons.convertJavaDateToSqlDate(catalogoMonedaVo.getElementosComunesVo().getLastUpdateDt()));
					ps.setInt(8, nextIdMon);
					ps.setString(9, catalogoMonedaVo.getElementosComunesVo().getLastUpdateUser());
	
					return ps;
				}
			});

		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return catalogoMonedaVo;
	}

	@Override
	public CatalogoMonedaVo modificarCatalogoMonedaDao(final CatalogoMonedaVo catalogoMonedaVo) throws Exception {
	       if (log.isDebugEnabled()) {
	            log.debug("modificarCatalogoMonedaDao...");
	        }
	       try {
		        int affected = jdbcTemplate.update(new PreparedStatementCreator() {
		            public PreparedStatement createPreparedStatement(Connection con)
		                    throws SQLException {
		                PreparedStatement ps = con.prepareStatement(qryModificarMoneda);
						
		                ps.setLong(1, catalogoMonedaVo.getLangTpCd());
		                ps.setString(2, catalogoMonedaVo.getCodMoneda());
						ps.setString(3, catalogoMonedaVo.getDescMoneda());
						ps.setInt(4, catalogoMonedaVo.getElementosComunesVo().getStatusFlag());
						ps.setDate(5, (Date) catalogoMonedaVo.getElementosComunesVo().getExpiryDt());
						ps.setDate(6, (Date) catalogoMonedaVo.getElementosComunesVo().getLastUpdateDt());
						ps.setLong(7, catalogoMonedaVo.getElementosComunesVo().getLastUpdateTxId());
						ps.setString(8, catalogoMonedaVo.getElementosComunesVo().getLastUpdateUser());
						ps.setLong(9, catalogoMonedaVo.getIdMoneda());
		                return ps;
		            }
		        });

		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return catalogoMonedaVo;
	}

	@Override
	public List<CatalogoMonedaVo> consultarCatalogoMonedaDao(String idMoneda) throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("consultarCatalogoMonedaDao...");
		}

		List<Object> parameters = new ArrayList<Object>();
		parameters.add(idMoneda);
		Object[] args = parameters.toArray();
		List<CatalogoMonedaVo> consultarCatalogoMonedaDao = null;

		try {
			consultarCatalogoMonedaDao = (List<CatalogoMonedaVo>) jdbcTemplate.query(qryConsultarMoneda, args,
					MAPPER_CAT_MONEDA);
		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return consultarCatalogoMonedaDao;
	}

	private static ParameterizedRowMapper<CatalogoMonedaVo> MAPPER_CAT_MONEDA = new ParameterizedRowMapper<CatalogoMonedaVo>() {
		public CatalogoMonedaVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			CatalogoMonedaVo obj = new CatalogoMonedaVo();
			ElementosComunesVo elementosComunesVo = new ElementosComunesVo();

			obj.setLangTpCd(Long.parseLong(rs.getString("LANG_TP_CD")));
			obj.setIdMoneda(Long.parseLong(rs.getString("ID_MONEDA")));
			obj.setCodMoneda(rs.getString("COD_MONEDA"));
			obj.setDescMoneda(rs.getString("DESC_MONEDA"));
			elementosComunesVo.setStatusFlag(Integer.parseInt(rs.getString("STATUS_FLAG")));
			elementosComunesVo.setExpiryDt(Date.valueOf(rs.getString("EXPIRY_DT")));
			elementosComunesVo.setLastUpdateDt(Date.valueOf(rs.getString("LAST_UPDATE_DT")));
			elementosComunesVo.setLastUpdateTxId(Long.parseLong(rs.getString("LAST_UPDATE_TX_ID")));
			elementosComunesVo.setLastUpdateUser(rs.getString("LAST_UPDATE_USER"));
			obj.setElementosComunesVo(elementosComunesVo);

			return obj;
		}

	};

	public String getQryCrearMoneda() {
		return qryCrearMoneda;
	}

	public void setQryCrearMoneda(String qryCrearMoneda) {
		this.qryCrearMoneda = qryCrearMoneda;
	}

	public String getQryModificarMoneda() {
		return qryModificarMoneda;
	}

	public void setQryModificarMoneda(String qryModificarMoneda) {
		this.qryModificarMoneda = qryModificarMoneda;
	}

	public String getQryConsultarMoneda() {
		return qryConsultarMoneda;
	}

	public void setQryConsultarMoneda(String qryConsultarMoneda) {
		this.qryConsultarMoneda = qryConsultarMoneda;
	}

	public String getNextIdMoneda() {
		return nextIdMoneda;
	}

	public void setNextIdMoneda(String nextIdMoneda) {
		this.nextIdMoneda = nextIdMoneda;
	}

}
