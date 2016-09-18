package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T017_ProductoCuenta;
import com.bank.credyunion.repository.ProductoCuentaRepository;

@Repository("productoCuentaRepository")
public class ProductoCuentaRepositoryImpl implements ProductoCuentaRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerProductoCuenta(
			T017_ProductoCuenta productoCuentaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProductoCuenta(T017_ProductoCuenta productoCuentaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProductoCuenta(T017_ProductoCuenta productoCuentaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T017_ProductoCuenta findProductoCuentaById(
			T017_ProductoCuenta productoCuentaModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T017_ProductoCuenta> findAllProductoCuentas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextProductoCuenta() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
