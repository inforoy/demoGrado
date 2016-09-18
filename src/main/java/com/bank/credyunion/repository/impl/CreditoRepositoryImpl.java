package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T004_Credito;
import com.bank.credyunion.repository.CreditoRepository;

@Repository("creditoRepository")
public class CreditoRepositoryImpl implements CreditoRepository {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerCredito(T004_Credito creditoModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCredito(T004_Credito creditoModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCredito(T004_Credito creditoModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T004_Credito findCreditoById(T004_Credito creditoModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T004_Credito> findAllCreditos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextCredito() {
		// TODO Auto-generated method stub
		return 0;
	}

}
