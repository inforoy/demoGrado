package com.bank.credyunion.util.converter;

import java.math.BigDecimal;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.ProductoCajaChicaBean;
import com.bank.credyunion.domain.T015_ProductoCajaChica;

public class ProductoCajaChicaConverterTest {
	
	@Test
	public void ProductoCajaChicaConverter_BeanToPojo(){
		ProductoCajaChicaBean bean = new ProductoCajaChicaBean();
		bean.setDescripcion("descripcion");
		bean.setIdProductoCajaChica("idProductoCajaChica");
		bean.setIndicadorEliminacion("indicadorEliminacion");
		bean.setMonto(new BigDecimal(10.21));
		
		T015_ProductoCajaChica model = ProductoCajaChicaConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals("descripcion", model.getDescripcion());
		Assert.assertEquals("idProductoCajaChica", model.getIdProductoCajaChica());
		Assert.assertEquals("indicadorEliminacion", model.getIndicadorEliminacion());
		Assert.assertEquals( new BigDecimal(10.21) , model.getMonto());
	}
	
	@Test
	public void ProductoCajaChicaConverter_PojoToBean(){
		T015_ProductoCajaChica model = new T015_ProductoCajaChica();
		model.setDescripcion("descripcion");
		model.setIdProductoCajaChica("idProductoCajaChica");
		model.setIndicadorEliminacion("indicadorEliminacion");
		model.setMonto(new BigDecimal(10.21));
		
		ProductoCajaChicaBean bean = ProductoCajaChicaConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals("descripcion", bean.getDescripcion());
		Assert.assertEquals("idProductoCajaChica", bean.getIdProductoCajaChica());
		Assert.assertEquals("indicadorEliminacion", bean.getIndicadorEliminacion());
		Assert.assertEquals( new BigDecimal(10.21) , bean.getMonto());
		
	}
	
}
