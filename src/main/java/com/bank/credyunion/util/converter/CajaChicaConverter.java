package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.CajaChicaBean;
import com.bank.credyunion.domain.T003_CajaChica;

public class CajaChicaConverter {

	public static T003_CajaChica parseConverter_FromBeanToPojo(CajaChicaBean bean){
		T003_CajaChica model = new T003_CajaChica();
		model.setDocumentoDeReferencia(bean.getDocumentoDeReferencia());
		model.setEngresoTotal(bean.getEngresoTotal());
		model.setFechaDeProceso(bean.getFechaDeProceso());
		model.setIdCajaChica(bean.getIdCajaChica());
		model.setIdProductoCajaChica(bean.getIdProductoCajaChica());
		model.setIdSocio(bean.getIdSocio());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
		model.setIngresoTotal(bean.getIngresoTotal());
		model.setSaldoDeCierre(bean.getSaldoDeCierre());
       return model;
	}
		
	public static CajaChicaBean parseConverter_FromPojoToBean(T003_CajaChica model){
		CajaChicaBean bean = new CajaChicaBean();
		bean.setDocumentoDeReferencia(model.getDocumentoDeReferencia());
		bean.setEngresoTotal(model.getEngresoTotal());
		bean.setFechaDeProceso(model.getFechaDeProceso());
		bean.setIdCajaChica(model.getIdCajaChica());
		bean.setIdProductoCajaChica(model.getIdProductoCajaChica());
		bean.setIdSocio(model.getIdSocio());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
		bean.setIngresoTotal(model.getIngresoTotal());
		bean.setSaldoDeCierre(model.getSaldoDeCierre());
	    return bean;
	}
	
}
