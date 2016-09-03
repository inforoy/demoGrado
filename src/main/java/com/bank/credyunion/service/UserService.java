package com.bank.credyunion.service;

import com.bank.credyunion.bean.UsuarioBean;

public interface UserService {
	/**
	 * Metodo que registra en usuario
	 * @param usuario
	 * @return
	 */
	boolean registrarUsuario(UsuarioBean usuarioBean);
}
