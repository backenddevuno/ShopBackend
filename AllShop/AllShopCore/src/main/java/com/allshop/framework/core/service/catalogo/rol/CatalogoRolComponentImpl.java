package com.allshop.framework.core.service.catalogo.rol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.commons.utils.date.DateUtilsCommons;
import com.allshop.framework.core.ws.catalogoscorporativos.CatalogoRol;
import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoRolOut;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoRolIn;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoRolOut;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoRolIn;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoRolOut;
import com.allshop.framework.persistence.catalogo.rol.vo.CatalogoRolVo;
import com.allshop.framework.persistence.common.ElementosComunesVo;
import com.allshop.framework.services.catalogos.rol.CatalogoRolService;

@Service
public class CatalogoRolComponentImpl implements CatalogoRolComponent{

	@Autowired
	protected CatalogoRolService catalogoRolService;
	@Override
	public CrearCatalogoRolOut crearCatalogoRolComponent(CrearCatalogoRolIn crearCatalogoRolInType) throws Exception {
		CrearCatalogoRolOut crearCatalogoRolOut =  new CrearCatalogoRolOut();
		CatalogoRolVo catalogoRolVo = new CatalogoRolVo(); 
		ElementosComunesVo elementosComunesVo = new ElementosComunesVo();
		CatalogoRol catalogoRol = new CatalogoRol();
		
		try{
			
			catalogoRolVo.setLangTpCd(crearCatalogoRolInType.getCatalogoRol().getLangTpCd());
			catalogoRolVo.setIdRol(crearCatalogoRolInType.getCatalogoRol().getIdRol());
			catalogoRolVo.setDescRol(crearCatalogoRolInType.getCatalogoRol().getDescRol());
			
			elementosComunesVo.setStatusFlag(crearCatalogoRolInType.getCatalogoRol().getElementosComunes().getStatusFlag());
			elementosComunesVo.setExpiryDt(DateUtilsCommons.toDate(crearCatalogoRolInType.getCatalogoRol().getElementosComunes().getExpiryDt()));
			elementosComunesVo.setLastUpdateDt(DateUtilsCommons.toDate(crearCatalogoRolInType.getCatalogoRol().getElementosComunes().getLastUpdateDt()));
			elementosComunesVo.setLastUpdateTxId(crearCatalogoRolInType.getCatalogoRol().getElementosComunes().getLastUpdateTxId());
			elementosComunesVo.setLastUpdateUser(crearCatalogoRolInType.getCatalogoRol().getElementosComunes().getLastUpdateUser());
			
			catalogoRolVo.setElementosComunesVo(elementosComunesVo);
			
			CatalogoRolVo catalogoRolVoOut = catalogoRolService.crearCatalogoRolService(catalogoRolVo);
			catalogoRol.setLangTpCd(catalogoRolVoOut.getLangTpCd());
			catalogoRol.setIdRol(catalogoRolVoOut.getIdRol());
			catalogoRol.setDescRol(catalogoRolVoOut.getDescRol());
			
			crearCatalogoRolOut.setCatalogoRol(catalogoRol);

		}catch(Exception ex){
			throw new Exception(ex);
		}
		
		return crearCatalogoRolOut;
	}

	@Override
	public ModificarCatalogoRolOut modificarCatalogoRolComponent(ModificarCatalogoRolIn modificarCatalogoRolIn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultarCatalogoRolOut consultarCatalogoRolComponent(String idRol) {
		// TODO Auto-generated method stub
		return null;
	}


}
