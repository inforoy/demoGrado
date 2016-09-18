package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T005_Cuenta;
import com.bank.credyunion.repository.CuentaRepository;

@Repository("cuentaRepository")
public class CuentaRepositoryImpl implements CuentaRepository {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerCuenta(T005_Cuenta cuentaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCuenta(T005_Cuenta cuentaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCuenta(T005_Cuenta cuentaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T005_Cuenta findCuentaById(T005_Cuenta cuentaModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T005_Cuenta> findAllCuentas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextCuenta() {
		// TODO Auto-generated method stub
		return 0;
	}

}
