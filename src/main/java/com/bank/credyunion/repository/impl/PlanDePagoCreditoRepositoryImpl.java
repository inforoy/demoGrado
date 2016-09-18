package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T013_PlanDePagoCredito;
import com.bank.credyunion.repository.PlanDePagoCreditoRepository;

@Repository("planDePagoCreditoRepository")
public class PlanDePagoCreditoRepositoryImpl implements PlanDePagoCreditoRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerPlanDePagoCredito(
			T013_PlanDePagoCredito planDePagoCreditoModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePlanDePagoCredito(
			T013_PlanDePagoCredito planDePagoCreditoModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePlanDePagoCredito(
			T013_PlanDePagoCredito planDePagoCreditoModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T013_PlanDePagoCredito findPlanDePagoCreditoById(
			T013_PlanDePagoCredito planDePagoCreditoModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T013_PlanDePagoCredito> findAllPlanDePagoCreditos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextPlanDePagoCredito() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
