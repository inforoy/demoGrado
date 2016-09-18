package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T003_CajaChica;
import com.bank.credyunion.repository.CajaChicaRepository;

@Repository("cajaChicaRepository")
public class CajaChicaRepositoryImpl implements CajaChicaRepository {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerCajaChica(T003_CajaChica cajaChicaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCajaChica(T003_CajaChica cajaChicaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCajaChica(T003_CajaChica cajaChicaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T003_CajaChica findCajaChicaById(T003_CajaChica cajaChicaModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T003_CajaChica> findAllCajaChicas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextCajaChica() {
		// TODO Auto-generated method stub
		return 0;
	}

}
