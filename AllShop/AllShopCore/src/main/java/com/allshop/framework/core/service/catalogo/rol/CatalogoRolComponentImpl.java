package com.allshop.framework.core.service.catalogo.rol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allshop.framework.commons.utils.date.DateUtilsCommons;
import com.allshop.framework.core.ws.catalogoscorporativos.CatalogoRol;
import com.allshop.framework.core.ws.catalogoscorporativos.ConsultarCatalogoRolOut;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoRolIn;
import com.allshop.framework.core.ws.catalogoscorporativos.CrearCatalogoRolOut;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoRolIn;
import com.allshop.framework.core.ws.catalogoscorporativos.ModificarCatalogoRolOut;
import com.allshop.framework.core.ws.common.elementoscomunes.ElementosComunes;
import com.allshop.framework.persistence.catalogo.rol.vo.CatalogoRolVo;
import com.allshop.framework.persistence.common.ElementosComunesVo;
import com.allshop.framework.services.catalogo.rol.CatalogoRolService;

@Service
public class CatalogoRolComponentImpl implements CatalogoRolComponent{

	@Autowired
	protected CatalogoRolService catalogoRolService;
	
	@Override
	public CrearCatalogoRolOut crearCatalogoRolComponent(CrearCatalogoRolIn crearCatalogoRolIn) throws Exception {
		CrearCatalogoRolOut crearCatalogoRolOut =  new CrearCatalogoRolOut();
		CatalogoRol catalogoRol = new CatalogoRol();
		try{
			CatalogoRolVo catRolVo = catalogoRolService.crearCatalogoRolService(convertirCrearCatInToVo(crearCatalogoRolIn));
			catalogoRol.setLangTpCd(catRolVo.getLangTpCd());
			catalogoRol.setIdRol(catRolVo.getIdRol());
			catalogoRol.setDescRol(catRolVo.getDescRol());
			crearCatalogoRolOut.setCatalogoRol(catalogoRol);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		
		return crearCatalogoRolOut;
	}

	@Override
	public ModificarCatalogoRolOut modificarCatalogoRolComponent(ModificarCatalogoRolIn modificarCatalogoRolIn) throws Exception {
		ModificarCatalogoRolOut modificarCatalogoRolOut =  new ModificarCatalogoRolOut();
		CatalogoRol catalogoRol = new CatalogoRol();
		try {
			CatalogoRolVo catRolVo = catalogoRolService.modificarCatalogoRolService(convertirModificarCatInToVo(modificarCatalogoRolIn));
			catalogoRol.setLangTpCd(catRolVo.getLangTpCd());
			catalogoRol.setIdRol(catRolVo.getIdRol());
			catalogoRol.setDescRol(catRolVo.getDescRol());
			modificarCatalogoRolOut.setCatalogoRol(catalogoRol);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return modificarCatalogoRolOut;
	}

	@Override
	public ConsultarCatalogoRolOut consultarCatalogoRolComponent(String idRol) throws Exception {
		ConsultarCatalogoRolOut consultarCatalogoRolOut = null;
		try {
			List<CatalogoRolVo> listaCatalogoRolVo = catalogoRolService.consultarCatalogoRolService(idRol);
			consultarCatalogoRolOut = convertirConsultarCatInToVo(listaCatalogoRolVo);
		}catch(Exception ex){
			throw new Exception(ex);
		}
		return consultarCatalogoRolOut;
	}

	private CatalogoRolVo convertirCrearCatInToVo(CrearCatalogoRolIn crearCatalogoRolIn){
		CatalogoRolVo catRolVo =  new CatalogoRolVo();
		ElementosComunesVo elemComunesVo = new ElementosComunesVo();
		catRolVo.setLangTpCd(crearCatalogoRolIn.getCatalogoRol().getLangTpCd());
		catRolVo.setIdRol(crearCatalogoRolIn.getCatalogoRol().getIdRol());
		catRolVo.setDescRol(crearCatalogoRolIn.getCatalogoRol().getDescRol());
		
		elemComunesVo.setStatusFlag(crearCatalogoRolIn.getCatalogoRol().getElementosComunes().getStatusFlag());
		elemComunesVo.setExpiryDt(DateUtilsCommons.toDate(crearCatalogoRolIn.getCatalogoRol().getElementosComunes().getExpiryDt()));
		elemComunesVo.setLastUpdateDt(DateUtilsCommons.toDate(crearCatalogoRolIn.getCatalogoRol().getElementosComunes().getLastUpdateDt()));
		elemComunesVo.setLastUpdateTxId(crearCatalogoRolIn.getCatalogoRol().getElementosComunes().getLastUpdateTxId());
		elemComunesVo.setLastUpdateUser(crearCatalogoRolIn.getCatalogoRol().getElementosComunes().getLastUpdateUser());
		
		catRolVo.setElementosComunesVo(elemComunesVo);
		return catRolVo;
	}
	
	private CatalogoRolVo convertirModificarCatInToVo(ModificarCatalogoRolIn modificarCatalogoRolIn){
		CatalogoRolVo catRolVo =  new CatalogoRolVo();
		ElementosComunesVo elemComunesVo = new ElementosComunesVo();
		catRolVo.setLangTpCd(modificarCatalogoRolIn.getCatalogoRol().getLangTpCd());
		catRolVo.setIdRol(modificarCatalogoRolIn.getCatalogoRol().getIdRol());
		catRolVo.setDescRol(modificarCatalogoRolIn.getCatalogoRol().getDescRol());
		
		elemComunesVo.setStatusFlag(modificarCatalogoRolIn.getCatalogoRol().getElementosComunes().getStatusFlag());
		elemComunesVo.setExpiryDt(DateUtilsCommons.toDate(modificarCatalogoRolIn.getCatalogoRol().getElementosComunes().getExpiryDt()));
		elemComunesVo.setLastUpdateDt(DateUtilsCommons.toDate(modificarCatalogoRolIn.getCatalogoRol().getElementosComunes().getLastUpdateDt()));
		elemComunesVo.setLastUpdateTxId(modificarCatalogoRolIn.getCatalogoRol().getElementosComunes().getLastUpdateTxId());
		elemComunesVo.setLastUpdateUser(modificarCatalogoRolIn.getCatalogoRol().getElementosComunes().getLastUpdateUser());
		
		catRolVo.setElementosComunesVo(elemComunesVo);
		return catRolVo;
	}
	
	private ConsultarCatalogoRolOut convertirConsultarCatInToVo(List<CatalogoRolVo> listaCatalogoRolVo){
		ConsultarCatalogoRolOut consultarCatalogoRolOut = new ConsultarCatalogoRolOut();
		CatalogoRol catalogoRol = new CatalogoRol();
		
		ElementosComunes elemComunes = new ElementosComunes();
		catalogoRol.setLangTpCd(listaCatalogoRolVo.get(0).getLangTpCd());
		catalogoRol.setIdRol(listaCatalogoRolVo.get(0).getIdRol());
		catalogoRol.setDescRol(listaCatalogoRolVo.get(0).getDescRol());
		
		elemComunes.setStatusFlag(listaCatalogoRolVo.get(0).getElementosComunesVo().getStatusFlag());
		elemComunes.setExpiryDt(DateUtilsCommons.toXMLGregorianCalendar(listaCatalogoRolVo.get(0).getElementosComunesVo().getExpiryDt()));
		elemComunes.setLastUpdateDt(DateUtilsCommons.toXMLGregorianCalendar(listaCatalogoRolVo.get(0).getElementosComunesVo().getLastUpdateDt()));
		elemComunes.setLastUpdateTxId(listaCatalogoRolVo.get(0).getElementosComunesVo().getLastUpdateTxId());
		elemComunes.setLastUpdateUser(listaCatalogoRolVo.get(0).getElementosComunesVo().getLastUpdateUser());
		
		catalogoRol.setElementosComunes(elemComunes);
//		consultarCatalogoRolOut.setCatalogoRol(catalogoRol);
		
		return consultarCatalogoRolOut;
	}
}
