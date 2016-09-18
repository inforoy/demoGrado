package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.MovimientoCuentaBean;
import com.bank.credyunion.domain.T010_MovimientoCuenta;

public class MovimientoCuentaConverter {

	public static T010_MovimientoCuenta parseConverter_FromBeanToPojo(MovimientoCuentaBean bean){
		T010_MovimientoCuenta model = new T010_MovimientoCuenta();
		model.setCodigoDeOperacion(bean.getCodigoDeOperacion());
		model.setCodigoUsuario(bean.getCodigoUsuario());
		model.setFechaMovimiento(bean.getFechaMovimiento());
		model.setIdCuenta(bean.getIdCuenta());
		model.setIdMovimientoCuenta(bean.getIdMovimientoCuenta());
		model.setIdOperation(bean.getIdOperation());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
		model.setMontoMovimiento(bean.getMontoMovimiento());
		model.setMovimientoCorrelativo(bean.getMovimientoCorrelativo());
		model.setSaldoCapitalActual(bean.getSaldoCapitalActual());
		model.setSaldoCapitalAnterior(bean.getSaldoCapitalAnterior());
       return model;
	}
	
	public static MovimientoCuentaBean parseConverter_FromPojoToBean(T010_MovimientoCuenta model){
		MovimientoCuentaBean bean = new MovimientoCuentaBean();
		bean.setCodigoDeOperacion(model.getCodigoDeOperacion());
		bean.setCodigoUsuario(model.getCodigoUsuario());
		bean.setFechaMovimiento(model.getFechaMovimiento());
		bean.setIdCuenta(model.getIdCuenta());
		bean.setIdMovimientoCuenta(model.getIdMovimientoCuenta());
		bean.setIdOperation(model.getIdOperation());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
		bean.setMontoMovimiento(model.getMontoMovimiento());
		bean.setMovimientoCorrelativo(model.getMovimientoCorrelativo());
		bean.setSaldoCapitalActual(model.getSaldoCapitalActual());
		bean.setSaldoCapitalAnterior(model.getSaldoCapitalAnterior());
	    return bean;
	}
	
}
