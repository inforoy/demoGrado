package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.SolicitudCreditoBean;
import com.bank.credyunion.repository.SolicitudCreditoRepository;
import com.bank.credyunion.service.SolicitudCreditoService;

@Service("solicitudCreditoService")
public class SolicitudCreditoServiceImpl implements SolicitudCreditoService {

	@Autowired
	private SolicitudCreditoRepository solicitudCreditoRepository;

	@Override
	public boolean registerSolicitudCredito(
			SolicitudCreditoBean solicitudCreditoBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSolicitudCredito(
			SolicitudCreditoBean solicitudCreditoBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSolicitudCredito(
			SolicitudCreditoBean solicitudCreditoBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SolicitudCreditoBean findSolicitudCreditoById(
			SolicitudCreditoBean solicitudCreditoBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SolicitudCreditoBean> findAllSolicitudCreditos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
