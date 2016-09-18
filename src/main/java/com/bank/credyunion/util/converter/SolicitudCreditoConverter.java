package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.SolicitudCreditoBean;
import com.bank.credyunion.domain.T019_SolicitudCredito;

public class SolicitudCreditoConverter {

	public static T019_SolicitudCredito parseConverter_FromBeanToPojo(SolicitudCreditoBean bean){
		T019_SolicitudCredito model = new T019_SolicitudCredito();
		model.setCodigoAgencia(bean.getCodigoAgencia());
		model.setCodigoUsuario(bean.getCodigoUsuario());
		model.setFechaDeSolicitud(bean.getFechaDeSolicitud());
		model.setFechaDeVencimiento(bean.getFechaDeVencimiento());
		model.setIdProductoCredito(bean.getIdProductoCredito());
		model.setIdSolicitudCredito(bean.getIdSolicitudCredito());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
		model.setMoneda(bean.getMoneda());
		model.setMontoSolicitado(bean.getMontoSolicitado());
		model.setNumeroCuotas(bean.getNumeroCuotas());
		model.setPrimeraFechaPago(bean.getPrimeraFechaPago());
		model.setTasaDeCuota(bean.getTasaDeCuota());
		model.setTasaMoratoria(bean.getTasaMoratoria());
       return model;
	}
		
	public static SolicitudCreditoBean parseConverter_FromPojoToBean(T019_SolicitudCredito model){
		SolicitudCreditoBean bean = new SolicitudCreditoBean();
		bean.setCodigoAgencia(model.getCodigoAgencia());
		bean.setCodigoUsuario(model.getCodigoUsuario());
		bean.setFechaDeSolicitud(model.getFechaDeSolicitud());
		bean.setFechaDeVencimiento(model.getFechaDeVencimiento());
		bean.setIdProductoCredito(model.getIdProductoCredito());
		bean.setIdSolicitudCredito(model.getIdSolicitudCredito());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
		bean.setMoneda(model.getMoneda());
		bean.setMontoSolicitado(model.getMontoSolicitado());
		bean.setNumeroCuotas(model.getNumeroCuotas());
		bean.setPrimeraFechaPago(model.getPrimeraFechaPago());
		bean.setTasaDeCuota(model.getTasaDeCuota());
		bean.setTasaMoratoria(model.getTasaMoratoria());
	    return bean;
	}
}
