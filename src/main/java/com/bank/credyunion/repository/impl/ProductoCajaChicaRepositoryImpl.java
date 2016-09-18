package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T015_ProductoCajaChica;
import com.bank.credyunion.repository.ProductoCajaChicaRepository;

@Repository("productoCajaChicaRepository")
public class ProductoCajaChicaRepositoryImpl implements ProductoCajaChicaRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerProductoCajaChica(
			T015_ProductoCajaChica productoCajaChicaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProductoCajaChica(
			T015_ProductoCajaChica productoCajaChicaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProductoCajaChica(
			T015_ProductoCajaChica productoCajaChicaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T015_ProductoCajaChica findProductoCajaChicaById(
			T015_ProductoCajaChica productoCajaChicaModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T015_ProductoCajaChica> findAllProductoCajaChicas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextProductoCajaChica() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
