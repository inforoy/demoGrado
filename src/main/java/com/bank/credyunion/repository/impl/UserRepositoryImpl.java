package com.bank.credyunion.repository.impl;

import org.springframework.stereotype.Repository;

import com.bank.credyunion.model.UsuarioModel;
import com.bank.credyunion.repository.UserRepository;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	public boolean registrarUsuario(UsuarioModel usuario) {
		// TODO Auto-generated method stub
		return false;
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
