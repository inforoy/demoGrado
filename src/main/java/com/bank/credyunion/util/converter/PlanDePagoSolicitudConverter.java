package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.PlanDePagoSolicitudBean;
import com.bank.credyunion.domain.T014_PlanDePagoSolicitud;

public class PlanDePagoSolicitudConverter {

	public static T014_PlanDePagoSolicitud parseConverter_FromBeanToPojo(PlanDePagoSolicitudBean bean){
		T014_PlanDePagoSolicitud model = new T014_PlanDePagoSolicitud();
		model.setCapital(bean.getCapital());
		model.setCargo(bean.getCargo());
		model.setFechaDeCuota(bean.getFechaDeCuota());
		model.setIdPlanDePagoSolicitud(bean.getIdPlanDePagoSolicitud());
		model.setIdSolicitudCredito(bean.getIdSolicitudCredito());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
		model.setInteres(bean.getInteres());
		model.setNumeroCuota(bean.getNumeroCuota());
		model.setSaldoDeCuota(bean.getSaldoDeCuota());
       return model;
	}
	
	public static PlanDePagoSolicitudBean parseConverter_FromPojoToBean(T014_PlanDePagoSolicitud model){
		PlanDePagoSolicitudBean bean = new PlanDePagoSolicitudBean();
		bean.setCapital(model.getCapital());
		bean.setCargo(model.getCargo());
		bean.setFechaDeCuota(model.getFechaDeCuota());
		bean.setIdPlanDePagoSolicitud(model.getIdPlanDePagoSolicitud());
		bean.setIdSolicitudCredito(model.getIdSolicitudCredito());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
		bean.setInteres(model.getInteres());
		bean.setNumeroCuota(model.getNumeroCuota());
		bean.setSaldoDeCuota(model.getSaldoDeCuota());
	    return bean;
	}
	
}
