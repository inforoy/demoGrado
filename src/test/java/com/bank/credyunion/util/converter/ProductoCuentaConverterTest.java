package com.bank.credyunion.util.converter;

import java.math.BigDecimal;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.ProductoCuentaBean;
import com.bank.credyunion.domain.T017_ProductoCuenta;

public class ProductoCuentaConverterTest {
	
	@Test
	public void ProductoCuentaConverter_BeanToPojo(){
		ProductoCuentaBean bean = new ProductoCuentaBean();
		bean.setDescripcion("descripcion");
		bean.setIdProductoCuenta("idProductoCuenta");
		bean.setIndicadorEliminacion("indicadorEliminacion");
		bean.setMontoMaximo(new BigDecimal(10.20));
		bean.setMontoMinimo(new BigDecimal(10.25));
		bean.setTasa(new BigDecimal(11.20));
		
		T017_ProductoCuenta model = ProductoCuentaConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals("descripcion", model.getDescripcion());
		Assert.assertEquals("idProductoCuenta", model.getIdProductoCuenta());
		Assert.assertEquals("indicadorEliminacion", model.getIndicadorEliminacion());
		Assert.assertEquals(new BigDecimal(10.20), model.getMontoMaximo());
		Assert.assertEquals(new BigDecimal(10.25), model.getMontoMinimo());
		Assert.assertEquals(new BigDecimal(11.20), model.getTasa());
		
	}
	
	@Test
	public void ProductoCuentaConverter_PojoToBean(){
		T017_ProductoCuenta model = new T017_ProductoCuenta();
		model.setDescripcion("descripcion");
		model.setIdProductoCuenta("idProductoCuenta");
		model.setIndicadorEliminacion("indicadorEliminacion");
		model.setMontoMaximo(new BigDecimal(10.20));
		model.setMontoMinimo(new BigDecimal(10.25));
		model.setTasa(new BigDecimal(11.20));
		
		ProductoCuentaBean bean = ProductoCuentaConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals("descripcion", bean.getDescripcion());
		Assert.assertEquals("idProductoCuenta", bean.getIdProductoCuenta());
		Assert.assertEquals("indicadorEliminacion", bean.getIndicadorEliminacion());
		Assert.assertEquals(new BigDecimal(10.20), bean.getMontoMaximo());
		Assert.assertEquals(new BigDecimal(10.25), bean.getMontoMinimo());
		Assert.assertEquals(new BigDecimal(11.20), bean.getTasa());
	}
	
}
