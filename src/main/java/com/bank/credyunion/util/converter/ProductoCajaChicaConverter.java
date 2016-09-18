package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.ProductoCajaChicaBean;
import com.bank.credyunion.domain.T015_ProductoCajaChica;

public class ProductoCajaChicaConverter {

	public static T015_ProductoCajaChica parseConverter_FromBeanToPojo(ProductoCajaChicaBean bean){
		T015_ProductoCajaChica model = new T015_ProductoCajaChica();
		model.setDescripcion(bean.getDescripcion());
		model.setIdProductoCajaChica(bean.getIdProductoCajaChica());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
		model.setMonto(bean.getMonto());
       return model;
	}
	
	public static ProductoCajaChicaBean parseConverter_FromPojoToBean(T015_ProductoCajaChica model){
		ProductoCajaChicaBean bean = new ProductoCajaChicaBean();
		bean.setDescripcion(model.getDescripcion());
		bean.setIdProductoCajaChica(model.getIdProductoCajaChica());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
		bean.setMonto(model.getMonto());
	    return bean;
	}
	
}
