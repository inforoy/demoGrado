package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.ProductoCreditoBean;
import com.bank.credyunion.domain.T016_ProductoCredito;

public class ProductoCreditoConverter {

	public static T016_ProductoCredito parseConverter_FromBeanToPojo(ProductoCreditoBean bean){
		T016_ProductoCredito model = new T016_ProductoCredito();
		model.setDescripcion(bean.getDescripcion());
		model.setIdProductoCredito(bean.getIdProductoCredito());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
		model.setMontoMaximo(bean.getMontoMaximo());
		model.setMontoMinimo(bean.getMontoMinimo());
		model.setTasa(bean.getTasa());
       return model;
	}
	
	public static ProductoCreditoBean parseConverter_FromPojoToBean(T016_ProductoCredito model){
		ProductoCreditoBean bean = new ProductoCreditoBean();
		bean.setDescripcion(model.getDescripcion());
		bean.setIdProductoCredito(model.getIdProductoCredito());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
		bean.setMontoMaximo(model.getMontoMaximo());
		bean.setMontoMinimo(model.getMontoMinimo());
		bean.setTasa(model.getTasa());
	    return bean;
	}
	
}
