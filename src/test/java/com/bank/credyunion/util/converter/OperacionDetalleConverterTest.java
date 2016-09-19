package com.bank.credyunion.util.converter;

import java.math.BigDecimal;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.OperacionDetalleBean;
import com.bank.credyunion.domain.T012_OperacionDetalle;

public class OperacionDetalleConverterTest {
	
	@Test
	public void OperacionDetalleConverter_BeanToPojo(){
		OperacionDetalleBean bean = new OperacionDetalleBean();
		bean.setCodigoDeOperacion("codigoDeOperacion");
		bean.setCodigoDeSubOperacion("codigoDeSubOperacion");
		bean.setIdOperacion("idOperacion");
		bean.setIdOperacionDetalle("idOperacionDetalle");
		bean.setIndicadorEliminacion("indicadorEliminacion");
		bean.setMonto(new BigDecimal(10.21));
		
		T012_OperacionDetalle model = OperacionDetalleConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals("codigoDeOperacion", model.getCodigoDeOperacion());
		Assert.assertEquals("codigoDeSubOperacion", model.getCodigoDeSubOperacion());
		Assert.assertEquals("idOperacion", model.getIdOperacion());
		Assert.assertEquals("idOperacionDetalle", model.getIdOperacionDetalle());
		Assert.assertEquals("indicadorEliminacion", model.getIndicadorEliminacion());
		Assert.assertEquals(new BigDecimal(10.21), model.getMonto());
	}
	
	@Test
	public void OperacionDetalleConverter_PojoToBean(){
		T012_OperacionDetalle model = new T012_OperacionDetalle();
		model.setCodigoDeOperacion("codigoDeOperacion");
		model.setCodigoDeSubOperacion("codigoDeSubOperacion");
		model.setIdOperacion("idOperacion");
		model.setIdOperacionDetalle("idOperacionDetalle");
		model.setIndicadorEliminacion("indicadorEliminacion");
		model.setMonto(new BigDecimal(10.21));
		
		OperacionDetalleBean bean = OperacionDetalleConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals("codigoDeOperacion", bean.getCodigoDeOperacion());
		Assert.assertEquals("codigoDeSubOperacion", bean.getCodigoDeSubOperacion());
		Assert.assertEquals("idOperacion", bean.getIdOperacion());
		Assert.assertEquals("idOperacionDetalle", bean.getIdOperacionDetalle());
		Assert.assertEquals("indicadorEliminacion", bean.getIndicadorEliminacion());
		Assert.assertEquals(new BigDecimal(10.21), bean.getMonto());
	}
	
}
