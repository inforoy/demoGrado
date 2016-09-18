package com.bank.credyunion.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.UsuarioBean;
import com.bank.credyunion.domain.T020_Usuario;
import com.bank.credyunion.repository.UserRepository;
import com.bank.credyunion.service.UserService;
import com.bank.credyunion.util.converter.UsuarioConverter;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	/* (non-Javadoc)
	 * @see com.bank.credyunion.service.UserService#registrarUsuario(com.bank.credyunion.model.Usuario)
	 */
	public boolean registerUser(UsuarioBean usuarioBean) {
		// validar que el usuario ya existe
		int count = userRepository.getNextUser();
		usuarioBean.setIdUsuario(String.valueOf(count));
		usuarioBean.setIndicadorEliminacion("0");
		T020_Usuario usuarioModel = UsuarioConverter.parseConverter_FromUsuarioBeanToT020Usuario(usuarioBean);
		boolean result = userRepository.registerUser(usuarioModel);
		return result;
	}

	@Override
	public boolean updateUser(UsuarioBean usuarioBean) {
		T020_Usuario usuarioModel = UsuarioConverter.parseConverter_FromUsuarioBeanToT020Usuario(usuarioBean);
		boolean result = userRepository.updateUser(usuarioModel);
		return result;
	}

	@Override
	public boolean deleteUser(UsuarioBean usuarioBean) {
		usuarioBean.setIndicadorEliminacion("1");
		T020_Usuario usuarioModel = UsuarioConverter.parseConverter_FromUsuarioBeanToT020Usuario(usuarioBean);
		boolean result = userRepository.deleteUser(usuarioModel);
		return result;
	}

	@Override
	public UsuarioBean findUserById(UsuarioBean usuarioBean) {
		T020_Usuario usuarioModel = UsuarioConverter.parseConverter_FromUsuarioBeanToT020Usuario(usuarioBean);
		usuarioModel = userRepository.findUserById(usuarioModel);
		UsuarioBean newUsuario = UsuarioConverter.parseConverter_FromToT020UsuarioToUsuarioBean(usuarioModel);
		return newUsuario;
	}

	@Override
	public List<UsuarioBean> findAllUsers() {
		List<T020_Usuario> listUsers = userRepository.findAllUsers();
		List<UsuarioBean> listadoUsuarios = new ArrayList<UsuarioBean>();
		for (T020_Usuario item : listUsers) {
			UsuarioBean usuario = UsuarioConverter.parseConverter_FromToT020UsuarioToUsuarioBean(item);
			listadoUsuarios.add(usuario);
		}
		return listadoUsuarios;
	}
	
}
