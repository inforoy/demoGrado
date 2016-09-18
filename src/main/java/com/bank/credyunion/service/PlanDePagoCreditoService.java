package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.PlanDePagoCreditoBean;

public interface PlanDePagoCreditoService {

	boolean registerPlanDePagoCredito(PlanDePagoCreditoBean planDePagoCreditoBean);
	boolean updatePlanDePagoCredito(PlanDePagoCreditoBean planDePagoCreditoBean);
	boolean deletePlanDePagoCredito(PlanDePagoCreditoBean planDePagoCreditoBean);
	PlanDePagoCreditoBean findPlanDePagoCreditoById(PlanDePagoCreditoBean planDePagoCreditoBean);
	List<PlanDePagoCreditoBean> findAllPlanDePagoCreditos();
	
}
