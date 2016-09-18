package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.MovimientoCuentaBean;
import com.bank.credyunion.repository.MovimientoCuentaRepository;
import com.bank.credyunion.service.MovimientoCuentaService;

@Service("movimientoCuentaService")
public class MovimientoCuentaServiceImpl implements MovimientoCuentaService {

	@Autowired
	private MovimientoCuentaRepository movimientoCuentaRepository;

	@Override
	public boolean registerMovimientoCuenta(
			MovimientoCuentaBean movimientoCuentaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateMovimientoCuenta(
			MovimientoCuentaBean movimientoCuentaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMovimientoCuenta(
			MovimientoCuentaBean movimientoCuentaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MovimientoCuentaBean findMovimientoCuentaById(
			MovimientoCuentaBean movimientoCuentaBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MovimientoCuentaBean> findAllMovimientoCuentas() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
