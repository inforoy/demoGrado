package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.OperacionDetalleBean;
import com.bank.credyunion.domain.T012_OperacionDetalle;

public class OperacionDetalleConverter {

	public static T012_OperacionDetalle parseConverter_FromBeanToPojo(OperacionDetalleBean bean){
		T012_OperacionDetalle model = new T012_OperacionDetalle();
		model.setCodigoDeOperacion(bean.getCodigoDeOperacion());
		model.setCodigoDeSubOperacion(bean.getCodigoDeSubOperacion());
		model.setIdOperacion(bean.getIdOperacion());
		model.setIdOperacionDetalle(bean.getIdOperacionDetalle());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
		model.setMonto(bean.getMonto());
       return model;
	}
	
	public static OperacionDetalleBean parseConverter_FromPojoToBean(T012_OperacionDetalle model){
		OperacionDetalleBean bean = new OperacionDetalleBean();
		bean.setCodigoDeOperacion(model.getCodigoDeOperacion());
		bean.setCodigoDeSubOperacion(model.getCodigoDeSubOperacion());
		bean.setIdOperacion(model.getIdOperacion());
		bean.setIdOperacionDetalle(model.getIdOperacionDetalle());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
		bean.setMonto(model.getMonto());
	    return bean;
	}
	
}
