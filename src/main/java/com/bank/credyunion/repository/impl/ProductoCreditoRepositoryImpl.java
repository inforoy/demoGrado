package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T016_ProductoCredito;
import com.bank.credyunion.repository.ProductoCreditoRepository;

@Repository("productoCreditoRepository")
public class ProductoCreditoRepositoryImpl implements ProductoCreditoRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerProductoCredito(
			T016_ProductoCredito productoCreditoModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProductoCredito(
			T016_ProductoCredito productoCreditoModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProductoCredito(
			T016_ProductoCredito productoCreditoModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T016_ProductoCredito findProductoCreditoById(
			T016_ProductoCredito productoCreditoModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T016_ProductoCredito> findAllProductoCreditos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextProductoCredito() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
