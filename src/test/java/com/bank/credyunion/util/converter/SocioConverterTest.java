package com.bank.credyunion.util.converter;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.SocioBean;
import com.bank.credyunion.domain.T018_Socio;

public class SocioConverterTest {
	
	@Test
	public void SocioConverter_BeanToPojo(){
		SocioBean bean = new SocioBean();
		//bean.setApellidoMaterno(apellidoMaterno);
		
		Assert.assertEquals("", "");
	}
	
	@Test
	public void SocioConverter_PojoToBean(){
		T018_Socio model = new T018_Socio();
		
		Assert.assertEquals("", "");
	}
	
}
