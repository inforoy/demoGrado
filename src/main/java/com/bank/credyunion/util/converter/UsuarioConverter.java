package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.UsuarioBean;
import com.bank.credyunion.model.T020_Usuario;

public class UsuarioConverter {
	
	public static T020_Usuario parseToUsuarioModel(UsuarioBean usuarioBean){
       T020_Usuario usuarioModel = new T020_Usuario();
       usuarioModel.setIdUsuario(usuarioBean.getIdUsuario());
       usuarioModel.setNombres(usuarioBean.getNombres());
       usuarioModel.setNombreUsuario(usuarioBean.getNombreUsuario());
       usuarioModel.setContrasenia(usuarioBean.getContrasenia());
       usuarioModel.setApellidoMaterno(usuarioBean.getApellidoMaterno());
       usuarioModel.setApellidoPaterno(usuarioBean.getApellidoPaterno());
       usuarioModel.setIndicadorEliminacion(usuarioBean.getIndicadorEliminacion());
       return usuarioModel;
	}
	
}
