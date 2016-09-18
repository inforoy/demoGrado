package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T002_Caja;
import com.bank.credyunion.repository.CajaRepository;

@Repository("cajaRepository")
public class CajaRepositoryImpl implements CajaRepository {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerCaja(T002_Caja cajaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCaja(T002_Caja cajaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCaja(T002_Caja cajaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T002_Caja findCajaById(T002_Caja cajaModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T002_Caja> findAllCajas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextCaja() {
		// TODO Auto-generated method stub
		return 0;
	}

}
