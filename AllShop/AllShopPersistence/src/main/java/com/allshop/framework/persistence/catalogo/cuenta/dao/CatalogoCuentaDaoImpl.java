package com.allshop.framework.persistence.catalogo.cuenta.dao;

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
import com.allshop.framework.persistence.catalogo.cuenta.vo.CatalogoCuentaVo;
import com.allshop.framework.persistence.common.ElementosComunesVo;
import com.allshop.framework.persistence.common.JdbcDao;

public class CatalogoCuentaDaoImpl extends JdbcDao implements CatalogoCuentaDao {
	private static final Logger log = Logger.getLogger(CatalogoCuentaDaoImpl.class);

	private String qryCrearCuenta;
	private String qryModificarCuenta;
	private String qryConsultarCuenta;
	private String nextIdCuenta;

	@Override
	public CatalogoCuentaVo crearCatalogoCuentaDao(final CatalogoCuentaVo catalogoCuentaVo) throws Exception {

		if (log.isDebugEnabled()) {
			log.debug("crearCatalogoCuentaDao...");
		}

		try {
			final int nextId = jdbcTemplate.queryForInt(nextIdCuenta);
			
			int affected = jdbcTemplate.update(new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
					PreparedStatement ps = con.prepareStatement(qryCrearCuenta);
					ps.setInt(1, nextId);
					ps.setLong(2, catalogoCuentaVo.getIdCuenta());
					ps.setString(3, catalogoCuentaVo.getDescCuenta());
					ps.setInt(4, catalogoCuentaVo.getElementosComunesVo().getStatusFlag());
					ps.setDate(5, DateUtilsCommons.convertJavaDateToSqlDate(catalogoCuentaVo.getElementosComunesVo().getExpiryDt()));
					ps.setDate(6, DateUtilsCommons.convertJavaDateToSqlDate(catalogoCuentaVo.getElementosComunesVo().getLastUpdateDt()));
					ps.setInt(7, nextId);
					ps.setString(8, catalogoCuentaVo.getElementosComunesVo().getLastUpdateUser());
	
					return ps;
				}
			});

		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return catalogoCuentaVo;
	}

	@Override
	public CatalogoCuentaVo modificarCatalogoCuentaDao(final CatalogoCuentaVo catalogoCuentaVo) throws Exception {
	       if (log.isDebugEnabled()) {
	            log.debug("modificarCatalogoCuentaDao...");
	        }
	       try {
		        int affected = jdbcTemplate.update(new PreparedStatementCreator() {
		            public PreparedStatement createPreparedStatement(Connection con)
		                    throws SQLException {
		                PreparedStatement ps = con.prepareStatement(qryModificarCuenta);
						
		                ps.setLong(1, catalogoCuentaVo.getLangTpCd());
						ps.setString(2, catalogoCuentaVo.getDescCuenta());
						ps.setInt(3, catalogoCuentaVo.getElementosComunesVo().getStatusFlag());
						ps.setDate(4, (Date) catalogoCuentaVo.getElementosComunesVo().getExpiryDt());
						ps.setDate(5, (Date) catalogoCuentaVo.getElementosComunesVo().getLastUpdateDt());
						ps.setLong(6, catalogoCuentaVo.getElementosComunesVo().getLastUpdateTxId());
						ps.setString(7, catalogoCuentaVo.getElementosComunesVo().getLastUpdateUser());
						ps.setLong(8, catalogoCuentaVo.getIdCuenta());
		                return ps;
		            }
		        });

		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return catalogoCuentaVo;
	}

	@Override
	public List<CatalogoCuentaVo> consultarCatalogoCuentaDao(String idCuenta) throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("consultarCatalogoCuentaDao...");
		}

		List<Object> parameters = new ArrayList<Object>();
		parameters.add(idCuenta);
		Object[] args = parameters.toArray();
		List<CatalogoCuentaVo> consultarCatalogoCuentaDao = null;

		try {
			consultarCatalogoCuentaDao = (List<CatalogoCuentaVo>) jdbcTemplate.query(qryConsultarCuenta, args,
					MAPPER_CAT_CUENTA);
		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return consultarCatalogoCuentaDao;
	}

	private static ParameterizedRowMapper<CatalogoCuentaVo> MAPPER_CAT_CUENTA = new ParameterizedRowMapper<CatalogoCuentaVo>() {
		public CatalogoCuentaVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			CatalogoCuentaVo obj = new CatalogoCuentaVo();
			ElementosComunesVo elementosComunesVo = new ElementosComunesVo();

			obj.setLangTpCd(Long.parseLong(rs.getString("LANG_TP_CD")));
			obj.setIdCuenta(Long.parseLong(rs.getString("ID_CUENTA")));
			obj.setDescCuenta(rs.getString("DESC_CUENTA"));
			elementosComunesVo.setStatusFlag(Integer.parseInt(rs.getString("STATUS_FLAG")));
			elementosComunesVo.setExpiryDt(Date.valueOf(rs.getString("EXPIRY_DT")));
			elementosComunesVo.setLastUpdateDt(Date.valueOf(rs.getString("LAST_UPDATE_DT")));
			elementosComunesVo.setLastUpdateTxId(Long.parseLong(rs.getString("LAST_UPDATE_TX_ID")));
			elementosComunesVo.setLastUpdateUser(rs.getString("LAST_UPDATE_USER"));
			obj.setElementosComunesVo(elementosComunesVo);

			return obj;
		}

	};

	public String getQryCrearCuenta() {
		return qryCrearCuenta;
	}

	public void setQryCrearCuenta(String qryCrearCuenta) {
		this.qryCrearCuenta = qryCrearCuenta;
	}

	public String getQryModificarCuenta() {
		return qryModificarCuenta;
	}

	public void setQryModificarCuenta(String qryModificarCuenta) {
		this.qryModificarCuenta = qryModificarCuenta;
	}

	public String getQryConsultarCuenta() {
		return qryConsultarCuenta;
	}

	public void setQryConsultarCuenta(String qryConsultarCuenta) {
		this.qryConsultarCuenta = qryConsultarCuenta;
	}

	public String getNextIdCuenta() {
		return nextIdCuenta;
	}

	public void setNextIdCuenta(String nextIdCuenta) {
		this.nextIdCuenta = nextIdCuenta;
	}

}
