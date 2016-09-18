package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.CajaBean;
import com.bank.credyunion.repository.CajaRepository;
import com.bank.credyunion.service.CajaService;

@Service("cajaService")
public class CajaServiceImpl implements CajaService {

	@Autowired
	private CajaRepository cajaRepository;

	@Override
	public boolean registerCaja(CajaBean cajaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCaja(CajaBean cajaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCaja(CajaBean cajaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CajaBean findCajaById(CajaBean cajaBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CajaBean> findAllCajas() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
