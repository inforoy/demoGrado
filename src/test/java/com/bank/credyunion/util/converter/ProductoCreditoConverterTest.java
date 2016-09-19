package com.bank.credyunion.util.converter;

import java.math.BigDecimal;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.ProductoCreditoBean;
import com.bank.credyunion.domain.T016_ProductoCredito;

public class ProductoCreditoConverterTest {
	
	@Test
	public void ProductoCreditoConverter_BeanToPojo(){
		ProductoCreditoBean bean = new ProductoCreditoBean();
		bean.setDescripcion("descripcion");
		bean.setIdProductoCredito("idProductoCredito");
		bean.setIndicadorEliminacion("indicadorEliminacion");
		bean.setMontoMaximo(new BigDecimal(10.0));
		bean.setMontoMinimo(new BigDecimal(10.1));
		bean.setTasa(new BigDecimal(10.2));
		
		T016_ProductoCredito model = ProductoCreditoConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals("descripcion", model.getDescripcion());
		Assert.assertEquals("idProductoCredito", model.getIdProductoCredito());
		Assert.assertEquals("indicadorEliminacion", model.getIndicadorEliminacion());
		Assert.assertEquals(new BigDecimal(10.0), model.getMontoMaximo());
		Assert.assertEquals(new BigDecimal(10.1), model.getMontoMinimo());
		Assert.assertEquals(new BigDecimal(10.2), model.getTasa());
		
	}
	
	@Test
	public void ProductoCreditoConverter_PojoToBean(){
		T016_ProductoCredito model = new T016_ProductoCredito();
		model.setDescripcion("descripcion");
		model.setIdProductoCredito("idProductoCredito");
		model.setIndicadorEliminacion("indicadorEliminacion");
		model.setMontoMaximo(new BigDecimal(10.0));
		model.setMontoMinimo(new BigDecimal(10.1));
		model.setTasa(new BigDecimal(10.2));
		
		ProductoCreditoBean bean = ProductoCreditoConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals("descripcion", bean.getDescripcion());
		Assert.assertEquals("idProductoCredito", bean.getIdProductoCredito());
		Assert.assertEquals("indicadorEliminacion", bean.getIndicadorEliminacion());
		Assert.assertEquals(new BigDecimal(10.0), bean.getMontoMaximo());
		Assert.assertEquals(new BigDecimal(10.1), bean.getMontoMinimo());
		Assert.assertEquals(new BigDecimal(10.2), bean.getTasa());
	}
	
}
