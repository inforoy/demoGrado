package com.bank.credyunion.util.converter;

import java.math.BigDecimal;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.SolicitudCreditoBean;
import com.bank.credyunion.domain.T019_SolicitudCredito;

public class SolicitudCreditoConverterTest {
	
	@Test
	public void SolicitudCreditoConverter_BeanToPojo(){
		SolicitudCreditoBean bean = new SolicitudCreditoBean();
		bean.setCodigoAgencia("codigoAgencia");
		bean.setCodigoUsuario("codigoUsuario");
		bean.setFechaDeSolicitud(new Date("10/15/2016"));
		bean.setFechaDeVencimiento(new Date("10/20/2016"));
		bean.setIdProductoCredito("idProductoCredito");
		bean.setIdSolicitudCredito("idSolicitudCredito");
		bean.setIndicadorEliminacion("indicadorEliminacion");
		bean.setMoneda("moneda");
		bean.setMontoSolicitado(new BigDecimal(10.0));
		bean.setNumeroCuotas(100);
		bean.setPrimeraFechaPago(new Date("10/12/2016"));
		bean.setTasaDeCuota(new BigDecimal(5.0));
		bean.setTasaMoratoria(new BigDecimal(15.0));
		
		T019_SolicitudCredito model = SolicitudCreditoConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals("codigoAgencia", model.getCodigoAgencia());
		Assert.assertEquals("codigoUsuario", model.getCodigoUsuario());
		Assert.assertEquals(new Date("10/15/2016"), model.getFechaDeSolicitud());
		Assert.assertEquals(new Date("10/20/2016"), model.getFechaDeVencimiento());
		Assert.assertEquals("idProductoCredito", model.getIdProductoCredito());
		Assert.assertEquals("idSolicitudCredito", model.getIdSolicitudCredito());
		Assert.assertEquals("indicadorEliminacion", model.getIndicadorEliminacion());
		Assert.assertEquals("moneda", model.getMoneda());
		Assert.assertEquals(new BigDecimal(10.0), model.getMontoSolicitado());
		Assert.assertEquals(100, model.getNumeroCuotas());
		Assert.assertEquals(new Date("10/12/2016"), model.getPrimeraFechaPago());
		Assert.assertEquals(new BigDecimal(5.0), model.getTasaDeCuota());
		Assert.assertEquals(new BigDecimal(15.0), model.getTasaMoratoria());
		
	}
	
	@Test
	public void SolicitudCreditoConverter_PojoToBean(){
		T019_SolicitudCredito model = new T019_SolicitudCredito();
		model.setCodigoAgencia("codigoAgencia");
		model.setCodigoUsuario("codigoUsuario");
		model.setFechaDeSolicitud(new Date("10/15/2016"));
		model.setFechaDeVencimiento(new Date("10/20/2016"));
		model.setIdProductoCredito("idProductoCredito");
		model.setIdProductoCredito("idProductoCredito");
		model.setIdSolicitudCredito("idSolicitudCredito");
		model.setIndicadorEliminacion("indicadorEliminacion");
		model.setMoneda("moneda");
		model.setMontoSolicitado(new BigDecimal(10.0));
		model.setNumeroCuotas(100);
		model.setPrimeraFechaPago(new Date("10/12/2016"));
		model.setTasaDeCuota(new BigDecimal(5.0));
		model.setTasaMoratoria(new BigDecimal(15.0));
		
		SolicitudCreditoBean bean = SolicitudCreditoConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals("codigoAgencia", bean.getCodigoAgencia());
		Assert.assertEquals("codigoUsuario", bean.getCodigoUsuario());
		Assert.assertEquals(new Date("10/15/2016"), bean.getFechaDeSolicitud());
		Assert.assertEquals(new Date("10/20/2016"), bean.getFechaDeVencimiento());
		Assert.assertEquals("idProductoCredito", bean.getIdProductoCredito());
		Assert.assertEquals("idSolicitudCredito", bean.getIdSolicitudCredito());
		Assert.assertEquals("indicadorEliminacion", bean.getIndicadorEliminacion());
		Assert.assertEquals("moneda", bean.getMoneda());
		Assert.assertEquals(new BigDecimal(10.0), bean.getMontoSolicitado());
		Assert.assertEquals(100, bean.getNumeroCuotas());
		Assert.assertEquals(new Date("10/12/2016"), bean.getPrimeraFechaPago());
		Assert.assertEquals(new BigDecimal(5.0), bean.getTasaDeCuota());
		Assert.assertEquals(new BigDecimal(15.0), bean.getTasaMoratoria());
	}
	
}
