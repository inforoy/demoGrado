package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T019_SolicitudCredito;

public interface SolicitudCreditoRepository {

	boolean registerSolicitudCredito(T019_SolicitudCredito solicitudCreditoModel);
	boolean updateSolicitudCredito(T019_SolicitudCredito solicitudCreditoModel);
	boolean deleteSolicitudCredito(T019_SolicitudCredito solicitudCreditoModel);
	T019_SolicitudCredito findSolicitudCreditoById(T019_SolicitudCredito solicitudCreditoModel);
	List<T019_SolicitudCredito> findAllSolicitudCreditos();
	int getNextSolicitudCredito();
	
}
