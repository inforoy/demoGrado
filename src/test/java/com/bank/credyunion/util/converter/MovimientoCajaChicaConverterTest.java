package com.bank.credyunion.util.converter;

import java.math.BigDecimal;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

import com.bank.credyunion.bean.MovimientoCajaChicaBean;
import com.bank.credyunion.domain.T008_MovimientoCajaChica;

public class MovimientoCajaChicaConverterTest {
	
	@SuppressWarnings("deprecation")
	@Test
	@Ignore
	public void IngresosEgresosConverter_BeanToPojo(){
		MovimientoCajaChicaBean bean = new MovimientoCajaChicaBean();
		bean.setCodigoDeOperacion("codigoDeOperacion");
		bean.setFechaDeMovimiento(new Date("10/10/2016"));
		bean.setIdCajaChica("idCajaChica");
		bean.setIdMovimientoCajaChica("idMovimientoCajaChica");
		bean.setIdOperacion("idOperacion");
		bean.setIndicadorEliminacion("indicadorEliminacion");
		bean.setMontoDeMovimiento( new BigDecimal(10.23) );
		bean.setMovimientoCorrelativo("movimientoCorrelativo");
		bean.setSaldoCapitalActual( new BigDecimal(10.25) );
		bean.setSaldoCapitalAnterior( new BigDecimal(10.29) );
		
		T008_MovimientoCajaChica model = MovimientoCajaChicaConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals("codigoDeOperacion", model.getCodigoDeOperacion());
		Assert.assertEquals(new Date("10/10/2016"), model.getFechaDeMovimiento());
		Assert.assertEquals("idCajaChica", model.getIdCajaChica());
		Assert.assertEquals("idMovimientoCajaChica", model.getIdMovimientoCajaChica());
		Assert.assertEquals("idOperacion", model.getIdOperacion());
		Assert.assertEquals("indicadorEliminacion", model.getIndicadorEliminacion());
		Assert.assertEquals(new BigDecimal(10.23), model.getMontoDeMovimiento());
		Assert.assertEquals("movimientoCorrelativo", model.getMovimientoCorrelativo());
		Assert.assertEquals( new BigDecimal(10.25) , model.getSaldoCapitalActual());
		Assert.assertEquals( new BigDecimal(10.29) , model.getSaldoCapitalAnterior());
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	@Ignore
	public void IngresosEgresosConverter_PojoToBean(){
		T008_MovimientoCajaChica model = new T008_MovimientoCajaChica();
		model.setCodigoDeOperacion("codigoDeOperacion");
		model.setFechaDeMovimiento(new Date("10/10/2016"));
		model.setIdCajaChica("idCajaChica");
		model.setIdMovimientoCajaChica("idMovimientoCajaChica");
		model.setIdOperacion("idOperacion");
		model.setIndicadorEliminacion("indicadorEliminacion");
		model.setMontoDeMovimiento( new BigDecimal(10.23) );
		model.setMovimientoCorrelativo("movimientoCorrelativo");
		model.setSaldoCapitalActual( new BigDecimal(10.25) );
		model.setSaldoCapitalAnterior( new BigDecimal(10.29) );
		
		MovimientoCajaChicaBean bean = MovimientoCajaChicaConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals("codigoDeOperacion", bean.getCodigoDeOperacion());
		Assert.assertEquals(new Date("10/10/2016"), bean.getFechaDeMovimiento());
		Assert.assertEquals("idCajaChica", bean.getIdCajaChica());
		Assert.assertEquals("idMovimientoCajaChica", bean.getIdMovimientoCajaChica());
		Assert.assertEquals("idOperacion", bean.getIdOperacion());
		Assert.assertEquals("indicadorEliminacion", bean.getIndicadorEliminacion());
		Assert.assertEquals(new BigDecimal(10.23), bean.getMontoDeMovimiento());
		Assert.assertEquals("movimientoCorrelativo", bean.getMovimientoCorrelativo());
		Assert.assertEquals( new BigDecimal(10.25) , bean.getSaldoCapitalActual());
		Assert.assertEquals( new BigDecimal(10.29) , bean.getSaldoCapitalAnterior());
	}
	
}
