package com.bank.credyunion.util.converter;

import java.math.BigDecimal;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

import com.bank.credyunion.bean.MovimientoCreditoBean;
import com.bank.credyunion.domain.T009_MovimientoCredito;

public class MovimientoCreditoConverterTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void MovimientoCreditoConverter_BeanToPojo(){
		BigDecimal capitalActual = new BigDecimal(12.03);
		BigDecimal capitalAnterior = new BigDecimal(13.03);
		BigDecimal montoDelCapital = new BigDecimal(14.03);
		BigDecimal montoDelCargo = new BigDecimal(15.03);
		BigDecimal montoDelInteres = new BigDecimal(16.03);
		BigDecimal montoDeMora = new BigDecimal(17.03);
		BigDecimal montoDeMovimiento = new BigDecimal(18.03);
		String codigoAgencia = "codigoAgencia";
		String codigoDeOperacion = "codigoDeOperacion";
		String codigoUsuario = "codigoUsuario";
		String idCredito = "idCredito";
		String idOperation = "idOperation";
		String indicadorEliminacion = "indicadorEliminacion";
		String idMovimientoCredito = "idMovimientoCredito";
		Date fechaDeMovimiento = new Date("25/10/2016");
		String movimientoCorrelativo = "movimientoCorrelativo";
		String numeroMovimiento = "numeroMovimiento";
		
		MovimientoCreditoBean bean = new MovimientoCreditoBean();
		bean.setCapitalActual(capitalActual);
		bean.setCapitalAnterior(capitalAnterior);
		bean.setCodigoAgencia(codigoAgencia);
		bean.setCodigoDeOperacion(codigoDeOperacion);
		bean.setCodigoUsuario(codigoUsuario);
		bean.setFechaDeMovimiento(fechaDeMovimiento);
		bean.setIdCredito(idCredito);
		bean.setIdMovimientoCredito(idMovimientoCredito);
		bean.setIdOperation(idOperation);
		bean.setIndicadorEliminacion(indicadorEliminacion);
		bean.setMontoDelCapital(montoDelCapital);
		bean.setMontoDelCargo(montoDelCargo);
		bean.setMontoDelInteres(montoDelInteres);
		bean.setMontoDeMora(montoDeMora);
		bean.setMontoDeMovimiento(montoDeMovimiento);
		bean.setMovimientoCorrelativo(movimientoCorrelativo);
		bean.setNumeroMovimiento(numeroMovimiento);
		
		T009_MovimientoCredito model = MovimientoCreditoConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals(capitalActual, model.getCapitalActual());
		Assert.assertEquals(capitalAnterior, model.getCapitalAnterior());
		Assert.assertEquals(codigoAgencia, model.getCodigoAgencia());
		Assert.assertEquals(codigoDeOperacion, model.getCodigoDeOperacion());
		Assert.assertEquals(codigoUsuario, model.getCodigoUsuario());
		Assert.assertEquals(fechaDeMovimiento, model.getFechaDeMovimiento());
		Assert.assertEquals(idCredito, model.getIdCredito());
		Assert.assertEquals(idMovimientoCredito, model.getIdMovimientoCredito());
		Assert.assertEquals(idOperation, model.getIdOperation());
		Assert.assertEquals(indicadorEliminacion, model.getIndicadorEliminacion());
		Assert.assertEquals(montoDelCapital, model.getMontoDelCapital());
		Assert.assertEquals(montoDelCargo, model.getMontoDelCargo());
		Assert.assertEquals(montoDelInteres, model.getMontoDelInteres());
		Assert.assertEquals(montoDeMora, model.getMontoDeMora());
		Assert.assertEquals(montoDeMovimiento, model.getMontoDeMovimiento());
		Assert.assertEquals(movimientoCorrelativo, model.getMovimientoCorrelativo());
		Assert.assertEquals(numeroMovimiento, model.getNumeroMovimiento());
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	@Ignore
	public void MovimientoCreditoConverter_PojoToBean(){
		BigDecimal capitalActual = new BigDecimal(12.03);
		BigDecimal capitalAnterior = new BigDecimal(13.03);
		BigDecimal montoDelCapital = new BigDecimal(14.03);
		BigDecimal montoDelCargo = new BigDecimal(15.03);
		BigDecimal montoDelInteres = new BigDecimal(16.03);
		BigDecimal montoDeMora = new BigDecimal(17.03);
		BigDecimal montoDeMovimiento = new BigDecimal(18.03);
		String codigoAgencia = "codigoAgencia";
		String codigoDeOperacion = "codigoDeOperacion";
		String codigoUsuario = "codigoUsuario";
		String idCredito = "idCredito";
		String idOperation = "idOperation";
		String indicadorEliminacion = "indicadorEliminacion";
		Date fechaDeMovimiento = new Date("25/10/2016");
		String numeroMovimiento = "numeroMovimiento";
		String idMovimientoCredito = "idMovimientoCredito";
		
		T009_MovimientoCredito model = new T009_MovimientoCredito();
		model.setCapitalActual(capitalActual);
		model.setCapitalAnterior(capitalAnterior);
		model.setCodigoAgencia(codigoAgencia);
		model.setCodigoDeOperacion(codigoDeOperacion);
		model.setCodigoUsuario(codigoUsuario);
		model.setFechaDeMovimiento(fechaDeMovimiento);
		model.setIdCredito(idCredito);
		model.setIdMovimientoCredito(idMovimientoCredito);
		model.setIdOperation(idOperation);
		model.setIndicadorEliminacion(indicadorEliminacion);
		model.setMontoDelCapital(montoDelCapital);
		model.setMontoDelCargo(montoDelCargo);
		model.setMontoDelInteres(montoDelInteres);
		model.setMontoDeMora(montoDeMora);
		model.setMontoDeMovimiento(montoDeMovimiento);
		model.setMovimientoCorrelativo("movimientoCorrelativo");
		model.setNumeroMovimiento(numeroMovimiento);
		
		MovimientoCreditoBean bean = MovimientoCreditoConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals(capitalActual, bean.getCapitalActual());
		Assert.assertEquals(capitalAnterior, bean.getCapitalAnterior());
		Assert.assertEquals(codigoAgencia, bean.getCodigoAgencia());
		Assert.assertEquals(codigoDeOperacion, bean.getCodigoDeOperacion());
		Assert.assertEquals(codigoUsuario, bean.getCodigoUsuario());
		Assert.assertEquals(fechaDeMovimiento, bean.getFechaDeMovimiento());
		Assert.assertEquals(idCredito, bean.getIdCredito());
		Assert.assertEquals(idMovimientoCredito, bean.getIdMovimientoCredito());
		Assert.assertEquals(idOperation, bean.getIdOperation());
		Assert.assertEquals(indicadorEliminacion, bean.getIndicadorEliminacion());
		Assert.assertEquals(montoDelCapital, bean.getMontoDelCapital());
		Assert.assertEquals(montoDelCargo, bean.getMontoDelCargo());
		Assert.assertEquals(montoDelInteres, bean.getMontoDelInteres());
		Assert.assertEquals(montoDeMora, bean.getMontoDeMora());
		Assert.assertEquals(montoDeMovimiento, bean.getMontoDeMovimiento());
		Assert.assertEquals("movimientoCorrelativo", bean.getMovimientoCorrelativo());
		Assert.assertEquals(numeroMovimiento, bean.getNumeroMovimiento());
		
	}
	
}
