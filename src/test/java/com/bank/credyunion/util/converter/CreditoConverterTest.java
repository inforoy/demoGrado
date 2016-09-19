package com.bank.credyunion.util.converter;

import java.math.BigDecimal;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.CreditoBean;
import com.bank.credyunion.domain.T004_Credito;

public class CreditoConverterTest {

	@Test
	public void CreditoConverter_BeanToPojo(){
		CreditoBean bean = new CreditoBean();
		bean.setCantidadDeCuotas(1);
		bean.setCodigoAgencia("codigoAgencia");
		bean.setCodigoUsuario("codigoUsuario");
		bean.setEstadoCredito("estadoCredito");
		bean.setFechaDeAprobacion(new Date("10/10/2016"));
		bean.setFechaDeCancelacion(new Date("10/11/2016"));
		bean.setFechaDeVencimiento(new Date("10/12/2016"));
		bean.setIdCredito("idCredito");
		bean.setIdProductoCredito("idProductoCredito");
		bean.setIdSocio("idSocio");
		bean.setIdSolicitudCredito("idSolicitudCredito");
		bean.setIndicadorEliminacion("indicadorEliminacion");
		bean.setMoneda("moneda");
		bean.setMontoDeCredito(new BigDecimal(11.22));
		bean.setPrimeraFechaDePago(new Date("05/05/2016"));
		bean.setSaldoDeCredito(new BigDecimal(20.22));
		bean.setSaldoDeDeuda(new BigDecimal(16.22));
		bean.setSaldoDeInteres(new BigDecimal(19.22));
		bean.setSaldoDeMora(new BigDecimal(14.22));
		bean.setTasaDeCuota(new BigDecimal(61.22));
		bean.setTasaMoratoria(new BigDecimal(13.22));
		bean.setUltimaFechaDePago(new Date("11/11/2016"));
		
		T004_Credito model = CreditoConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals("codigoAgencia", model.getCodigoAgencia());
		Assert.assertEquals("codigoUsuario", model.getCodigoUsuario());
		Assert.assertEquals("estadoCredito", model.getEstadoCredito());
		Assert.assertEquals(new Date("10/10/2016"), model.getFechaDeAprobacion());
		Assert.assertEquals(new Date("10/11/2016"), model.getFechaDeCancelacion());
		Assert.assertEquals(new Date("10/12/2016"), model.getFechaDeVencimiento());
		Assert.assertEquals("idCredito", model.getIdCredito());
		Assert.assertEquals("idProductoCredito", model.getIdProductoCredito());
		Assert.assertEquals("idSocio", model.getIdSocio());
		Assert.assertEquals("idSolicitudCredito", model.getIdSolicitudCredito());
		Assert.assertEquals("indicadorEliminacion", model.getIndicadorEliminacion());
		Assert.assertEquals("moneda", model.getMoneda());
		Assert.assertEquals(new BigDecimal(11.22), model.getMontoDeCredito());
		Assert.assertEquals(new Date("05/05/2016"), model.getPrimeraFechaDePago());
		Assert.assertEquals(new BigDecimal(20.22), model.getSaldoDeCredito());
		Assert.assertEquals(new BigDecimal(16.22), model.getSaldoDeDeuda());
		Assert.assertEquals(new BigDecimal(19.22), model.getSaldoDeInteres());
		Assert.assertEquals(new BigDecimal(14.22), model.getSaldoDeMora());
		Assert.assertEquals(new BigDecimal(61.22), model.getTasaDeCuota());
		Assert.assertEquals(new BigDecimal(13.22), model.getTasaMoratoria());
		Assert.assertEquals(new Date("11/11/2016"), model.getUltimaFechaDePago());
		
	}
	
	@Test
	public void CreditoConverter_PojoToBean(){
		T004_Credito model = new T004_Credito();
		model.setCantidadDeCuotas(1);
		model.setCodigoAgencia("codigoAgencia");
		model.setCodigoUsuario("codigoUsuario");
		model.setEstadoCredito("estadoCredito");
		model.setFechaDeAprobacion(new Date("10/10/2016"));
		model.setFechaDeCancelacion(new Date("10/11/2016"));
		model.setFechaDeVencimiento(new Date("10/12/2016"));
		model.setIdCredito("idCredito");
		model.setIdProductoCredito("idProductoCredito");
		model.setIdSocio("idSocio");
		model.setIdSolicitudCredito("idSolicitudCredito");
		model.setIndicadorEliminacion("indicadorEliminacion");
		model.setMoneda("moneda");
		model.setMontoDeCredito(new BigDecimal(11.22));
		model.setPrimeraFechaDePago(new Date("05/05/2016"));
		model.setSaldoDeCredito(new BigDecimal(20.22));
		model.setSaldoDeDeuda(new BigDecimal(16.22));
		model.setSaldoDeInteres(new BigDecimal(19.22));
		model.setSaldoDeMora(new BigDecimal(14.22));
		model.setTasaDeCuota(new BigDecimal(61.22));
		model.setTasaMoratoria(new BigDecimal(13.22));
		model.setUltimaFechaDePago(new Date("11/11/2016"));
		
		CreditoBean bean = CreditoConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals("codigoAgencia", bean.getCodigoAgencia());
		Assert.assertEquals("codigoUsuario", bean.getCodigoUsuario());
		Assert.assertEquals("estadoCredito", bean.getEstadoCredito());
		Assert.assertEquals(new Date("10/10/2016"), bean.getFechaDeAprobacion());
		Assert.assertEquals(new Date("10/11/2016"), bean.getFechaDeCancelacion());
		Assert.assertEquals(new Date("10/12/2016"), bean.getFechaDeVencimiento());
		Assert.assertEquals("idCredito", bean.getIdCredito());
		Assert.assertEquals("idProductoCredito", bean.getIdProductoCredito());
		Assert.assertEquals("idSocio", bean.getIdSocio());
		Assert.assertEquals("idSolicitudCredito", bean.getIdSolicitudCredito());
		Assert.assertEquals("indicadorEliminacion", bean.getIndicadorEliminacion());
		Assert.assertEquals("moneda", bean.getMoneda());
		Assert.assertEquals(new BigDecimal(11.22), bean.getMontoDeCredito());
		Assert.assertEquals(new Date("05/05/2016"), bean.getPrimeraFechaDePago());
		Assert.assertEquals(new BigDecimal(20.22), bean.getSaldoDeCredito());
		Assert.assertEquals(new BigDecimal(16.22), bean.getSaldoDeDeuda());
		Assert.assertEquals(new BigDecimal(19.22), bean.getSaldoDeInteres());
		Assert.assertEquals(new BigDecimal(14.22), bean.getSaldoDeMora());
		Assert.assertEquals(new BigDecimal(61.22), bean.getTasaDeCuota());
		Assert.assertEquals(new BigDecimal(13.22), bean.getTasaMoratoria());
		Assert.assertEquals(new Date("11/11/2016"), bean.getUltimaFechaDePago());
		
	}
	
}
