package com.bank.credyunion.util.converter;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.OperacionBean;
import com.bank.credyunion.domain.T011_Operacion;

public class OperacionConverterTest {
	
	@Test
	public void OperacionConverter_BeanToPojo(){
		OperacionBean bean = new OperacionBean();
//		bean.setCodigoAgencia(codigoAgencia);
		Assert.assertEquals("", "");
	}
	
	@Test
	public void OperacionConverter_PojoToBean(){
		T011_Operacion model = new T011_Operacion();
		Assert.assertEquals("", "");
	}
	
}
