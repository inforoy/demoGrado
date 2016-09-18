package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.CajaChicaBean;
import com.bank.credyunion.repository.CajaChicaRepository;
import com.bank.credyunion.service.CajaChicaService;

@Service("cajaChicaService")
public class CajaChicaServiceImpl implements CajaChicaService {

	@Autowired
	private CajaChicaRepository cajaChicaRepository;

	@Override
	public boolean registerCajaChica(CajaChicaBean cajaChicaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCajaChica(CajaChicaBean cajaChicaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCajaChica(CajaChicaBean cajaChicaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CajaChicaBean findCajaChicaById(CajaChicaBean cajaChicaBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CajaChicaBean> findAllCajaChicas() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
