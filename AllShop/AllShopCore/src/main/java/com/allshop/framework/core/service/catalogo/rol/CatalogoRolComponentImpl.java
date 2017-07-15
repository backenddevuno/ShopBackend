package com.allshop.framework.core.service.catalogo.rol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoRolOutType;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoRolIn;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoRolOut;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoRolInType;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoRolOutType;
import com.allshop.framework.core.ws.common.estatuscomunes.EstatusComun;
import com.allshop.framework.persistence.catalogo.rol.vo.CatalogoRolVo;
import com.allshop.framework.persistence.common.ElementosComunesVo;
import com.allshop.framework.persistence.common.EstatusComunVo;
import com.allshop.framework.services.catalogos.rol.CatalogoRolService;

@Service
public class CatalogoRolComponentImpl implements CatalogoRolComponent{

	@Autowired
	protected CatalogoRolService catalogoRolService;
	@Override
	public CrearCatalogoRolOut crearCatalogoRolComponent(CrearCatalogoRolIn crearCatalogoRolInType) {
		CrearCatalogoRolOut crearCatalogoRolOutType =  new CrearCatalogoRolOut();
		EstatusComun estatusComun = new EstatusComun();
		CatalogoRolVo catalogoRolVo = new CatalogoRolVo(); 
		ElementosComunesVo elementosComunesVo = new ElementosComunesVo();
		
		catalogoRolVo.setLangTpCd(crearCatalogoRolInType.getCatalogoRol().getLangTpCd());
		catalogoRolVo.setIdRol(crearCatalogoRolInType.getCatalogoRol().getIdRol());
		catalogoRolVo.setDescRol(crearCatalogoRolInType.getCatalogoRol().getDescRol());
		
		elementosComunesVo.setStatusFlag(crearCatalogoRolInType.getCatalogoRol().getElementosComunes().getStatusFlag());
		elementosComunesVo.setExpiryDt(crearCatalogoRolInType.getCatalogoRol().getElementosComunes().getExpiryDt());
		elementosComunesVo.setLastUpdateDt(crearCatalogoRolInType.getCatalogoRol().getElementosComunes().getLastUpdateDt());
		elementosComunesVo.setLastUpdateTxId(crearCatalogoRolInType.getCatalogoRol().getElementosComunes().getLastUpdateTxId());
		elementosComunesVo.setLastUpdateUser(crearCatalogoRolInType.getCatalogoRol().getElementosComunes().getLastUpdateUser());
		
		catalogoRolVo.setElementosComunesVo(elementosComunesVo);
		
		EstatusComunVo estatusComunVo = catalogoRolService.crearCatalogoRolService(catalogoRolVo);
		
		estatusComun.setEstatus(estatusComunVo.getEstatus());
		estatusComun.setDescripcion(estatusComunVo.getDescripcion());
		
		crearCatalogoRolOutType.setEstatusComun(estatusComun);
		

		return crearCatalogoRolOutType;
	}

	@Override
	public ModificarCatalogoRolOutType modificarCatalogoRolComponent(ModificarCatalogoRolInType modificarCatalogoRolInType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultarCatalogoRolOutType consultarCatalogoRolComponent(String idRol) {
		// TODO Auto-generated method stub
		return null;
	}


}
