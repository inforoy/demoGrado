package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.CajaBean;
import com.bank.credyunion.domain.T002_Caja;

public class CajaConverter {

	public static T002_Caja parseConverter_FromBeanToPojo(CajaBean bean){
		T002_Caja model = new T002_Caja();
		model.setCodigoDeUsuario(bean.getCodigoDeUsuario());
		model.setDocumentoDeReferencia(bean.getDocumentoDeReferencia());
		model.setEgresoTotal(bean.getEgresoTotal());
		model.setFechaDeProceso(bean.getFechaDeProceso());
		model.setIdAgencia(bean.getIdAgencia());
		model.setIdCaja(bean.getIdCaja());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
		model.setIngresoTotal(bean.getIngresoTotal());
		model.setMontoDeCierre(bean.getMontoDeCierre());
		model.setNombreDeUsuario(bean.getNombreDeUsuario());
		model.setSaldoFinal(bean.getSaldoFinal());
		model.setSaldoInicial(bean.getSaldoInicial());
       return model;
	}
		
	public static CajaBean parseConverter_FromPojoToBean(T002_Caja model){
		CajaBean bean = new CajaBean();
		bean.setCodigoDeUsuario(model.getCodigoDeUsuario());
		bean.setDocumentoDeReferencia(model.getDocumentoDeReferencia());
		bean.setEgresoTotal(model.getEgresoTotal());
		bean.setFechaDeProceso(model.getFechaDeProceso());
		bean.setIdAgencia(model.getIdAgencia());
		bean.setIdCaja(model.getIdCaja());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
		bean.setIngresoTotal(model.getIngresoTotal());
		bean.setMontoDeCierre(model.getMontoDeCierre());
		bean.setNombreDeUsuario(model.getNombreDeUsuario());
		bean.setSaldoFinal(model.getSaldoFinal());
		bean.setSaldoInicial(model.getSaldoInicial());
	    return bean;
	}
	
}
