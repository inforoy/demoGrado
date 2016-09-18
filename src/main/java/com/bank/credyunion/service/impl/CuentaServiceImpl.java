package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.CuentaBean;
import com.bank.credyunion.repository.CuentaRepository;
import com.bank.credyunion.service.CuentaService;

@Service("cuentaService")
public class CuentaServiceImpl implements CuentaService {

	@Autowired
	private CuentaRepository cuentaRepository;

	@Override
	public boolean registerCuenta(CuentaBean cuentaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCuenta(CuentaBean cuentaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCuenta(CuentaBean cuentaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CuentaBean findCuentaById(CuentaBean cuentaBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CuentaBean> findAllCuentas() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
