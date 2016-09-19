package com.bank.credyunion.util.converter;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.UsuarioBean;
import com.bank.credyunion.domain.T020_Usuario;

public class UsuarioConverterTest {
	
	@Test
	public void usuarioConverterTest_BeanToModel(){
		UsuarioBean usuarioBean = new UsuarioBean();
		usuarioBean.setIdUsuario("10");
		usuarioBean.setNombreUsuario("roy");
		usuarioBean.setContrasenia("123");
		usuarioBean.setNombres("Roy W");
		usuarioBean.setApellidoPaterno("Calle");
		usuarioBean.setApellidoMaterno("Sulca");
		usuarioBean.setIndicadorEliminacion("0");
		
		T020_Usuario usuarioModel = UsuarioConverter.parseConverter_FromBeanToPojo(usuarioBean);
		
		Assert.assertEquals("10", usuarioModel.getIdUsuario());
		Assert.assertEquals("roy", usuarioModel.getNombreUsuario());
		Assert.assertEquals("123", usuarioModel.getContrasenia());
		Assert.assertEquals("Roy W", usuarioModel.getNombres());
		Assert.assertEquals("Calle", usuarioModel.getApellidoPaterno());
		Assert.assertEquals("Sulca", usuarioModel.getApellidoMaterno());
		Assert.assertEquals("0", usuarioModel.getIndicadorEliminacion());
	}
	
	@Test
	public void usuarioConverterTest_ModelToBean(){
		T020_Usuario usuarioBean = new T020_Usuario();
		usuarioBean.setIdUsuario("10");
		usuarioBean.setNombreUsuario("roy");
		usuarioBean.setContrasenia("123");
		usuarioBean.setNombres("Roy W");
		usuarioBean.setApellidoPaterno("Calle");
		usuarioBean.setApellidoMaterno("Sulca");
		usuarioBean.setIndicadorEliminacion("0");
		
		UsuarioBean usuarioModel = UsuarioConverter.parseConverter_FromPojoToBean(usuarioBean);
		
		Assert.assertEquals("10", usuarioModel.getIdUsuario());
		Assert.assertEquals("roy", usuarioModel.getNombreUsuario());
		Assert.assertEquals("123", usuarioModel.getContrasenia());
		Assert.assertEquals("Roy W", usuarioModel.getNombres());
		Assert.assertEquals("Calle", usuarioModel.getApellidoPaterno());
		Assert.assertEquals("Sulca", usuarioModel.getApellidoMaterno());
		Assert.assertEquals("0", usuarioModel.getIndicadorEliminacion());
	}
}
