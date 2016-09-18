package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.SolicitudCreditoBean;

public interface SolicitudCreditoService {
	
	boolean registerSolicitudCredito(SolicitudCreditoBean solicitudCreditoBean);
	boolean updateSolicitudCredito(SolicitudCreditoBean solicitudCreditoBean);
	boolean deleteSolicitudCredito(SolicitudCreditoBean solicitudCreditoBean);
	SolicitudCreditoBean findSolicitudCreditoById(SolicitudCreditoBean solicitudCreditoBean);
	List<SolicitudCreditoBean> findAllSolicitudCreditos();
	
}
