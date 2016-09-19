package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T020_Usuario;

public class UsuarioMapper implements Serializable {
	
	private static final long serialVersionUID = -4769179327168144175L;
	
	public List<T020_Usuario> listUserMapper(List<Map<String, Object>> userMaps ) {
		List<T020_Usuario> listUsers = new LinkedList<T020_Usuario>();
		for (Map<String, Object> user : userMaps ) {
			T020_Usuario usuario = new T020_Usuario();
		    usuario.setIdUsuario( (String) user.get("id_usuario") );
		    usuario.setNombreUsuario( (String) user.get("usuario") );
		    usuario.setContrasenia( (String) user.get("contrasenia") );
		    usuario.setNombres( (String) user.get("nombres") );
		    usuario.setApellidoPaterno( (String) user.get("apellido_paterno") );
		    usuario.setApellidoMaterno( (String) user.get("apellido_materno") );
		    usuario.setIndicadorEliminacion( (String) user.get("indicador_eliminacion") );
		    listUsers.add(usuario);
		}
		return listUsers;
    }
}
