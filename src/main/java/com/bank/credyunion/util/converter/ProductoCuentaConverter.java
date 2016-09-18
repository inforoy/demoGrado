package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.ProductoCuentaBean;
import com.bank.credyunion.domain.T017_ProductoCuenta;

public class ProductoCuentaConverter {

	public static T017_ProductoCuenta parseConverter_FromBeanToPojo(ProductoCuentaBean bean){
		T017_ProductoCuenta model = new T017_ProductoCuenta();
		model.setDescripcion(bean.getDescripcion());
		model.setIdProductoCuenta(bean.getIdProductoCuenta());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
		model.setMontoMaximo(bean.getMontoMaximo());
		model.setMontoMinimo(bean.getMontoMinimo());
		model.setTasa(bean.getTasa());
		
       return model;
	}
	
	public static ProductoCuentaBean parseConverter_FromPojoToBean(T017_ProductoCuenta model){
		ProductoCuentaBean bean = new ProductoCuentaBean();
		bean.setDescripcion(model.getDescripcion());
		bean.setIdProductoCuenta(model.getIdProductoCuenta());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
		bean.setMontoMaximo(model.getMontoMaximo());
		bean.setMontoMinimo(model.getMontoMinimo());
		bean.setTasa(model.getTasa());
	    return bean;
	}
	
}
