package com.bank.credyunion.util.converter;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.IngresosEgresosBean;
import com.bank.credyunion.domain.T007_IngresosEgresos;

public class IngresosEgresosConverterTest {

	@Test
	public void IngresosEgresosConverter_BeanToPojo(){
		IngresosEgresosBean bean = new IngresosEgresosBean();
		bean.setCodigoOperacion("codigoOperacion");
		bean.setDescripcion("descripcion");
		bean.setIdIngresoEgreso("idIngresoEgreso");
		bean.setIndicadorDeMovimiento("indicadorDeMovimiento");
		bean.setIndicadorEliminacion("indicadorEliminacion");
		
		T007_IngresosEgresos model = IngresosEgresosConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals("codigoOperacion", model.getCodigoOperacion());
		Assert.assertEquals("descripcion", model.getDescripcion());
		Assert.assertEquals("idIngresoEgreso", model.getIdIngresoEgreso());
		Assert.assertEquals("indicadorDeMovimiento", model.getIndicadorDeMovimiento());
		Assert.assertEquals("indicadorEliminacion", model.getIndicadorEliminacion());
	}
	
	@Test
	public void IngresosEgresosConverter_PojoToBean(){
		T007_IngresosEgresos model = new T007_IngresosEgresos();
		model.setCodigoOperacion("codigoOperacion");
		model.setDescripcion("descripcion");
		model.setIdIngresoEgreso("idIngresoEgreso");
		model.setIndicadorDeMovimiento("indicadorDeMovimiento");
		model.setIndicadorEliminacion("indicadorEliminacion");
		
		IngresosEgresosBean bean = IngresosEgresosConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals("codigoOperacion", bean.getCodigoOperacion());
		Assert.assertEquals("descripcion", bean.getDescripcion());
		Assert.assertEquals("idIngresoEgreso", bean.getIdIngresoEgreso());
		Assert.assertEquals("indicadorDeMovimiento", bean.getIndicadorDeMovimiento());
		Assert.assertEquals("indicadorEliminacion", bean.getIndicadorEliminacion());
	}
	
}
