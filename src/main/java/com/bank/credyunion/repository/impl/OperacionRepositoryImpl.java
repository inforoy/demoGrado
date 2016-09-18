package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T011_Operacion;
import com.bank.credyunion.repository.OperacionRepository;

@Repository("operacionRepository")
public class OperacionRepositoryImpl implements OperacionRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerOperacion(T011_Operacion operacionModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOperacion(T011_Operacion operacionModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOperacion(T011_Operacion operacionModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T011_Operacion findOperacionById(T011_Operacion operacionModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T011_Operacion> findAllOperacions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextOperacion() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
