package com.bank.credyunion.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.UsuarioBean;
import com.bank.credyunion.domain.T020_Usuario;
import com.bank.credyunion.repository.UsuarioRepository;
import com.bank.credyunion.service.UsuarioService;
import com.bank.credyunion.util.converter.UsuarioConverter;

@Service("userService")
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public boolean registerUsuario(UsuarioBean usuarioBean) {
		// validar que el usuario ya existe
		int count = usuarioRepository.getNextUsuario();
		usuarioBean.setIdUsuario(String.valueOf(count));
		usuarioBean.setIndicadorEliminacion("0");
		T020_Usuario usuarioModel = UsuarioConverter.parseConverter_FromBeanToPojo(usuarioBean);
		boolean result = usuarioRepository.registerUsuario(usuarioModel);
		return result;
	}

	@Override
	public boolean updateUsuario(UsuarioBean usuarioBean) {
		T020_Usuario usuarioModel = UsuarioConverter.parseConverter_FromBeanToPojo(usuarioBean);
		boolean result = usuarioRepository.updateUsuario(usuarioModel);
		return result;
	}

	@Override
	public boolean deleteUsuario(UsuarioBean usuarioBean) {
		usuarioBean.setIndicadorEliminacion("1");
		T020_Usuario usuarioModel = UsuarioConverter.parseConverter_FromBeanToPojo(usuarioBean);
		boolean result = usuarioRepository.deleteUsuario(usuarioModel);
		return result;
	}

	@Override
	public UsuarioBean findUsuarioById(UsuarioBean usuarioBean) {
		T020_Usuario usuarioModel = UsuarioConverter.parseConverter_FromBeanToPojo(usuarioBean);
		usuarioModel = usuarioRepository.findUsuarioById(usuarioModel);
		UsuarioBean newUsuario = UsuarioConverter.parseConverter_FromPojoToBean(usuarioModel);
		return newUsuario;
	}

	@Override
	public List<UsuarioBean> findAllUsuarios() {
		List<T020_Usuario> listUsers = usuarioRepository.findAllUsuarios();
		List<UsuarioBean> listadoUsuarios = new ArrayList<UsuarioBean>();
		for (T020_Usuario item : listUsers) {
			UsuarioBean usuario = UsuarioConverter.parseConverter_FromPojoToBean(item);
			listadoUsuarios.add(usuario);
		}
		return listadoUsuarios;
	}
	
}
