package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.UsuarioBean;

public interface UserService {
	/**
	 * Metodo que registra en usuario
	 * @param usuario
	 * @return
	 */
	boolean registerUser(UsuarioBean usuarioBean);
	boolean updateUser(UsuarioBean usuarioBean);
	boolean deleteUser(UsuarioBean usuarioBean);
	UsuarioBean findUserById(UsuarioBean usuarioBean);
	List<UsuarioBean> findAllUsers();
}
