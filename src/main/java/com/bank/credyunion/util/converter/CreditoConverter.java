package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.CreditoBean;
import com.bank.credyunion.domain.T004_Credito;

public class CreditoConverter {

	public static T004_Credito parseConverter_FromBeanToPojo(CreditoBean bean){
		T004_Credito model = new T004_Credito();
		model.setCantidadDeCuotas(bean.getCantidadDeCuotas());
		model.setCodigoAgencia(bean.getCodigoAgencia());
		model.setCodigoUsuario(bean.getCodigoUsuario());
		model.setEstadoCredito(bean.getEstadoCredito());
		model.setFechaDeAprobacion(bean.getFechaDeAprobacion());
		model.setFechaDeCancelacion(bean.getFechaDeCancelacion());
		model.setFechaDeVencimiento(bean.getFechaDeVencimiento());
		model.setIdCredito(bean.getIdCredito());
		model.setIdProductoCredito(bean.getIdProductoCredito());
		model.setIdSocio(bean.getIdSocio());
		model.setIdSolicitudCredito(bean.getIdSolicitudCredito());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
		model.setMoneda(bean.getMoneda());
		model.setMontoDeCredito(bean.getMontoDeCredito());
		model.setPrimeraFechaDePago(bean.getPrimeraFechaDePago());
		model.setSaldoDeCredito(bean.getSaldoDeCredito());
		model.setSaldoDeDeuda(bean.getSaldoDeDeuda());
		model.setSaldoDeInteres(bean.getSaldoDeInteres());
		model.setSaldoDeMora(bean.getSaldoDeMora());
		model.setTasaDeCuota(bean.getTasaDeCuota());
		model.setTasaMoratoria(bean.getTasaMoratoria());
		model.setUltimaFechaDePago(bean.getUltimaFechaDePago());
		
       return model;
	}
		
	public static CreditoBean parseConverter_FromPojoToBean(T004_Credito model){
		CreditoBean bean = new CreditoBean();
		bean.setCantidadDeCuotas(model.getCantidadDeCuotas());
		bean.setCodigoAgencia(model.getCodigoAgencia());
		bean.setCodigoUsuario(model.getCodigoUsuario());
		bean.setEstadoCredito(model.getEstadoCredito());
		bean.setFechaDeAprobacion(model.getFechaDeAprobacion());
		bean.setFechaDeCancelacion(model.getFechaDeCancelacion());
		bean.setFechaDeVencimiento(model.getFechaDeVencimiento());
		bean.setIdCredito(model.getIdCredito());
		bean.setIdProductoCredito(model.getIdProductoCredito());
		bean.setIdSocio(model.getIdSocio());
		bean.setIdSolicitudCredito(model.getIdSolicitudCredito());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
		bean.setMoneda(model.getMoneda());
		bean.setMontoDeCredito(model.getMontoDeCredito());
		bean.setPrimeraFechaDePago(model.getPrimeraFechaDePago());
		bean.setSaldoDeCredito(model.getSaldoDeCredito());
		bean.setSaldoDeDeuda(model.getSaldoDeDeuda());
		bean.setSaldoDeInteres(model.getSaldoDeInteres());
		bean.setSaldoDeMora(model.getSaldoDeMora());
		bean.setTasaDeCuota(model.getTasaDeCuota());
		bean.setTasaMoratoria(model.getTasaMoratoria());
		bean.setUltimaFechaDePago(model.getUltimaFechaDePago());
	    return bean;
	}
	
}
