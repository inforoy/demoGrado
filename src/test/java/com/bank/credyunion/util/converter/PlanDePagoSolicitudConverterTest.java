package com.bank.credyunion.util.converter;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.PlanDePagoSolicitudBean;
import com.bank.credyunion.domain.T014_PlanDePagoSolicitud;

public class PlanDePagoSolicitudConverterTest {
	
	@Test
	public void PlanDePagoSolicitudConverter_BeanToPojo(){
		PlanDePagoSolicitudBean bean = new PlanDePagoSolicitudBean();
		//bean.setCapital(capital);
		Assert.assertEquals("", "");
	}
	
	@Test
	public void PlanDePagoSolicitudConverter_PojoToBean(){
		T014_PlanDePagoSolicitud model = new T014_PlanDePagoSolicitud();
		Assert.assertEquals("", "");
	}
	
}
