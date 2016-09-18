package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.UsuarioBean;

public interface UsuarioService {

	boolean registerUsuario(UsuarioBean usuarioBean);
	boolean updateUsuario(UsuarioBean usuarioBean);
	boolean deleteUsuario(UsuarioBean usuarioBean);
	UsuarioBean findUsuarioById(UsuarioBean usuarioBean);
	List<UsuarioBean> findAllUsuarios();

}