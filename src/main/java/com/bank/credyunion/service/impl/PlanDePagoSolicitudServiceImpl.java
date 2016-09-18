package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.PlanDePagoSolicitudBean;
import com.bank.credyunion.repository.PlanDePagoSolicitudRepository;
import com.bank.credyunion.service.PlanDePagoSolicitudService;

@Service("planDePagoSolicitudService")
public class PlanDePagoSolicitudServiceImpl implements PlanDePagoSolicitudService {

	@Autowired
	private PlanDePagoSolicitudRepository planDePagoSolicitudRepository;

	@Override
	public boolean registerPlanDePagoSolicitud(
			PlanDePagoSolicitudBean planDePagoSolicitudBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePlanDePagoSolicitud(
			PlanDePagoSolicitudBean planDePagoSolicitudBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePlanDePagoSolicitud(
			PlanDePagoSolicitudBean planDePagoSolicitudBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PlanDePagoSolicitudBean findPlanDePagoSolicitudById(
			PlanDePagoSolicitudBean planDePagoSolicitudBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanDePagoSolicitudBean> findAllPlanDePagoSolicituds() {
		// TODO Auto-generated method stub
		return null;
	}
}
