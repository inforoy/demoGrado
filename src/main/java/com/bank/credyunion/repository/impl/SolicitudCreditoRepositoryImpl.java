package com.bank.credyunion.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.credyunion.domain.T019_SolicitudCredito;
import com.bank.credyunion.repository.SolicitudCreditoRepository;

@Repository("solicitudCreditoRepository")
public class SolicitudCreditoRepositoryImpl implements SolicitudCreditoRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerSolicitudCredito(
			T019_SolicitudCredito solicitudCreditoModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSolicitudCredito(
			T019_SolicitudCredito solicitudCreditoModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSolicitudCredito(
			T019_SolicitudCredito solicitudCreditoModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T019_SolicitudCredito findSolicitudCreditoById(
			T019_SolicitudCredito solicitudCreditoModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T019_SolicitudCredito> findAllSolicitudCreditos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextSolicitudCredito() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
