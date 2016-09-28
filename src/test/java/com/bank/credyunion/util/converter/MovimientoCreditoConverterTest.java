package com.bank.credyunion.util.converter;

import java.math.BigDecimal;
import java.util.Date;

import junit.framework.Assert;

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
	public void MovimientoCreditoConverter_PojoToBean(){
		T009_MovimientoCredito model = new T009_MovimientoCredito();
		model.setIdMovimientoCredito("yyy");
		model.setIdCredito("idCredito");
		model.setIdOperation("idOperacion");
		model.setCapitalActual(new BigDecimal(12.33));
		model.setCapitalAnterior(new BigDecimal(15.43));
		model.setMontoDeMovimiento(new BigDecimal(17.43));
		model.setFechaDeMovimiento(new Date("10/12/2016"));
		model.setMovimientoCorrelativo("movimientoCorrelativo");
		model.setNumeroMovimiento("numeroMovimiento");
		model.setCodigoDeOperacion("codigoDeOperacion");
		model.setMontoDelCapital(new BigDecimal(27.43));
		model.setMontoDelInteres(new BigDecimal(37.43));
		model.setMontoDeMora(new BigDecimal(137.43));
		model.setMontoDelCargo(new BigDecimal(237.43));
		model.setCodigoUsuario("codigoUsuario");
		model.setCodigoAgencia("codigoAgencia");
		model.setIndicadorEliminacion("indicadorEliminacion");

		MovimientoCreditoBean bean = MovimientoCreditoConverter.parseConverter_FromPojoToBean(model);
		Assert.assertEquals("yyy", bean.getIdMovimientoCredito());
		Assert.assertEquals("idCredito", bean.getIdCredito());
		Assert.assertEquals("idOperacion", bean.getIdOperation());
		Assert.assertEquals(new BigDecimal(12.33), bean.getCapitalActual());
		Assert.assertEquals(new BigDecimal(15.43), bean.getCapitalAnterior());
		Assert.assertEquals(new BigDecimal(17.43), bean.getMontoDeMovimiento());
		Assert.assertEquals(new Date("10/12/2016"), bean.getFechaDeMovimiento());
		Assert.assertEquals("movimientoCorrelativo", bean.getMovimientoCorrelativo());
		Assert.assertEquals("numeroMovimiento", bean.getNumeroMovimiento());
		Assert.assertEquals("codigoDeOperacion", bean.getCodigoDeOperacion());
		Assert.assertEquals(new BigDecimal(27.43), bean.getMontoDelCapital());
		Assert.assertEquals(new BigDecimal(37.43), bean.getMontoDelInteres());
		Assert.assertEquals(new BigDecimal(137.43), bean.getMontoDeMora());
		Assert.assertEquals(new BigDecimal(237.43), bean.getMontoDelCargo());
		Assert.assertEquals("codigoUsuario", bean.getCodigoUsuario());
		Assert.assertEquals("codigoAgencia", bean.getCodigoAgencia());
		Assert.assertEquals("indicadorEliminacion", bean.getIndicadorEliminacion());

	}
	
}
