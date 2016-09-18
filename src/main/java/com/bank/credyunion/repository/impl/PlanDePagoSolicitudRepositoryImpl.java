package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T014_PlanDePagoSolicitud;
import com.bank.credyunion.repository.PlanDePagoSolicitudRepository;

@Repository("planDePagoSolicitudRepository")
public class PlanDePagoSolicitudRepositoryImpl implements PlanDePagoSolicitudRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerPlanDePagoSolicitud(
			T014_PlanDePagoSolicitud planDePagoSolicitudModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePlanDePagoSolicitud(
			T014_PlanDePagoSolicitud planDePagoSolicitudModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePlanDePagoSolicitud(
			T014_PlanDePagoSolicitud planDePagoSolicitudModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T014_PlanDePagoSolicitud findPlanDePagoSolicitudById(
			T014_PlanDePagoSolicitud planDePagoSolicitudModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T014_PlanDePagoSolicitud> findAllPlanDePagoSolicituds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextPlanDePagoSolicitud() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
