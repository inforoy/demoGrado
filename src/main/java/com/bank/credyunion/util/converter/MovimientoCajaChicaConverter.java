package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.MovimientoCajaChicaBean;
import com.bank.credyunion.domain.T008_MovimientoCajaChica;

public class MovimientoCajaChicaConverter {

	public static T008_MovimientoCajaChica parseConverter_FromBeanToPojo(MovimientoCajaChicaBean bean){
		T008_MovimientoCajaChica model = new T008_MovimientoCajaChica();
		model.setCodigoDeOperacion(bean.getCodigoDeOperacion());
		model.setFechaDeMovimiento(bean.getFechaDeMovimiento());
		model.setIdCajaChica(bean.getIdCajaChica());
		model.setIdMovimientoCajaChica(bean.getIdMovimientoCajaChica());
		model.setIdOperacion(bean.getIdOperacion());
		model.setMontoDeMovimiento(bean.getMontoDeMovimiento());
		model.setMovimientoCorrelativo(bean.getMovimientoCorrelativo());
		model.setSaldoCapitalActual(bean.getSaldoCapitalActual());
		model.setSaldoCapitalAnterior(bean.getSaldoCapitalAnterior());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
       return model;
	}
		
	public static MovimientoCajaChicaBean parseConverter_FromPojoToBean(T008_MovimientoCajaChica model){
		MovimientoCajaChicaBean bean = new MovimientoCajaChicaBean();
		bean.setCodigoDeOperacion(model.getCodigoDeOperacion());
		bean.setFechaDeMovimiento(model.getFechaDeMovimiento());
		bean.setIdCajaChica(model.getIdCajaChica());
		bean.setIdMovimientoCajaChica(model.getIdMovimientoCajaChica());
		bean.setIdOperacion(model.getIdOperacion());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
		bean.setMontoDeMovimiento(model.getMontoDeMovimiento());
		bean.setMovimientoCorrelativo(model.getMovimientoCorrelativo());
		bean.setSaldoCapitalActual(model.getSaldoCapitalActual());
		bean.setSaldoCapitalAnterior(model.getSaldoCapitalAnterior());
	    return bean;
	}
	
}
