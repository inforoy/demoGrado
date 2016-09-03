package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.UsuarioBean;
import com.bank.credyunion.model.UsuarioModel;

public class UsuarioConverter {

	
	public static UsuarioModel parseToUsuarioModel(UsuarioBean bean){
       UsuarioModel usuarioModel = new UsuarioModel();
       usuarioModel.setIdUsuario(bean.getIdUsuario());
       usuarioModel.setNombreUsuario(bean.getNombreUsuario());
       usuarioModel.setNombres(bean.getNombres());
       usuarioModel.setApellidoPaterno(bean.getApellidoPaterno());
       usuarioModel.setApellidoMaterno(bean.getApellidoMaterno());
       usuarioModel.setContraseniaUsuario(bean.getContraseniaUsuario());
       usuarioModel.setIndicadorEliminacion(bean.isIndicadorEliminacion());
       return usuarioModel;
	}
	
}
