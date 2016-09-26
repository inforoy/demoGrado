package com.bank.credyunion.util.converter;

import java.math.BigDecimal;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.MovimientoCuentaBean;
import com.bank.credyunion.domain.T010_MovimientoCuenta;

public class MovimientoCuentaConverterTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void MovimientoCuentaConverter_BeanToPojo(){
		String codigoDeOperacion = "codigoDeOperacion";
		String codigoUsuario = "codigoUsuario";
		String idCuenta = "idCuenta";
		String idMovimientoCuenta = "idMovimientoCuenta";
		String idOperation = "idOperation";
		String indicadorEliminacion = "indicadorEliminacion";
		Date fechaMovimiento = new Date("10/10/2016");
		BigDecimal montoMovimiento = new BigDecimal(12.30);
		String movimientoCorrelativo = "movimientoCorrelativo";
		BigDecimal saldoCapitalActual = new BigDecimal(16.30);
		BigDecimal saldoCapitalAnterior = new BigDecimal(19.30);
		
		MovimientoCuentaBean bean = new MovimientoCuentaBean();
		bean.setCodigoDeOperacion(codigoDeOperacion);
		bean.setCodigoUsuario(codigoUsuario);
		bean.setFechaMovimiento(fechaMovimiento);
		bean.setIdCuenta(idCuenta);
		bean.setIdMovimientoCuenta(idMovimientoCuenta);
		bean.setIdOperation(idOperation);
		bean.setIndicadorEliminacion(indicadorEliminacion);
		bean.setMontoMovimiento(montoMovimiento);
		bean.setMovimientoCorrelativo(movimientoCorrelativo);
		bean.setSaldoCapitalActual(saldoCapitalActual);
		bean.setSaldoCapitalAnterior(saldoCapitalAnterior);
		
		T010_MovimientoCuenta model = MovimientoCuentaConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals(codigoDeOperacion, model.getCodigoDeOperacion() );
		Assert.assertEquals(codigoUsuario, model.getCodigoUsuario() );
		Assert.assertEquals(fechaMovimiento, model.getFechaMovimiento() );
		Assert.assertEquals(idCuenta, model.getIdCuenta() );
		Assert.assertEquals(idMovimientoCuenta,  model.getIdMovimientoCuenta() );
		Assert.assertEquals(idOperation,  model.getIdOperation() );
		Assert.assertEquals(indicadorEliminacion,  model.getIndicadorEliminacion() );
		Assert.assertEquals(montoMovimiento,  model.getMontoMovimiento() );
		Assert.assertEquals(movimientoCorrelativo,  model.getMovimientoCorrelativo() );
		Assert.assertEquals(saldoCapitalActual,  model.getSaldoCapitalActual() );
		Assert.assertEquals(saldoCapitalAnterior,  model.getSaldoCapitalAnterior() );
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void MovimientoCuentaConverter_PojoToBean(){
		String codigoDeOperacion = "codigoDeOperacion";
		String codigoUsuario = "codigoUsuario";
		String idCuenta = "idCuenta";
		String idMovimientoCuenta = "idMovimientoCuenta";
		String idOperation = "idOperation";
		String indicadorEliminacion = "indicadorEliminacion";
		Date fechaMovimiento = new Date("10/10/2016");
		BigDecimal montoMovimiento = new BigDecimal(12.30);
		String movimientoCorrelativo = "movimientoCorrelativo";
		BigDecimal saldoCapitalActual = new BigDecimal(16.30);
		BigDecimal saldoCapitalAnterior = new BigDecimal(19.30);
		
		T010_MovimientoCuenta model = new T010_MovimientoCuenta();
		model.setCodigoDeOperacion(codigoDeOperacion);
		model.setCodigoUsuario(codigoUsuario);
		model.setFechaMovimiento(fechaMovimiento);
		model.setIdCuenta(idCuenta);
		model.setIdMovimientoCuenta(idMovimientoCuenta);
		model.setIdOperation(idOperation);
		model.setIndicadorEliminacion(indicadorEliminacion);
		model.setMontoMovimiento(montoMovimiento);
		model.setMovimientoCorrelativo(movimientoCorrelativo);
		model.setSaldoCapitalActual(saldoCapitalActual);
		model.setSaldoCapitalAnterior(saldoCapitalAnterior);
		
		MovimientoCuentaBean bean = MovimientoCuentaConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals(codigoDeOperacion, bean.getCodigoDeOperacion() );
		Assert.assertEquals(codigoUsuario, bean.getCodigoUsuario() );
		Assert.assertEquals(fechaMovimiento, bean.getFechaMovimiento() );
		Assert.assertEquals(idCuenta, bean.getIdCuenta() );
		Assert.assertEquals(idMovimientoCuenta,  bean.getIdMovimientoCuenta() );
		Assert.assertEquals(idOperation,  bean.getIdOperation() );
		Assert.assertEquals(indicadorEliminacion,  bean.getIndicadorEliminacion() );
		Assert.assertEquals(montoMovimiento,  bean.getMontoMovimiento() );
		Assert.assertEquals(movimientoCorrelativo,  bean.getMovimientoCorrelativo() );
		Assert.assertEquals(saldoCapitalActual,  bean.getSaldoCapitalActual() );
		Assert.assertEquals(saldoCapitalAnterior,  bean.getSaldoCapitalAnterior() );
		
	}
	
}
