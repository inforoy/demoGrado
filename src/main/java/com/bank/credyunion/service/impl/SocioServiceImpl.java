package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.SocioBean;
import com.bank.credyunion.repository.SocioRepository;
import com.bank.credyunion.service.SocioService;

@Service("socioService")
public class SocioServiceImpl implements SocioService {

	@Autowired
	private SocioRepository socioRepository;

	@Override
	public boolean registerSolicitudCredito(SocioBean socioBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSolicitudCredito(SocioBean socioBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSolicitudCredito(SocioBean socioBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SocioBean findSocioById(SocioBean socioBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SocioBean> findAllSocios() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
