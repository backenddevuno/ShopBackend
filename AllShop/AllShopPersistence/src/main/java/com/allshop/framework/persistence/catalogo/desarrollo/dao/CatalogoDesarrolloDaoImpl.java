package com.allshop.framework.persistence.catalogo.desarrollo.dao;

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
import com.allshop.framework.persistence.catalogo.desarrollo.vo.CatalogoDesarrolloVo;
import com.allshop.framework.persistence.common.ElementosComunesVo;
import com.allshop.framework.persistence.common.JdbcDao;

public class CatalogoDesarrolloDaoImpl extends JdbcDao implements CatalogoDesarrolloDao {
	private static final Logger log = Logger.getLogger(CatalogoDesarrolloDaoImpl.class);

	private String qryCrearDesarrollo;
	private String qryModificarDesarrollo;
	private String qryConsultarDesarrollo;
	private String nextIdDesarrollo;

	@Override
	public CatalogoDesarrolloVo crearCatalogoDesarrolloDao(final CatalogoDesarrolloVo catalogoDesarrolloVo) throws Exception {

		if (log.isDebugEnabled()) {
			log.debug("crearCatalogoDesarrolloDao...");
		}

		try {
			final int nextIdDes = jdbcTemplate.queryForInt(nextIdDesarrollo);
			
			int affected = jdbcTemplate.update(new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
					PreparedStatement ps = con.prepareStatement(qryCrearDesarrollo);
					ps.setInt(1, nextIdDes);
					ps.setLong(2, catalogoDesarrolloVo.getIdDesarrollo());
					ps.setString(3, catalogoDesarrolloVo.getCodDesarrollo());
					ps.setString(4, catalogoDesarrolloVo.getDescDesarrollo());
					ps.setInt(5, catalogoDesarrolloVo.getElementosComunesVo().getStatusFlag());
					ps.setDate(6, DateUtilsCommons.convertJavaDateToSqlDate(catalogoDesarrolloVo.getElementosComunesVo().getExpiryDt()));
					ps.setDate(7, DateUtilsCommons.convertJavaDateToSqlDate(catalogoDesarrolloVo.getElementosComunesVo().getLastUpdateDt()));
					ps.setInt(8, nextIdDes);
					ps.setString(9, catalogoDesarrolloVo.getElementosComunesVo().getLastUpdateUser());
	
					return ps;
				}
			});

		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return catalogoDesarrolloVo;
	}

	@Override
	public CatalogoDesarrolloVo modificarCatalogoDesarrolloDao(final CatalogoDesarrolloVo catalogoDesarrolloVo)
			throws Exception {
	       if (log.isDebugEnabled()) {
	            log.debug("modificarCatalogoDesarrolloDao...");
	        }
	       try {
		        int affected = jdbcTemplate.update(new PreparedStatementCreator() {
		            public PreparedStatement createPreparedStatement(Connection con)
		                    throws SQLException {
		                PreparedStatement ps = con.prepareStatement(qryModificarDesarrollo);
						
		                ps.setLong(1, catalogoDesarrolloVo.getLangTpCd());
		                ps.setString(2, catalogoDesarrolloVo.getCodDesarrollo());
						ps.setString(3, catalogoDesarrolloVo.getDescDesarrollo());
						ps.setInt(4, catalogoDesarrolloVo.getElementosComunesVo().getStatusFlag());
						ps.setDate(5, (Date) catalogoDesarrolloVo.getElementosComunesVo().getExpiryDt());
						ps.setDate(6, (Date) catalogoDesarrolloVo.getElementosComunesVo().getLastUpdateDt());
						ps.setLong(7, catalogoDesarrolloVo.getElementosComunesVo().getLastUpdateTxId());
						ps.setString(8, catalogoDesarrolloVo.getElementosComunesVo().getLastUpdateUser());
						ps.setLong(9, catalogoDesarrolloVo.getIdDesarrollo());
		                return ps;
		            }
		        });

		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return catalogoDesarrolloVo;
	}

	@Override
	public List<CatalogoDesarrolloVo> consultarCatalogoDesarrolloDao(String idDesarrollo) throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("consultarCatalogoDesarrolloDao...");
		}

		List<Object> parameters = new ArrayList<Object>();
		parameters.add(idDesarrollo);
		Object[] args = parameters.toArray();
		List<CatalogoDesarrolloVo> consultarCatalogoDesarrolloDao = null;

		try {
			consultarCatalogoDesarrolloDao = (List<CatalogoDesarrolloVo>) jdbcTemplate.query(qryConsultarDesarrollo, args,
					MAPPER_CAT_DESA);
		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return consultarCatalogoDesarrolloDao;
	}

	private static ParameterizedRowMapper<CatalogoDesarrolloVo> MAPPER_CAT_DESA = new ParameterizedRowMapper<CatalogoDesarrolloVo>() {
		public CatalogoDesarrolloVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			CatalogoDesarrolloVo obj = new CatalogoDesarrolloVo();
			ElementosComunesVo elementosComunesVo = new ElementosComunesVo();

			obj.setLangTpCd(Long.parseLong(rs.getString("LANG_TP_CD")));
			obj.setIdDesarrollo(Long.parseLong(rs.getString("ID_DESARROLLO")));
			obj.setCodDesarrollo(rs.getString("COD_DESARROLLO"));
			obj.setDescDesarrollo(rs.getString("DESC_DESARROLLO"));
			elementosComunesVo.setStatusFlag(Integer.parseInt(rs.getString("STATUS_FLAG")));
			elementosComunesVo.setExpiryDt(Date.valueOf(rs.getString("EXPIRY_DT")));
			elementosComunesVo.setLastUpdateDt(Date.valueOf(rs.getString("LAST_UPDATE_DT")));
			elementosComunesVo.setLastUpdateTxId(Long.parseLong(rs.getString("LAST_UPDATE_TX_ID")));
			elementosComunesVo.setLastUpdateUser(rs.getString("LAST_UPDATE_USER"));
			obj.setElementosComunesVo(elementosComunesVo);

			return obj;
		}

	};

	public String getQryCrearDesarrollo() {
		return qryCrearDesarrollo;
	}

	public void setQryCrearDesarrollo(String qryCrearDesarrollo) {
		this.qryCrearDesarrollo = qryCrearDesarrollo;
	}

	public String getQryModificarDesarrollo() {
		return qryModificarDesarrollo;
	}

	public void setQryModificarDesarrollo(String qryModificarDesarrollo) {
		this.qryModificarDesarrollo = qryModificarDesarrollo;
	}

	public String getQryConsultarDesarrollo() {
		return qryConsultarDesarrollo;
	}

	public void setQryConsultarDesarrollo(String qryConsultarDesarrollo) {
		this.qryConsultarDesarrollo = qryConsultarDesarrollo;
	}

	public String getNextIdDesarrollo() {
		return nextIdDesarrollo;
	}

	public void setNextIdDesarrollo(String nextIdDesarrollo) {
		this.nextIdDesarrollo = nextIdDesarrollo;
	}

}
