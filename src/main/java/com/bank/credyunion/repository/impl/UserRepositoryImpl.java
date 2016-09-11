package com.bank.credyunion.repository.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.model.T020_Usuario;
import com.bank.credyunion.repository.UserRepository;
import com.bank.credyunion.util.converter.UsuarioConverter;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public T020_Usuario getAllUsers(String userId) {
		//UsuarioModel usuarioModel = (UsuarioModel) getSqlSession().selectOne("BankUsuarioMapper.getAllUsers", userId); 
		return null;
	}
	
	public boolean registrarUsuario(T020_Usuario usuario) {
		List<Map<String, Object>> rowBooks=null;
		try {
			T020_Usuario usuarioModel = null;
			String sqlSelect = " SELECT * FROM usuario  ";
			rowBooks = jdbcTemplate.queryForList(sqlSelect, new Object[] {  });
		} catch (Exception e) {
			System.out.println("");
		}
		
		return true;
	}

	@Override
	public boolean registerUser(T020_Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(T020_Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(T020_Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T020_Usuario findUserById(T020_Usuario usuarioModel) {
		List<Map<String, Object>> rowBooks=null;
		try {
			String sqlSelect = " SELECT * FROM usuario  ";
			rowBooks = jdbcTemplate.queryForList(sqlSelect, new Object[] {  });
		} catch (Exception e) {
			System.out.println("");
		}
		
		T020_Usuario user = null;
		return user;
	}

	@Override
	public List<T020_Usuario> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

/*
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public List<Usuario> listUsers() {
		
		String hql = "FROM Usuario";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
         
        @SuppressWarnings("unchecked")
        List<Usuario> listUser = (List<Usuario>) query.list();
         
        return listUser;
		
	}

	@Override
	public Usuario getUserById(int idUsuario) {

		String hql = "FROM Usuario WHERE idUsuario=" + idUsuario;
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
         
        @SuppressWarnings("unchecked")
        List<Usuario> listUser = (List<Usuario>) query.list();
         
        if (listUser != null && !listUser.isEmpty()) {
            return listUser.get(0);
        }
        
        return null;
	}

	@Override
	public boolean insertUser(Usuario user) {
		Session session = sessionFactory.getCurrentSession();
		boolean flag = false;
		try
		{
		    session.save(user);
		    flag = true;
		} catch (Exception e)
		{
		    System.out.println("Error: "+e);
		}
		return flag;
	}

	@Override
	public boolean updateUser(Usuario user) {
		Session session = sessionFactory.getCurrentSession();
		boolean flag = false;
		try
		{
		    session.update(user);
		    flag = true;
		} catch (Exception e)
		{
		    System.out.println("Error: "+e);
		}
		return flag;
	}

	@Override
	public boolean deleteUser(Usuario usuario) {
		Session session = sessionFactory.getCurrentSession();
		boolean flag = false;
		try
		{
		    session.delete(usuario);
		    flag = true;
		} catch (Exception e)
		{
		    System.out.println("Error: "+e);
		}
		return flag;
	}
	*/
}
