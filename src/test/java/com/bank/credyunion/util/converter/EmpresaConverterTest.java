package com.bank.credyunion.util.converter;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.EmpresaBean;
import com.bank.credyunion.domain.T006_Empresa;

public class EmpresaConverterTest {

	@SuppressWarnings("deprecation")
	@Test
	public void EmpresaConverter_BeanToPojo(){
		EmpresaBean bean = new EmpresaBean();
		bean.setDescripcion("descripcion");
		bean.setFechaDeCreacion(new Date("10/10/2016"));
		bean.setIdEmpresa("idEmpresa");
		bean.setIndicadorEliminacion("indicadorEliminacion");
		
		T006_Empresa model = EmpresaConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals("descripcion", model.getDescripcion());
		Assert.assertEquals(new Date("10/10/2016"), model.getFechaDeCreacion());
		Assert.assertEquals("idEmpresa", model.getIdEmpresa());
		Assert.assertEquals("indicadorEliminacion", model.getIndicadorEliminacion());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void EmpresaConverter_PojoToBean(){
		T006_Empresa model = new T006_Empresa();
		model.setDescripcion("descripcion");
		model.setFechaDeCreacion(new Date("10/10/2016"));
		model.setIdEmpresa("idEmpresa");
		model.setIndicadorEliminacion("indicadorEliminacion");
		
		EmpresaBean bean = EmpresaConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals("descripcion", bean.getDescripcion());
		Assert.assertEquals(new Date("10/10/2016"), bean.getFechaDeCreacion());
		Assert.assertEquals("idEmpresa", bean.getIdEmpresa());
		Assert.assertEquals("indicadorEliminacion", bean.getIndicadorEliminacion());
	}
	
}
