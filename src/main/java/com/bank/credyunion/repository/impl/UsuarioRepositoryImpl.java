package com.bank.credyunion.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.bank.credyunion.domain.T020_Usuario;
import com.bank.credyunion.repository.UsuarioRepository;
import com.bank.credyunion.repository.mapper.UserMapper;
import com.bank.credyunion.repository.utils.SqlUtilsUser;

@Repository("userRepository")
public class UsuarioRepositoryImpl implements UsuarioRepository {
	
	private static final int SQL_PARAMS_UNO = 1;
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean registerUser(T020_Usuario usuario) {
		String sqlInsert = SqlUtilsUser.getSQLRegisterUser();
		int result = jdbcTemplate.update(sqlInsert, new Object[] {
				usuario.getIdUsuario(),
				usuario.getNombreUsuario(),
				usuario.getContrasenia(),
				usuario.getNombres(),
				usuario.getApellidoPaterno(),
				usuario.getApellidoMaterno(),
				usuario.getIndicadorEliminacion()
			} );
		return result > 0 ? true : false;
	}
	
	@Override
	public boolean updateUser(T020_Usuario usuario) {
		String sqlUpdate = SqlUtilsUser.getSQLUpdateUser();
		int result = jdbcTemplate.update(sqlUpdate,new Object[] {
	    		usuario.getNombres(),
	    		usuario.getApellidoPaterno(),
				usuario.getApellidoMaterno(),
				usuario.getIdUsuario()
			});
		return result > 0 ? true : false;
	}
	
	@Override
	public boolean deleteUser(T020_Usuario usuario) {
		String sqlDelete = SqlUtilsUser.getSQLDeleteUser();
		int result = jdbcTemplate.update(sqlDelete,new Object[] {
				usuario.getIndicadorEliminacion(),
	    		usuario.getIdUsuario()
			});
		return result > 0 ? true : false;
	}
	
	@Override
	public T020_Usuario findUserById(T020_Usuario usuarioModel) {
		String sqlFindUserById = SqlUtilsUser.getSqlFindUserById();
        List<T020_Usuario> listAllUsers = new ArrayList<T020_Usuario>();
    	
        List<Map<String, Object>> rowUsers = jdbcTemplate.queryForList(sqlFindUserById, new Object[] { 
    			usuarioModel.getIdUsuario()
    	} );
    	
    	listAllUsers = new UserMapper().listUserMapper(rowUsers);
    	if (!CollectionUtils.isEmpty(listAllUsers))	{
    		usuarioModel = listAllUsers.get(0);
    	}
    	return usuarioModel;
	}

	@Override
	public List<T020_Usuario> findAllUsers() {
		String sqlFindAllUsers = SqlUtilsUser.getSqlFindAllUsers(); 
        List<T020_Usuario> listAllUsers = new ArrayList<T020_Usuario>();
    	List<Map<String, Object>> rowUsers = jdbcTemplate.queryForList(sqlFindAllUsers);
    	listAllUsers = new UserMapper().listUserMapper(rowUsers);
		return listAllUsers;
	}
	
	@SuppressWarnings("deprecation")
	public int getNextUser(){
		String sqlCount = SqlUtilsUser.getSqlCount();
		int count = jdbcTemplate.queryForInt(sqlCount);
		count = count + SQL_PARAMS_UNO;
		return count;
	}

}