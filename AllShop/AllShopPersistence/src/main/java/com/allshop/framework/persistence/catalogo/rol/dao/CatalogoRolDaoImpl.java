package com.allshop.framework.persistence.catalogo.rol.dao;

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

import com.allshop.framework.persistence.catalogo.rol.vo.CatalogoRolVo;
import com.allshop.framework.persistence.common.ElementosComunesVo;
import com.allshop.framework.persistence.common.EstatusComunVo;
import com.allshop.framework.persistence.common.JdbcDao;

public class CatalogoRolDaoImpl extends JdbcDao implements CatalogoRolDao {

	private static final Logger log = Logger.getLogger(CatalogoRolDaoImpl.class);
	
	private String qryCrearRol;
	private String qryModificarRol;
	private String qryConsultarRol;
	private String nextIdRol;
	
	private EstatusComunVo estatusComunVo = null;  
	
	@Override
	public CatalogoRolVo crearCatalogoRolDao(final CatalogoRolVo catalogoRolVo) {

		if (log.isDebugEnabled()) {
			log.debug("crearCatalogoRol...");
		}

		final int idRol = jdbcTemplate.queryForInt(nextIdRol);

		try {
			int affected = jdbcTemplate.update(new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
					PreparedStatement ps = con.prepareStatement(qryCrearRol);
					ps.setInt(1, idRol);
					ps.setLong(2, catalogoRolVo.getIdRol());
					ps.setString(3, catalogoRolVo.getDescRol());
					ps.setInt(4, catalogoRolVo.getElementosComunesVo().getStatusFlag());
					ps.setDate(5, (Date) catalogoRolVo.getElementosComunesVo().getExpiryDt());
					ps.setDate(6, (Date) catalogoRolVo.getElementosComunesVo().getLastUpdateDt());
					ps.setInt(7, idRol);
					ps.setString(8, catalogoRolVo.getElementosComunesVo().getLastUpdateUser());
	
					return ps;
				}
			});
		} catch(Exception ex){
			estatusComunVo =  new EstatusComunVo();
			estatusComunVo.setEstatus(ex.getLocalizedMessage());
			estatusComunVo.setDescripcion(ex.getMessage());
			ex.printStackTrace();
		}
		// Importante verificar que afectamos exactamente un registro.
//		this.checkAffected(affected);
		return new CatalogoRolVo();
	}

	@Override
	public CatalogoRolVo modificarCatalogoRolDao(final CatalogoRolVo catalogoRolVo) {
	       if (log.isDebugEnabled()) {
	            log.debug("modificarCatalogoRol...");
	        }
	       try {
		        int affected = jdbcTemplate.update(new PreparedStatementCreator() {
		            public PreparedStatement createPreparedStatement(Connection con)
		                    throws SQLException {
		                PreparedStatement ps = con.prepareStatement(qryModificarRol);
						
		                ps.setLong(1, catalogoRolVo.getLangTpCd());
						ps.setString(2, catalogoRolVo.getDescRol());
						ps.setInt(3, catalogoRolVo.getElementosComunesVo().getStatusFlag());
						ps.setDate(4, (Date) catalogoRolVo.getElementosComunesVo().getExpiryDt());
						ps.setDate(5, (Date) catalogoRolVo.getElementosComunesVo().getLastUpdateDt());
						ps.setLong(6, catalogoRolVo.getIdRol());
						ps.setString(7, catalogoRolVo.getElementosComunesVo().getLastUpdateUser());
						ps.setLong(8, catalogoRolVo.getIdRol());
		                return ps;
		            }
		        });
			} catch(Exception ex){
				estatusComunVo =  new EstatusComunVo();
				estatusComunVo.setEstatus(ex.getLocalizedMessage());
				estatusComunVo.setDescripcion(ex.getMessage());
				ex.printStackTrace();
			}
	        // Importante verificar que afectamos exactamente un registro.
//	        this.checkAffected(affected);
		return new CatalogoRolVo();
	}

    private static ParameterizedRowMapper<CatalogoRolVo> MAPPER = new ParameterizedRowMapper<CatalogoRolVo>() {
        public CatalogoRolVo mapRow(ResultSet rs, int rowNum) throws SQLException {
        	CatalogoRolVo obj = new CatalogoRolVo();
        	ElementosComunesVo elementosComunesVo = new ElementosComunesVo();

        	obj.setLangTpCd(Long.parseLong(rs.getString("LANG_TP_CD")));
            obj.setIdRol(Long.parseLong(rs.getString("ID_ROL")));
            obj.setDescRol(rs.getString("DESC_ROL"));
            elementosComunesVo.setStatusFlag(Integer.parseInt(rs.getString("STATUS_FLAG")));
            elementosComunesVo.setExpiryDt(Date.valueOf(rs.getString("EXPIRY_DT")));
            elementosComunesVo.setLastUpdateDt(Date.valueOf(rs.getString("LAST_UPDATE_DT")));
            elementosComunesVo.setLastUpdateTxId(Long.parseLong(rs.getString("LAST_UPDATE_TX_ID")));
            elementosComunesVo.setLastUpdateUser(rs.getString("LAST_UPDATE_USER"));
            obj.setElementosComunesVo(elementosComunesVo);
            
            return obj;
        }

    };
    
	@Override
	public List<CatalogoRolVo> consultarCatalogoRolDao(String idRol) {
        if (log.isDebugEnabled()) {
            log.debug("consultarCatalogoRol...");
        }
        
        List<Object> parameters = new ArrayList<Object>();
        parameters.add(idRol);
        Object[] args = parameters.toArray();
        return (List<CatalogoRolVo>) jdbcTemplate.query(qryConsultarRol, args, MAPPER);
	}

    public List<CatalogoRolVo> getRoles() {

        if (log.isDebugEnabled()) {
            log.debug("getRoles...");
        }
        return (List<CatalogoRolVo>) jdbcTemplate.query(qryConsultarRol, MAPPER);
    }
    
	public void setQryCrearRol(String qryCrearRol) {
		this.qryCrearRol = qryCrearRol;
	}

	public void setQryModificarRol(String qryModificarRol) {
		this.qryModificarRol = qryModificarRol;
	}

	public void setQryConsultarRol(String qryConsultarRol) {
		this.qryConsultarRol = qryConsultarRol;
	}

	public void setNextIdRol(String nextIdRol) {
		this.nextIdRol = nextIdRol;
	}

}
