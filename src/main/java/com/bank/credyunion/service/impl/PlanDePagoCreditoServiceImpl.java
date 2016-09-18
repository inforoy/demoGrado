package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.PlanDePagoCreditoBean;
import com.bank.credyunion.repository.PlanDePagoCreditoRepository;
import com.bank.credyunion.service.PlanDePagoCreditoService;

@Service("planDePagoCreditoService")
public class PlanDePagoCreditoServiceImpl implements PlanDePagoCreditoService {

	@Autowired
	private PlanDePagoCreditoRepository planDePagoCreditoRepository;

	@Override
	public boolean registerPlanDePagoCredito(
			PlanDePagoCreditoBean planDePagoCreditoBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePlanDePagoCredito(
			PlanDePagoCreditoBean planDePagoCreditoBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePlanDePagoCredito(
			PlanDePagoCreditoBean planDePagoCreditoBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PlanDePagoCreditoBean findPlanDePagoCreditoById(
			PlanDePagoCreditoBean planDePagoCreditoBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanDePagoCreditoBean> findAllPlanDePagoCreditos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
