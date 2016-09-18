package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T008_MovimientoCajaChica;
import com.bank.credyunion.repository.MovimientoCajaChicaRepository;

@Repository("movimientoCajaChicaRepository")
public class MovimientoCajaChicaRepositoryImpl implements MovimientoCajaChicaRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerMovimientoCajaChica(
			T008_MovimientoCajaChica movimientoCajaChicaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateMovimientoCajaChica(
			T008_MovimientoCajaChica movimientoCajaChicaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMovimientoCajaChica(
			T008_MovimientoCajaChica movimientoCajaChicaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T008_MovimientoCajaChica findMovimientoCajaChicaById(
			T008_MovimientoCajaChica movimientoCajaChicaModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T008_MovimientoCajaChica> findAllMovimientoCajaChicas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextMovimientoCajaChica() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
