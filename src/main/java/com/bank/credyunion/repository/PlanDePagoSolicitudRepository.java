package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T014_PlanDePagoSolicitud;

public interface PlanDePagoSolicitudRepository {

	boolean registerPlanDePagoSolicitud(T014_PlanDePagoSolicitud planDePagoSolicitudModel);
	boolean updatePlanDePagoSolicitud(T014_PlanDePagoSolicitud planDePagoSolicitudModel);
	boolean deletePlanDePagoSolicitud(T014_PlanDePagoSolicitud planDePagoSolicitudModel);
	T014_PlanDePagoSolicitud findPlanDePagoSolicitudById(T014_PlanDePagoSolicitud planDePagoSolicitudModel);
	List<T014_PlanDePagoSolicitud> findAllPlanDePagoSolicituds();
	int getNextPlanDePagoSolicitud();
	
}
