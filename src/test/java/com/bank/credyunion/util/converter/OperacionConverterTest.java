package com.bank.credyunion.util.converter;

import java.math.BigDecimal;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.OperacionBean;
import com.bank.credyunion.domain.T011_Operacion;

public class OperacionConverterTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void OperacionConverter_BeanToPojo(){
		String codigoAgencia = "codigoAgencia";
		String codigoDeOperacion = "codigoDeOperacion";
		String codigoSocio = "codigoSocio";
		String codigoUsuario = "codigoUsuario";
		String documentoDeReferencia = "documentoDeReferencia";
		String idOperacion = "idOperacion";
		String indicadorEliminacion = "indicadorEliminacion";
		String indicadorMovimiento = "indicadorMovimiento";
		String moneda = "moneda";
		String nombreSocio = "nombreSocio";
		String numeroTransaccion = "numeroTransaccion";
		String observacion = "observacion";
		String operacionCorrelativa = "operacionCorrelativa";
		Date fechaDeOperacion = new Date("12/12/2016");
		BigDecimal montoMovimiento = new BigDecimal(15.32);
		
		OperacionBean bean = new OperacionBean();
		bean.setCodigoAgencia(codigoAgencia);
		bean.setCodigoDeOperacion(codigoDeOperacion);
		bean.setCodigoSocio(codigoSocio);
		bean.setCodigoUsuario(codigoUsuario);
		bean.setDocumentoDeReferencia(documentoDeReferencia);
		bean.setFechaDeOperacion(fechaDeOperacion);
		bean.setIdOperacion(idOperacion);
		bean.setIndicadorEliminacion(indicadorEliminacion);
		bean.setIndicadorMovimiento(indicadorMovimiento);
		bean.setMoneda(moneda);
		bean.setMontoMovimiento(montoMovimiento);
		bean.setNombreSocio(nombreSocio);
		bean.setNumeroTransaccion(numeroTransaccion);
		bean.setObservacion(observacion);
		bean.setOperacionCorrelativa(operacionCorrelativa);

		T011_Operacion model = OperacionConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals(codigoAgencia, model.getCodigoAgencia());
		Assert.assertEquals(codigoDeOperacion, model.getCodigoDeOperacion());
		Assert.assertEquals(codigoSocio, model.getCodigoSocio());
		Assert.assertEquals(codigoUsuario, model.getCodigoUsuario());
		Assert.assertEquals(documentoDeReferencia, model.getDocumentoDeReferencia());
		Assert.assertEquals(fechaDeOperacion, model.getFechaDeOperacion());
		Assert.assertEquals(idOperacion, model.getIdOperacion());
		Assert.assertEquals(indicadorEliminacion, model.getIndicadorEliminacion());
		Assert.assertEquals(indicadorMovimiento, model.getIndicadorMovimiento());
		Assert.assertEquals(moneda, model.getMoneda());
		Assert.assertEquals(montoMovimiento, model.getMontoMovimiento());
		Assert.assertEquals(nombreSocio, model.getNombreSocio());
		Assert.assertEquals(numeroTransaccion, model.getNumeroTransaccion());
		Assert.assertEquals(observacion, model.getObservacion());
		Assert.assertEquals(operacionCorrelativa, model.getOperacionCorrelativa());
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void OperacionConverter_PojoToBean(){
		String codigoAgencia = "codigoAgencia";
		String codigoDeOperacion = "codigoDeOperacion";
		String codigoSocio = "codigoSocio";
		String codigoUsuario = "codigoUsuario";
		String documentoDeReferencia = "documentoDeReferencia";
		String idOperacion = "idOperacion";
		String indicadorEliminacion = "indicadorEliminacion";
		String indicadorMovimiento = "indicadorMovimiento";
		String moneda = "moneda";
		String nombreSocio = "nombreSocio";
		String numeroTransaccion = "numeroTransaccion";
		String observacion = "observacion";
		String operacionCorrelativa = "operacionCorrelativa";
		Date fechaDeOperacion = new Date("12/12/2016");
		BigDecimal montoMovimiento = new BigDecimal(15.32);
		
		T011_Operacion model = new T011_Operacion();
		model.setCodigoAgencia(codigoAgencia);
		model.setCodigoDeOperacion(codigoDeOperacion);
		model.setCodigoSocio(codigoSocio);
		model.setCodigoUsuario(codigoUsuario);
		model.setDocumentoDeReferencia(documentoDeReferencia);
		model.setFechaDeOperacion(fechaDeOperacion);
		model.setIdOperacion(idOperacion);
		model.setIndicadorEliminacion(indicadorEliminacion);
		model.setIndicadorMovimiento(indicadorMovimiento);
		model.setMoneda(moneda);
		model.setMontoMovimiento(montoMovimiento);
		model.setNombreSocio(nombreSocio);
		model.setNumeroTransaccion(numeroTransaccion);
		model.setObservacion(observacion);
		model.setOperacionCorrelativa(operacionCorrelativa);
		
		OperacionBean bean = OperacionConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals(codigoAgencia, bean.getCodigoAgencia());
		Assert.assertEquals(codigoDeOperacion, bean.getCodigoDeOperacion());
		Assert.assertEquals(codigoSocio, bean.getCodigoSocio());
		Assert.assertEquals(codigoUsuario, bean.getCodigoUsuario());
		Assert.assertEquals(documentoDeReferencia, bean.getDocumentoDeReferencia());
		Assert.assertEquals(fechaDeOperacion, bean.getFechaDeOperacion());
		Assert.assertEquals(idOperacion, bean.getIdOperacion());
		Assert.assertEquals(indicadorEliminacion, bean.getIndicadorEliminacion());
		Assert.assertEquals(indicadorMovimiento, bean.getIndicadorMovimiento());
		Assert.assertEquals(moneda, bean.getMoneda());
		Assert.assertEquals(montoMovimiento, bean.getMontoMovimiento());
		Assert.assertEquals(nombreSocio, bean.getNombreSocio());
		Assert.assertEquals(numeroTransaccion, bean.getNumeroTransaccion());
		Assert.assertEquals(observacion, bean.getObservacion());
		Assert.assertEquals(operacionCorrelativa, bean.getOperacionCorrelativa());
		
	}
	
}
