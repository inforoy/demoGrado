package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.IngresosEgresosBean;
import com.bank.credyunion.repository.IngresosEgresosRepository;
import com.bank.credyunion.service.IngresosEgresosService;

@Service("ingresosEgresosService")
public class IngresosEgresosServiceImpl implements IngresosEgresosService {

	@Autowired
	private IngresosEgresosRepository ingresosEgresosRepository;

	@Override
	public boolean registerIngresosEgresos(
			IngresosEgresosBean ingresosEgresosBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateIngresosEgresos(IngresosEgresosBean ingresosEgresosBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteIngresosEgresos(IngresosEgresosBean ingresosEgresosBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IngresosEgresosBean findIngresosEgresosById(
			IngresosEgresosBean ingresosEgresosBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IngresosEgresosBean> findAllIngresosEgresos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
