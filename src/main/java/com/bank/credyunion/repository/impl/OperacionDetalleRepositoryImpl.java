package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T012_OperacionDetalle;
import com.bank.credyunion.repository.OperacionDetalleRepository;

@Repository("operacionDetalleRepository")
public class OperacionDetalleRepositoryImpl implements OperacionDetalleRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerOperacionDetalle(
			T012_OperacionDetalle operacionDetalleModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOperacionDetalle(
			T012_OperacionDetalle operacionDetalleModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOperacionDetalle(
			T012_OperacionDetalle operacionDetalleModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T012_OperacionDetalle findOperacionDetalleById(
			T012_OperacionDetalle operacionDetalleModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T012_OperacionDetalle> findAllOperacionDetalles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextOperacionDetalle() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
