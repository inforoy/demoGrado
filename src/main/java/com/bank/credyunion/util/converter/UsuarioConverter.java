package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.UsuarioBean;
import com.bank.credyunion.domain.T020_Usuario;

public class UsuarioConverter {
	
	public static T020_Usuario parseConverter_FromBeanToPojo(UsuarioBean usuarioBean){
       T020_Usuario usuarioModel = new T020_Usuario();
       usuarioModel.setIdUsuario(usuarioBean.getIdUsuario());
       usuarioModel.setNombres(usuarioBean.getNombres());
       usuarioModel.setNombreUsuario(usuarioBean.getNombreUsuario());
       usuarioModel.setContrasenia(usuarioBean.getContrasenia());
       usuarioModel.setApellidoPaterno(usuarioBean.getApellidoPaterno());
       usuarioModel.setApellidoMaterno(usuarioBean.getApellidoMaterno());
       usuarioModel.setIndicadorEliminacion(usuarioBean.getIndicadorEliminacion());
       return usuarioModel;
	}
	
	public static UsuarioBean parseConverter_FromPojoToBean(T020_Usuario usuario){
		UsuarioBean usuarioBean = new UsuarioBean();
		usuarioBean.setIdUsuario(usuario.getIdUsuario());
		usuarioBean.setNombres(usuario.getNombres());
		usuarioBean.setNombreUsuario(usuario.getNombreUsuario());
		usuarioBean.setContrasenia(usuario.getContrasenia());
		usuarioBean.setApellidoPaterno(usuario.getApellidoPaterno());
		usuarioBean.setApellidoMaterno(usuario.getApellidoMaterno());
		usuarioBean.setIndicadorEliminacion(usuario.getIndicadorEliminacion());
	    return usuarioBean;
	}
	
}
