package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T001_Agencia;
import com.bank.credyunion.repository.AgenciaRepository;

@Repository("agenciaRepository")
public class AgenciaRepositoryImpl implements AgenciaRepository {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerAgencia(T001_Agencia agenciaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAgencia(T001_Agencia agenciaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAgencia(T001_Agencia agenciaModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T001_Agencia findAgenciaById(T001_Agencia agenciaModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T001_Agencia> findAllAgencias() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextAgencia() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
