package com.bank.credyunion.util.converter;

import java.math.BigDecimal;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.CajaChicaBean;
import com.bank.credyunion.domain.T003_CajaChica;

public class CajaChicaConverterTest {

	@Test
	public void CajaChicaConverter_BeanToPojo(){
		CajaChicaBean bean = new CajaChicaBean();
		bean.setDocumentoDeReferencia("documentoDeReferencia");
		bean.setEngresoTotal(new BigDecimal(10.25));
		bean.setFechaDeProceso(new Date("10/10/2016"));
		bean.setIdCajaChica("idCajaChica");
		bean.setIdProductoCajaChica("idProductoCajaChica");
		bean.setIdSocio("idSocio");
		bean.setIndicadorEliminacion("indicadorEliminacion");
		bean.setIngresoTotal(new BigDecimal(11.25));
		bean.setSaldoDeCierre(new BigDecimal(15.25));
		
		T003_CajaChica model = CajaChicaConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals("documentoDeReferencia", model.getDocumentoDeReferencia());
		Assert.assertEquals(new BigDecimal(10.25), model.getEngresoTotal());
		Assert.assertEquals(new Date("10/10/2016"), model.getFechaDeProceso());
		Assert.assertEquals("idCajaChica", model.getIdCajaChica());
		Assert.assertEquals("idProductoCajaChica", model.getIdProductoCajaChica());
		Assert.assertEquals("idSocio", model.getIdSocio());
		Assert.assertEquals("indicadorEliminacion", model.getIndicadorEliminacion());
		Assert.assertEquals(new BigDecimal(11.25), model.getIngresoTotal());
		Assert.assertEquals(new BigDecimal(15.25), model.getSaldoDeCierre());
	}
	
	@Test
	public void CajaChicaConverter_PojoToBean(){
		T003_CajaChica model = new T003_CajaChica();
		model.setDocumentoDeReferencia("documentoDeReferencia");
		model.setEngresoTotal(new BigDecimal(10.25));
		model.setFechaDeProceso(new Date("10/10/2016"));
		model.setIdCajaChica("idCajaChica");
		model.setIdProductoCajaChica("idProductoCajaChica");
		model.setIdSocio("idSocio");
		model.setIndicadorEliminacion("indicadorEliminacion");
		model.setIngresoTotal(new BigDecimal(11.25));
		model.setSaldoDeCierre(new BigDecimal(15.25));
		
		CajaChicaBean bean = CajaChicaConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals("documentoDeReferencia", bean.getDocumentoDeReferencia());
		Assert.assertEquals(new BigDecimal(10.25), bean.getEngresoTotal());
		Assert.assertEquals(new Date("10/10/2016"), bean.getFechaDeProceso());
		Assert.assertEquals("idCajaChica", bean.getIdCajaChica());
		Assert.assertEquals("idProductoCajaChica", bean.getIdProductoCajaChica());
		Assert.assertEquals("idSocio", bean.getIdSocio());
		Assert.assertEquals("indicadorEliminacion", bean.getIndicadorEliminacion());
		Assert.assertEquals(new BigDecimal(11.25), bean.getIngresoTotal());
		Assert.assertEquals(new BigDecimal(15.25), bean.getSaldoDeCierre());
	}
	
}
