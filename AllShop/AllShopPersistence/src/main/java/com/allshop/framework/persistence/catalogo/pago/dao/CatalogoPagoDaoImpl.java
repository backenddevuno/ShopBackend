package com.allshop.framework.persistence.catalogo.pago.dao;

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
import com.allshop.framework.persistence.catalogo.pago.vo.CatalogoPagoVo;
import com.allshop.framework.persistence.common.ElementosComunesVo;
import com.allshop.framework.persistence.common.JdbcDao;

public class CatalogoPagoDaoImpl extends JdbcDao implements CatalogoPagoDao {
	private static final Logger log = Logger.getLogger(CatalogoPagoDaoImpl.class);

	private String qryCrearPago;
	private String qryModificarPago;
	private String qryConsultarPago;
	private String nextIdPago;

	@Override
	public CatalogoPagoVo crearCatalogoPagoDao(final CatalogoPagoVo catalogoPagoVo) throws Exception {

		if (log.isDebugEnabled()) {
			log.debug("crearCatalogoPagoDao...");
		}

		try {
			final int nextIdPag = jdbcTemplate.queryForInt(nextIdPago);
			
			int affected = jdbcTemplate.update(new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
					PreparedStatement ps = con.prepareStatement(qryCrearPago);
					ps.setInt(1, nextIdPag);
					ps.setLong(2, catalogoPagoVo.getIdPago());
					ps.setString(3, catalogoPagoVo.getCodPago());
					ps.setString(4, catalogoPagoVo.getDescPago());
					ps.setInt(5, catalogoPagoVo.getElementosComunesVo().getStatusFlag());
					ps.setDate(6, DateUtilsCommons.convertJavaDateToSqlDate(catalogoPagoVo.getElementosComunesVo().getExpiryDt()));
					ps.setDate(7, DateUtilsCommons.convertJavaDateToSqlDate(catalogoPagoVo.getElementosComunesVo().getLastUpdateDt()));
					ps.setInt(8, nextIdPag);
					ps.setString(9, catalogoPagoVo.getElementosComunesVo().getLastUpdateUser());
	
					return ps;
				}
			});

		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return catalogoPagoVo;
	}

	@Override
	public CatalogoPagoVo modificarCatalogoPagoDao(final CatalogoPagoVo catalogoPagoVo) throws Exception {
	       if (log.isDebugEnabled()) {
	            log.debug("modificarCatalogoPagoDao...");
	        }
	       try {
		        int affected = jdbcTemplate.update(new PreparedStatementCreator() {
		            public PreparedStatement createPreparedStatement(Connection con)
		                    throws SQLException {
		                PreparedStatement ps = con.prepareStatement(qryModificarPago);
						
		                ps.setLong(1, catalogoPagoVo.getLangTpCd());
		                ps.setString(2, catalogoPagoVo.getCodPago());
						ps.setString(3, catalogoPagoVo.getDescPago());
						ps.setInt(4, catalogoPagoVo.getElementosComunesVo().getStatusFlag());
						ps.setDate(5, (Date) catalogoPagoVo.getElementosComunesVo().getExpiryDt());
						ps.setDate(6, (Date) catalogoPagoVo.getElementosComunesVo().getLastUpdateDt());
						ps.setLong(7, catalogoPagoVo.getElementosComunesVo().getLastUpdateTxId());
						ps.setString(8, catalogoPagoVo.getElementosComunesVo().getLastUpdateUser());
						ps.setLong(9, catalogoPagoVo.getIdPago());
		                return ps;
		            }
		        });

		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return catalogoPagoVo;
	}

	@Override
	public List<CatalogoPagoVo> consultarCatalogoPagoDao(String idPago) throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("consultarCatalogoPagoDao...");
		}

		List<Object> parameters = new ArrayList<Object>();
		parameters.add(idPago);
		Object[] args = parameters.toArray();
		List<CatalogoPagoVo> consultarCatalogoPagoDao = null;

		try {
			consultarCatalogoPagoDao = (List<CatalogoPagoVo>) jdbcTemplate.query(qryConsultarPago, args,
					MAPPER_CAT_PAGO);
		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return consultarCatalogoPagoDao;
	}

	private static ParameterizedRowMapper<CatalogoPagoVo> MAPPER_CAT_PAGO = new ParameterizedRowMapper<CatalogoPagoVo>() {
		public CatalogoPagoVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			CatalogoPagoVo obj = new CatalogoPagoVo();
			ElementosComunesVo elementosComunesVo = new ElementosComunesVo();

			obj.setLangTpCd(Long.parseLong(rs.getString("LANG_TP_CD")));
			obj.setIdPago(Long.parseLong(rs.getString("ID_PAGO")));
			obj.setCodPago(rs.getString("COD_PAGO"));
			obj.setDescPago(rs.getString("DESC_PAGO"));
			elementosComunesVo.setStatusFlag(Integer.parseInt(rs.getString("STATUS_FLAG")));
			elementosComunesVo.setExpiryDt(Date.valueOf(rs.getString("EXPIRY_DT")));
			elementosComunesVo.setLastUpdateDt(Date.valueOf(rs.getString("LAST_UPDATE_DT")));
			elementosComunesVo.setLastUpdateTxId(Long.parseLong(rs.getString("LAST_UPDATE_TX_ID")));
			elementosComunesVo.setLastUpdateUser(rs.getString("LAST_UPDATE_USER"));
			obj.setElementosComunesVo(elementosComunesVo);

			return obj;
		}

	};

	public String getQryCrearPago() {
		return qryCrearPago;
	}

	public void setQryCrearPago(String qryCrearPago) {
		this.qryCrearPago = qryCrearPago;
	}

	public String getQryModificarPago() {
		return qryModificarPago;
	}

	public void setQryModificarPago(String qryModificarPago) {
		this.qryModificarPago = qryModificarPago;
	}

	public String getQryConsultarPago() {
		return qryConsultarPago;
	}

	public void setQryConsultarPago(String qryConsultarPago) {
		this.qryConsultarPago = qryConsultarPago;
	}

	public String getNextIdPago() {
		return nextIdPago;
	}

	public void setNextIdPago(String nextIdPago) {
		this.nextIdPago = nextIdPago;
	}

}
