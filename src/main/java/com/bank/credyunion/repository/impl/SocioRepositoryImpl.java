package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T018_Socio;
import com.bank.credyunion.repository.SocioRepository;

@Repository("socioRepository")
public class SocioRepositoryImpl implements SocioRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerSocio(T018_Socio socioModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSolicitudCredito(T018_Socio socioModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSocio(T018_Socio socioModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T018_Socio findSocioById(T018_Socio socioModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T018_Socio> findAllSocios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextSocio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
