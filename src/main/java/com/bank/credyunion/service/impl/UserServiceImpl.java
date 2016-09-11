package com.bank.credyunion.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.UsuarioBean;
import com.bank.credyunion.model.T020_Usuario;
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
	public boolean registerUser(UsuarioBean usuarioBean) {
		T020_Usuario usuarioModel = UsuarioConverter.parseToUsuarioModel(usuarioBean);
		boolean result = userRepository.registerUser(usuarioModel);
		return result;
	}

	@Override
	public boolean updateUser(UsuarioBean usuarioBean) {
		T020_Usuario usuarioModel = UsuarioConverter.parseToUsuarioModel(usuarioBean);
		boolean result = userRepository.updateUser(usuarioModel);
		return result;
	}

	@Override
	public boolean deleteUser(UsuarioBean usuarioBean) {
		T020_Usuario usuarioModel = UsuarioConverter.parseToUsuarioModel(usuarioBean);
		boolean result = userRepository.deleteUser(usuarioModel);
		return result;
	}

	@Override
	public UsuarioBean findUserById(UsuarioBean usuarioBean) {
		T020_Usuario userModel = UsuarioConverter.parseToUsuarioModel(usuarioBean);
		if(StringUtils.isNotBlank(String.valueOf(userModel.getIdUsuario()))){
			userRepository.findUserById(userModel);
		} else {
			// INGRESE EL ID DE USUARIO
			// USUARIO NO ENCONTRADO
		}
		return null;
	}

	@Override
	public List<UsuarioBean> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
