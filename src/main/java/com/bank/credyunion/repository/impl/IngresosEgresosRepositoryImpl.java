package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T007_IngresosEgresos;
import com.bank.credyunion.repository.IngresosEgresosRepository;

@Repository("ingresosEgresosRepository")
public class IngresosEgresosRepositoryImpl implements IngresosEgresosRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerIngresosEgresos(
			T007_IngresosEgresos ingresosEgresosModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateIngresosEgresos(
			T007_IngresosEgresos ingresosEgresosModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteIngresosEgresos(
			T007_IngresosEgresos ingresosEgresosModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T007_IngresosEgresos findIngresosEgresosById(
			T007_IngresosEgresos ingresosEgresosModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T007_IngresosEgresos> findAllIngresosEgresoss() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextIngresosEgresos() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
