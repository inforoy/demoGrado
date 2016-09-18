package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.OperacionBean;
import com.bank.credyunion.domain.T011_Operacion;

public class OperacionConverter {

	public static T011_Operacion parseConverter_FromBeanToPojo(OperacionBean bean){
		T011_Operacion model = new T011_Operacion();
		model.setCodigoAgencia(bean.getCodigoAgencia());
		model.setCodigoDeOperacion(bean.getCodigoDeOperacion());
		model.setCodigoSocio(bean.getCodigoSocio());
		model.setCodigoUsuario(bean.getCodigoUsuario());
		model.setDocumentoDeReferencia(bean.getDocumentoDeReferencia());
		model.setFechaDeOperacion(bean.getFechaDeOperacion());
		model.setIdOperacion(bean.getIdOperacion());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
		model.setIndicadorMovimiento(bean.getIndicadorMovimiento());
		model.setMoneda(bean.getMoneda());
		model.setMontoMovimiento(bean.getMontoMovimiento());
		model.setNombreSocio(bean.getNombreSocio());
		model.setNumeroTransaccion(bean.getNumeroTransaccion());
		model.setObservacion(bean.getObservacion());
		model.setOperacionCorrelativa(bean.getOperacionCorrelativa());
       return model;
	}
	
	public static OperacionBean parseConverter_FromPojoToBean(T011_Operacion model){
		OperacionBean bean = new OperacionBean();
		bean.setCodigoAgencia(model.getCodigoAgencia());
		bean.setCodigoDeOperacion(model.getCodigoDeOperacion());
		bean.setCodigoSocio(model.getCodigoSocio());
		bean.setCodigoUsuario(model.getCodigoUsuario());
		bean.setDocumentoDeReferencia(model.getDocumentoDeReferencia());
		bean.setFechaDeOperacion(model.getFechaDeOperacion());
		bean.setIdOperacion(model.getIdOperacion());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
		bean.setIndicadorMovimiento(model.getIndicadorMovimiento());
		bean.setMoneda(model.getMoneda());
		bean.setMontoMovimiento(model.getMontoMovimiento());
		bean.setNombreSocio(model.getNombreSocio());
		bean.setNumeroTransaccion(model.getNumeroTransaccion());
		bean.setObservacion(model.getObservacion());
		bean.setOperacionCorrelativa(model.getOperacionCorrelativa());
	    return bean;
	}
	
}
