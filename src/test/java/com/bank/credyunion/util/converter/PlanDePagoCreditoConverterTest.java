package com.bank.credyunion.util.converter;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.PlanDePagoCreditoBean;
import com.bank.credyunion.domain.T013_PlanDePagoCredito;

public class PlanDePagoCreditoConverterTest {
	
	@Test
	public void PlanDePagoCreditoConverter_BeanToPojo(){
		PlanDePagoCreditoBean bean = new PlanDePagoCreditoBean();
//		bean.setCapital(capital);
		Assert.assertEquals("", "");
	}
	
	@Test
	public void PlanDePagoCreditoConverter_PojoToBean(){
		T013_PlanDePagoCredito model = new T013_PlanDePagoCredito();
		Assert.assertEquals("", "");
	}
	
}
