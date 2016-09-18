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
       return model;
	}
		
	public static MovimientoCajaChicaBean parseConverter_FromPojoToBean(T008_MovimientoCajaChica model){
		MovimientoCajaChicaBean bean = new MovimientoCajaChicaBean();
		bean.setCodigoDeOperacion(bean.getCodigoDeOperacion());
		bean.setFechaDeMovimiento(bean.getFechaDeMovimiento());
		bean.setIdCajaChica(bean.getIdCajaChica());
		bean.setIdMovimientoCajaChica(bean.getIdMovimientoCajaChica());
		bean.setIdOperacion(bean.getIdOperacion());
		bean.setIndicadorEliminacion(bean.getIndicadorEliminacion());
		bean.setMontoDeMovimiento(bean.getMontoDeMovimiento());
		bean.setMovimientoCorrelativo(bean.getMovimientoCorrelativo());
		bean.setSaldoCapitalActual(bean.getSaldoCapitalActual());
		bean.setSaldoCapitalAnterior(bean.getSaldoCapitalAnterior());
	    return bean;
	}
	
}
