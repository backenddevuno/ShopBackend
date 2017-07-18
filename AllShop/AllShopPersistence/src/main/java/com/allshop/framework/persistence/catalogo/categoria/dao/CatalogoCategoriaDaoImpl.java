package com.allshop.framework.persistence.catalogo.categoria.dao;

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
import com.allshop.framework.persistence.catalogo.categoria.vo.CatalogoCategoriaVo;
import com.allshop.framework.persistence.common.ElementosComunesVo;
import com.allshop.framework.persistence.common.JdbcDao;

public class CatalogoCategoriaDaoImpl extends JdbcDao implements CatalogoCategoriaDao {
	private static final Logger log = Logger.getLogger(CatalogoCategoriaDaoImpl.class);

	private String qryCrearCategoria;
	private String qryModificarCategoria;
	private String qryConsultarCategoria;
	private String nextIdCategoria;

	@Override
	public CatalogoCategoriaVo crearCatalogoCategoriaDao(final CatalogoCategoriaVo catalogoCategoriaVo) throws Exception {

		if (log.isDebugEnabled()) {
			log.debug("crearCatalogoCategoriaDao...");
		}

		try {
			final int nextIdCat = jdbcTemplate.queryForInt(nextIdCategoria);
			
			int affected = jdbcTemplate.update(new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
					PreparedStatement ps = con.prepareStatement(qryCrearCategoria);
					ps.setInt(1, nextIdCat);
					ps.setLong(2, catalogoCategoriaVo.getIdCategoria());
					ps.setString(3, catalogoCategoriaVo.getDescCategoria());
					ps.setInt(4, catalogoCategoriaVo.getElementosComunesVo().getStatusFlag());
					ps.setDate(5, DateUtilsCommons.convertJavaDateToSqlDate(catalogoCategoriaVo.getElementosComunesVo().getExpiryDt()));
					ps.setDate(6, DateUtilsCommons.convertJavaDateToSqlDate(catalogoCategoriaVo.getElementosComunesVo().getLastUpdateDt()));
					ps.setInt(7, nextIdCat);
					ps.setString(8, catalogoCategoriaVo.getElementosComunesVo().getLastUpdateUser());
	
					return ps;
				}
			});

		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return catalogoCategoriaVo;
	}

	@Override
	public CatalogoCategoriaVo modificarCatalogoCategoriaDao(final CatalogoCategoriaVo catalogoCategoriaVo) throws Exception {
	       if (log.isDebugEnabled()) {
	            log.debug("modificarCatalogoCategoriaDao...");
	        }
	       try {
		        int affected = jdbcTemplate.update(new PreparedStatementCreator() {
		            public PreparedStatement createPreparedStatement(Connection con)
		                    throws SQLException {
		                PreparedStatement ps = con.prepareStatement(qryModificarCategoria);
						
		                ps.setLong(1, catalogoCategoriaVo.getLangTpCd());
						ps.setString(2, catalogoCategoriaVo.getDescCategoria());
						ps.setInt(3, catalogoCategoriaVo.getElementosComunesVo().getStatusFlag());
						ps.setDate(4, (Date) catalogoCategoriaVo.getElementosComunesVo().getExpiryDt());
						ps.setDate(5, (Date) catalogoCategoriaVo.getElementosComunesVo().getLastUpdateDt());
						ps.setLong(6, catalogoCategoriaVo.getElementosComunesVo().getLastUpdateTxId());
						ps.setString(7, catalogoCategoriaVo.getElementosComunesVo().getLastUpdateUser());
						ps.setLong(8, catalogoCategoriaVo.getIdCategoria());
		                return ps;
		            }
		        });

		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return catalogoCategoriaVo;
	}

	@Override
	public List<CatalogoCategoriaVo> consultarCatalogoCategoriaDao(String idCategoria) throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("consultarCatalogoPagoDao...");
		}

		List<Object> parameters = new ArrayList<Object>();
		parameters.add(idCategoria);
		Object[] args = parameters.toArray();
		List<CatalogoCategoriaVo> consultarCatalogoCategoriaDao = null;

		try {
			consultarCatalogoCategoriaDao = (List<CatalogoCategoriaVo>) jdbcTemplate.query(qryConsultarCategoria, args,
					MAPPER_CAT_CATEGORIA);
		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return consultarCatalogoCategoriaDao;
	}

	private static ParameterizedRowMapper<CatalogoCategoriaVo> MAPPER_CAT_CATEGORIA = new ParameterizedRowMapper<CatalogoCategoriaVo>() {
		public CatalogoCategoriaVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			CatalogoCategoriaVo obj = new CatalogoCategoriaVo();
			ElementosComunesVo elementosComunesVo = new ElementosComunesVo();

			obj.setLangTpCd(Long.parseLong(rs.getString("LANG_TP_CD")));
			obj.setIdCategoria(Long.parseLong(rs.getString("ID_CATEGORIA")));
			obj.setDescCategoria(rs.getString("DESC_CATEGORIA"));
			elementosComunesVo.setStatusFlag(Integer.parseInt(rs.getString("STATUS_FLAG")));
			elementosComunesVo.setExpiryDt(Date.valueOf(rs.getString("EXPIRY_DT")));
			elementosComunesVo.setLastUpdateDt(Date.valueOf(rs.getString("LAST_UPDATE_DT")));
			elementosComunesVo.setLastUpdateTxId(Long.parseLong(rs.getString("LAST_UPDATE_TX_ID")));
			elementosComunesVo.setLastUpdateUser(rs.getString("LAST_UPDATE_USER"));
			obj.setElementosComunesVo(elementosComunesVo);

			return obj;
		}

	};

	public String getQryCrearCategoria() {
		return qryCrearCategoria;
	}

	public void setQryCrearCategoria(String qryCrearCategoria) {
		this.qryCrearCategoria = qryCrearCategoria;
	}

	public String getQryModificarCategoria() {
		return qryModificarCategoria;
	}

	public void setQryModificarCategoria(String qryModificarCategoria) {
		this.qryModificarCategoria = qryModificarCategoria;
	}

	public String getQryConsultarCategoria() {
		return qryConsultarCategoria;
	}

	public void setQryConsultarCategoria(String qryConsultarCategoria) {
		this.qryConsultarCategoria = qryConsultarCategoria;
	}

	public String getNextIdCategoria() {
		return nextIdCategoria;
	}

	public void setNextIdCategoria(String nextIdCategoria) {
		this.nextIdCategoria = nextIdCategoria;
	}

}
