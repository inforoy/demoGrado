package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.PlanDePagoCreditoBean;
import com.bank.credyunion.domain.T013_PlanDePagoCredito;

public class PlanDePagoCreditoConverter {
	
	public static T013_PlanDePagoCredito parseConverter_FromBeanToPojo(PlanDePagoCreditoBean bean){
		T013_PlanDePagoCredito model = new T013_PlanDePagoCredito();
		model.setCapital(bean.getCapital());
		model.setCargo(bean.getCargo());
		model.setFechaDeCuota(bean.getFechaDeCuota());
		model.setFechaDePago(bean.getFechaDePago());
		model.setIdCredito(bean.getIdCredito());
		model.setIdPlanDePagoCredito(bean.getIdPlanDePagoCredito());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
		model.setInteres(bean.getInteres());
		model.setMora(bean.getMora());
		model.setNumeroCuota(bean.getNumeroCuota());
		model.setSaldoDeCuota(bean.getSaldoDeCuota());
       return model;
	}
	
	public static PlanDePagoCreditoBean parseConverter_FromPojoToBean(T013_PlanDePagoCredito model){
		PlanDePagoCreditoBean bean = new PlanDePagoCreditoBean();
		bean.setCapital(model.getCapital());
		bean.setCargo(model.getCargo());
		bean.setFechaDeCuota(model.getFechaDeCuota());
		bean.setFechaDePago(model.getFechaDePago());
		bean.setIdCredito(model.getIdCredito());
		bean.setIdPlanDePagoCredito(model.getIdPlanDePagoCredito());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
		bean.setInteres(model.getInteres());
		bean.setMora(model.getMora());
		bean.setNumeroCuota(model.getNumeroCuota());
		bean.setSaldoDeCuota(model.getSaldoDeCuota());
	    return bean;
	}
	
}
