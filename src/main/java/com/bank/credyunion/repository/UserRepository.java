package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T020_Usuario;

public interface UserRepository {
	
	boolean registerUser(T020_Usuario usuarioModel);
	boolean updateUser(T020_Usuario usuarioModel);
	boolean deleteUser(T020_Usuario usuarioModel);
	T020_Usuario findUserById(T020_Usuario usuarioModel);
	List<T020_Usuario> findAllUsers();
	int getNextUser();
	
}
