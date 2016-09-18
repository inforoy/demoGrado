package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T013_PlanDePagoCredito;

public interface PlanDePagoCreditoRepository {

	boolean registerPlanDePagoCredito(T013_PlanDePagoCredito planDePagoCreditoModel);
	boolean updatePlanDePagoCredito(T013_PlanDePagoCredito planDePagoCreditoModel);
	boolean deletePlanDePagoCredito(T013_PlanDePagoCredito planDePagoCreditoModel);
	T013_PlanDePagoCredito findPlanDePagoCreditoById(T013_PlanDePagoCredito planDePagoCreditoModel);
	List<T013_PlanDePagoCredito> findAllPlanDePagoCreditos();
	int getNextPlanDePagoCredito();
	
}
