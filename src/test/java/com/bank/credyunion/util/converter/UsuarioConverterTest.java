package com.bank.credyunion.util.converter;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.UsuarioBean;
import com.bank.credyunion.model.T020_Usuario;

public class UsuarioConverterTest {
	
	@Test
	public void usuarioConverterTest_1(){
		UsuarioBean usuarioBean = new UsuarioBean();
		usuarioBean.setIdUsuario("1000");
		usuarioBean.setNombreUsuario("roy");
		usuarioBean.setContrasenia("123");
		usuarioBean.setNombres("Roy W");
		usuarioBean.setApellidoPaterno("Calle");
		usuarioBean.setApellidoMaterno("Sulca");
		usuarioBean.setIndicadorEliminacion("0");
		
		T020_Usuario usuarioModel = UsuarioConverter.parseToUsuarioModel(usuarioBean);
		
		Assert.assertEquals("1000", usuarioModel.getIdUsuario());
		Assert.assertEquals("roy", usuarioModel.getNombreUsuario());
		Assert.assertEquals("123", usuarioModel.getContrasenia());
		Assert.assertEquals("Roy W", usuarioModel.getNombres());
		Assert.assertEquals("Calle", usuarioModel.getApellidoPaterno());
		Assert.assertEquals("Sulca", usuarioModel.getApellidoMaterno());
		Assert.assertEquals("0", usuarioModel.getIndicadorEliminacion());
	}
}
