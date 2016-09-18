package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T009_MovimientoCredito;
import com.bank.credyunion.repository.MovimientoCreditoRepository;

@Repository("movimientoCreditoRepository")
public class MovimientoCreditoRepositoryImpl implements MovimientoCreditoRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerMovimientoCredito(
			T009_MovimientoCredito movimientoCreditoModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateMovimientoCredito(
			T009_MovimientoCredito movimientoCreditoModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMovimientoCredito(
			T009_MovimientoCredito movimientoCreditoModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T009_MovimientoCredito findMovimientoCreditoById(
			T009_MovimientoCredito movimientoCreditoModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T009_MovimientoCredito> findAllMovimientoCreditos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextMovimientoCredito() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
