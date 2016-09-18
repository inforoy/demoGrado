package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T020_Usuario;

public interface UsuarioRepository {
	
	boolean registerUsuario(T020_Usuario usuarioModel);
	boolean updateUsuario(T020_Usuario usuarioModel);
	boolean deleteUsuario(T020_Usuario usuarioModel);
	T020_Usuario findUsuarioById(T020_Usuario usuarioModel);
	List<T020_Usuario> findAllUsuarios();
	int getNextUsuario();
	
}