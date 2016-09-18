package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.CuentaBean;
import com.bank.credyunion.domain.T005_Cuenta;

public class CuentaConverter {

	public static T005_Cuenta parseConverter_FromBeanToPojo(CuentaBean bean){
		T005_Cuenta model = new T005_Cuenta();
		model.setCodigoAgencia(bean.getCodigoAgencia());
		model.setCodigoUsuarioApertura(bean.getCodigoUsuarioApertura());
		model.setCodigoUsuarioCancelacion(bean.getCodigoUsuarioCancelacion());
		model.setEstadoCuenta(bean.getEstadoCuenta());
		model.setFechaDeApertura(bean.getFechaDeApertura());
		model.setFechaDeCancelacion(bean.getFechaDeCancelacion());
		model.setIdCuenta(bean.getIdCuenta());
		model.setIdProductoCuenta(bean.getIdProductoCuenta());
		model.setIdSocio(bean.getIdSocio());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
		model.setMoneda(bean.getMoneda());
		model.setMontoDeApertura(bean.getMontoDeApertura());
		model.setMovimientoCorrelativo(bean.getMovimientoCorrelativo());
		model.setObservacion(bean.getObservacion());
		model.setSaldoCapital(bean.getSaldoCapital());
       return model;
	}
		
	public static CuentaBean parseConverter_FromPojoToBean(T005_Cuenta model){
		CuentaBean bean = new CuentaBean();
		bean.setCodigoAgencia(model.getCodigoAgencia());
		bean.setCodigoUsuarioApertura(model.getCodigoUsuarioApertura());
		bean.setCodigoUsuarioCancelacion(model.getCodigoUsuarioCancelacion());
		bean.setEstadoCuenta(model.getEstadoCuenta());
		bean.setFechaDeApertura(model.getFechaDeApertura());
		bean.setFechaDeCancelacion(model.getFechaDeCancelacion());
		bean.setIdCuenta(model.getIdCuenta());
		bean.setIdProductoCuenta(model.getIdProductoCuenta());
		bean.setIdSocio(model.getIdSocio());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
		bean.setMoneda(model.getMoneda());
		bean.setMontoDeApertura(model.getMontoDeApertura());
		bean.setMovimientoCorrelativo(model.getMovimientoCorrelativo());
		bean.setObservacion(model.getObservacion());
		bean.setSaldoCapital(model.getSaldoCapital());
	    return bean;
	}
	
}
