package com.bank.credyunion.util.converter;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.AgenciaBean;
import com.bank.credyunion.domain.T001_Agencia;

public class AgenciaConverterTest {

	@Test
	public void AgenciaConverter_BeanToPojo(){
		AgenciaBean bean = new AgenciaBean();
		bean.setDescripcionAgencia("descripcionAgencia");
		bean.setIdAgencia("idAgencia");
		bean.setIdEmpresa("idEmpresa");
		bean.setIndicadorEliminacion("indicadorEliminacion");
		
		T001_Agencia model = AgenciaConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals("descripcionAgencia", model.getDescripcionAgencia());
		Assert.assertEquals("idAgencia", model.getIdAgencia());
		Assert.assertEquals("idEmpresa", model.getIdEmpresa());
		Assert.assertEquals("indicadorEliminacion", model.getIndicadorEliminacion());
	}
	
	@Test
	public void AgenciaConverter_PojoToBean(){
		T001_Agencia model = new T001_Agencia();
		model.setDescripcionAgencia("descripcionAgencia");
		model.setIdAgencia("idAgencia");
		model.setIdEmpresa("idEmpresa");
		model.setIndicadorEliminacion("indicadorEliminacion");
		
		AgenciaBean bean = AgenciaConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals("descripcionAgencia", bean.getDescripcionAgencia());
		Assert.assertEquals("idAgencia", bean.getIdAgencia());
		Assert.assertEquals("idEmpresa", bean.getIdEmpresa());
		Assert.assertEquals("indicadorEliminacion", bean.getIndicadorEliminacion());
	}
	
}
