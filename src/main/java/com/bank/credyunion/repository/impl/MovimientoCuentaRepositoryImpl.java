package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T010_MovimientoCuenta;
import com.bank.credyunion.repository.MovimientoCuentaRepository;

@Repository("movimientoCuentaRepository")
public class MovimientoCuentaRepositoryImpl implements MovimientoCuentaRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerMovimientoCuenta(
			T010_MovimientoCuenta movimientoCuentaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateMovimientoCuenta(
			T010_MovimientoCuenta movimientoCuentaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMovimientoCuenta(
			T010_MovimientoCuenta movimientoCuentaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T010_MovimientoCuenta findMovimientoCuentaById(
			T010_MovimientoCuenta movimientoCuentaModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T010_MovimientoCuenta> findAllMovimientoCuentas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextMovimientoCuenta() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
