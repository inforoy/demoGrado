package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.model.T020_Usuario;

public interface UserRepository {
	
	boolean registerUser(T020_Usuario usuarioModel);
	boolean updateUser(T020_Usuario usuarioModel);
	boolean deleteUser(T020_Usuario usuarioModel);
	T020_Usuario findUserById(T020_Usuario usuarioModel);
	List<T020_Usuario> findAllUsers();
	/*
	public List<Usuario> listUsers();
    
    public Usuario getUserById(int id);
     
    public boolean insertUser(Usuario user);
    
    public boolean updateUser(Usuario user);
     
    public boolean deleteUser(Usuario usuario);
	 */
}
