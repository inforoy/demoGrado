package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.MovimientoCreditoBean;
import com.bank.credyunion.domain.T009_MovimientoCredito;

public class MovimientoCreditoConverter {

	public static T009_MovimientoCredito parseConverter_FromBeanToPojo(MovimientoCreditoBean bean){
		T009_MovimientoCredito model = new T009_MovimientoCredito();
		model.setCapitalActual(bean.getCapitalActual());
		model.setCapitalAnterior(bean.getCapitalAnterior());
		model.setCodigoAgencia(bean.getCodigoAgencia());
		model.setCodigoDeOperacion(bean.getCodigoDeOperacion());
		model.setCodigoUsuario(bean.getCodigoUsuario());
		model.setFechaDeMovimiento(bean.getFechaDeMovimiento());
		model.setIdCredito(bean.getIdCredito());
		model.setIdMovimientoCredito(bean.getIdMovimientoCredito());
		model.setIdOperation(bean.getIdOperation());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
		model.setMontoDelCapital(bean.getMontoDelCapital());
		model.setMontoDelCargo(bean.getMontoDelCargo());
		model.setMontoDelInteres(bean.getMontoDelInteres());
		model.setMontoDeMora(bean.getMontoDeMora());
		model.setMontoDeMovimiento(bean.getMontoDeMovimiento());
		model.setMovimientoCorrelativo(bean.getMovimientoCorrelativo());
		model.setNumeroMovimiento(bean.getNumeroMovimiento());
       return model;
	}
		
	public static MovimientoCreditoBean parseConverter_FromPojoToBean(T009_MovimientoCredito model){
		MovimientoCreditoBean bean = new MovimientoCreditoBean();
		bean.setCapitalActual(model.getCapitalActual());
		bean.setCapitalAnterior(model.getCapitalAnterior());
		bean.setCodigoAgencia(model.getCodigoAgencia());
		bean.setCodigoDeOperacion(model.getCodigoDeOperacion());
		bean.setCodigoUsuario(model.getCodigoUsuario());
		bean.setFechaDeMovimiento(model.getFechaDeMovimiento());
		bean.setIdCredito(model.getIdCredito());
		bean.setIdMovimientoCredito(model.getIdMovimientoCredito());
		bean.setIdOperation(model.getIdOperation());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
		bean.setMontoDelCapital(model.getMontoDelCapital());
		bean.setMontoDelCargo(model.getMontoDelCargo());
		bean.setMontoDelInteres(model.getMontoDelInteres());
		bean.setMontoDeMora(model.getMontoDeMora());
		bean.setMontoDeMovimiento(model.getMontoDeMovimiento());
		bean.setMovimientoCorrelativo(model.getMovimientoCorrelativo());
		bean.setNumeroMovimiento(model.getNumeroMovimiento());
	    return bean;
	}
	
}
