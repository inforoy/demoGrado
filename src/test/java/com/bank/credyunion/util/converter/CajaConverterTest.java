package com.bank.credyunion.util.converter;

import java.math.BigDecimal;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.CajaBean;
import com.bank.credyunion.domain.T002_Caja;

public class CajaConverterTest {
	
	@Test
	public void CajaConverter_BeanToPojo(){
		CajaBean bean = new CajaBean();
		bean.setCodigoDeUsuario("codigoDeUsuario");
		bean.setDocumentoDeReferencia("documentoDeReferencia");
		bean.setEgresoTotal(new BigDecimal(15.25));
		bean.setFechaDeProceso(new Date("12/12/2016"));
		bean.setIdAgencia("idAgencia");
		bean.setIdCaja("idCaja");
		bean.setIndicadorEliminacion("indicadorEliminacion");
		bean.setIngresoTotal(new BigDecimal(17.25));
		bean.setMontoDeCierre(new BigDecimal(20.25));
		bean.setNombreDeUsuario("nombreDeUsuario");
		bean.setSaldoFinal(new BigDecimal(200.25));
		bean.setSaldoInicial(new BigDecimal(205.25));
		
		T002_Caja model = CajaConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals("codigoDeUsuario", model.getCodigoDeUsuario());
		Assert.assertEquals("documentoDeReferencia", model.getDocumentoDeReferencia());
		Assert.assertEquals(new BigDecimal(15.25), model.getEgresoTotal());
		Assert.assertEquals(new Date("12/12/2016"), model.getFechaDeProceso());
		Assert.assertEquals("idAgencia", model.getIdAgencia());
		Assert.assertEquals("idCaja", model.getIdCaja());
		Assert.assertEquals("indicadorEliminacion", model.getIndicadorEliminacion());
		Assert.assertEquals(new BigDecimal(17.25), model.getIngresoTotal());
		Assert.assertEquals(new BigDecimal(20.25), model.getMontoDeCierre());
		Assert.assertEquals("nombreDeUsuario", model.getNombreDeUsuario());
		Assert.assertEquals(new BigDecimal(200.25), model.getSaldoFinal());
		Assert.assertEquals(new BigDecimal(205.25), model.getSaldoInicial());
		
	}
	
	@Test
	public void CajaConverter_PojoToBean(){
		T002_Caja model = new T002_Caja();
		model.setCodigoDeUsuario("codigoDeUsuario");
		model.setDocumentoDeReferencia("documentoDeReferencia");
		model.setEgresoTotal(new BigDecimal(15.25));
		model.setFechaDeProceso(new Date("12/12/2016"));
		model.setIdAgencia("idAgencia");
		model.setIdCaja("idCaja");
		model.setIndicadorEliminacion("indicadorEliminacion");
		model.setIngresoTotal(new BigDecimal(17.25));
		model.setMontoDeCierre(new BigDecimal(20.25));
		model.setNombreDeUsuario("nombreDeUsuario");
		model.setSaldoFinal(new BigDecimal(200.25));
		model.setSaldoInicial(new BigDecimal(205.25));
		
		CajaBean bean = CajaConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals("codigoDeUsuario", bean.getCodigoDeUsuario());
		Assert.assertEquals("documentoDeReferencia", bean.getDocumentoDeReferencia());
		Assert.assertEquals(new BigDecimal(15.25), bean.getEgresoTotal());
		Assert.assertEquals(new Date("12/12/2016"), bean.getFechaDeProceso());
		Assert.assertEquals("idAgencia", bean.getIdAgencia());
		Assert.assertEquals("idCaja", bean.getIdCaja());
		Assert.assertEquals("indicadorEliminacion", bean.getIndicadorEliminacion());
		Assert.assertEquals(new BigDecimal(17.25), bean.getIngresoTotal());
		Assert.assertEquals(new BigDecimal(20.25), bean.getMontoDeCierre());
		Assert.assertEquals("nombreDeUsuario", bean.getNombreDeUsuario());
		Assert.assertEquals(new BigDecimal(200.25), bean.getSaldoFinal());
		Assert.assertEquals(new BigDecimal(205.25), bean.getSaldoInicial());
		
	}
	
}
