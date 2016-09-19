package com.bank.credyunion.util.converter;

import java.math.BigDecimal;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.CuentaBean;
import com.bank.credyunion.domain.T005_Cuenta;

public class CuentaConverterTest {

	@Test
	public void CuentaConverter_BeanToPojo(){
		CuentaBean bean = new CuentaBean();
		bean.setCodigoAgencia("codigoAgencia");
		bean.setCodigoUsuarioApertura("codigoUsuarioApertura");
		bean.setCodigoUsuarioCancelacion("codigoUsuarioCancelacion");
		bean.setEstadoCuenta("estadoCuenta");
		bean.setFechaDeApertura(new Date("05/05/2016"));
		bean.setFechaDeCancelacion(new Date("05/06/2016"));
		bean.setIdCuenta("idCuenta");
		bean.setIdProductoCuenta("idProductoCuenta");
		bean.setIdSocio("idSocio");
		bean.setIndicadorEliminacion("indicadorEliminacion");
		bean.setMoneda("moneda");
		bean.setMontoDeApertura(new BigDecimal(10.20));
		bean.setMovimientoCorrelativo("movimientoCorrelativo");
		bean.setObservacion("observacion");
		bean.setSaldoCapital(new BigDecimal(100.20));
		
		T005_Cuenta model = CuentaConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals("codigoAgencia", model.getCodigoAgencia());
		Assert.assertEquals("codigoUsuarioApertura", model.getCodigoUsuarioApertura());
		Assert.assertEquals("codigoUsuarioCancelacion", model.getCodigoUsuarioCancelacion());
		Assert.assertEquals("estadoCuenta", model.getEstadoCuenta());
		Assert.assertEquals(new Date("05/05/2016"), model.getFechaDeApertura());
		Assert.assertEquals(new Date("05/06/2016"), model.getFechaDeCancelacion());
		Assert.assertEquals("idCuenta", model.getIdCuenta());
		Assert.assertEquals("idProductoCuenta", model.getIdProductoCuenta());
		Assert.assertEquals("idSocio", model.getIdSocio());
		Assert.assertEquals("indicadorEliminacion", model.getIndicadorEliminacion());
		Assert.assertEquals("moneda", model.getMoneda());
		Assert.assertEquals(new BigDecimal(10.20), model.getMontoDeApertura());
		Assert.assertEquals("movimientoCorrelativo", model.getMovimientoCorrelativo());
		Assert.assertEquals("observacion", model.getObservacion());
		Assert.assertEquals(new BigDecimal(100.20), model.getSaldoCapital());
		
	}
	
	@Test
	public void CuentaConverter_PojoToBean(){
		T005_Cuenta model = new T005_Cuenta();
		model.setCodigoAgencia("codigoAgencia");
		model.setCodigoUsuarioApertura("codigoUsuarioApertura");
		model.setCodigoUsuarioCancelacion("codigoUsuarioCancelacion");
		model.setEstadoCuenta("estadoCuenta");
		model.setFechaDeApertura(new Date("05/05/2016"));
		model.setFechaDeCancelacion(new Date("05/06/2016"));
		model.setIdCuenta("idCuenta");
		model.setIdProductoCuenta("idProductoCuenta");
		model.setIdSocio("idSocio");
		model.setIndicadorEliminacion("indicadorEliminacion");
		model.setMoneda("moneda");
		model.setMontoDeApertura(new BigDecimal(10.20));
		model.setMovimientoCorrelativo("movimientoCorrelativo");
		model.setObservacion("observacion");
		model.setSaldoCapital(new BigDecimal(100.20));
		
		CuentaBean bean = CuentaConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals("codigoAgencia", bean.getCodigoAgencia());
		Assert.assertEquals("codigoUsuarioApertura", bean.getCodigoUsuarioApertura());
		Assert.assertEquals("codigoUsuarioCancelacion", bean.getCodigoUsuarioCancelacion());
		Assert.assertEquals("estadoCuenta", bean.getEstadoCuenta());
		Assert.assertEquals(new Date("05/05/2016"), bean.getFechaDeApertura());
		Assert.assertEquals(new Date("05/06/2016"), bean.getFechaDeCancelacion());
		Assert.assertEquals("idCuenta", bean.getIdCuenta());
		Assert.assertEquals("idProductoCuenta", bean.getIdProductoCuenta());
		Assert.assertEquals("idSocio", bean.getIdSocio());
		Assert.assertEquals("indicadorEliminacion", bean.getIndicadorEliminacion());
		Assert.assertEquals("moneda", bean.getMoneda());
		Assert.assertEquals(new BigDecimal(10.20), bean.getMontoDeApertura());
		Assert.assertEquals("movimientoCorrelativo", bean.getMovimientoCorrelativo());
		Assert.assertEquals("observacion", bean.getObservacion());
		Assert.assertEquals(new BigDecimal(100.20), bean.getSaldoCapital());
		
	}
	
}
