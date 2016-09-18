package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.PlanDePagoSolicitudBean;

public interface PlanDePagoSolicitudService {

	boolean registerPlanDePagoSolicitud(PlanDePagoSolicitudBean planDePagoSolicitudBean);
	boolean updatePlanDePagoSolicitud(PlanDePagoSolicitudBean planDePagoSolicitudBean);
	boolean deletePlanDePagoSolicitud(PlanDePagoSolicitudBean planDePagoSolicitudBean);
	PlanDePagoSolicitudBean findPlanDePagoSolicitudById(PlanDePagoSolicitudBean planDePagoSolicitudBean);
	List<PlanDePagoSolicitudBean> findAllPlanDePagoSolicituds();
	
}
