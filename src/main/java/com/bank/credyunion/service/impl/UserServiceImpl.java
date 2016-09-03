package com.bank.credyunion.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.UsuarioBean;
import com.bank.credyunion.model.UsuarioModel;
import com.bank.credyunion.repository.UserRepository;
import com.bank.credyunion.service.UserService;
import com.bank.credyunion.util.converter.UsuarioConverter;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	/* (non-Javadoc)
	 * @see com.bank.credyunion.service.UserService#registrarUsuario(com.bank.credyunion.model.Usuario)
	 */
	public boolean registrarUsuario(UsuarioBean usuarioBean) {
		UsuarioModel usuarioModel = new UsuarioModel();//UsuarioConverter.parseToUsuarioModel(usuarioBean);
		boolean result = userRepository.registrarUsuario(usuarioModel);
		return result;
	}

}
