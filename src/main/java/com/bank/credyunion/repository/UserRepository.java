package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.model.UsuarioModel;

public interface UserRepository {
	
	public boolean registrarUsuario(UsuarioModel usuario);
	/*
	public List<Usuario> listUsers();
    
    public Usuario getUserById(int id);
     
    public boolean insertUser(Usuario user);
    
    public boolean updateUser(Usuario user);
     
    public boolean deleteUser(Usuario usuario);
	 */
}
