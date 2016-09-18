package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.MovimientoCajaChicaBean;
import com.bank.credyunion.repository.MovimientoCajaChicaRepository;
import com.bank.credyunion.service.MovimientoCajaChicaService;

@Service("movimientoCajaChicaService")
public class MovimientoCajaChicaServiceImpl implements MovimientoCajaChicaService {

	@Autowired
	private MovimientoCajaChicaRepository movimientoCajaChicaRepository;

	@Override
	public boolean registerMovimientoCajaChica(
			MovimientoCajaChicaBean movimientoCajaChicaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateMovimientoCajaChica(
			MovimientoCajaChicaBean movimientoCajaChicaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMovimientoCajaChica(
			MovimientoCajaChicaBean movimientoCajaChicaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MovimientoCajaChicaBean findMovimientoCajaChicaById(
			MovimientoCajaChicaBean movimientoCajaChicaBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MovimientoCajaChicaBean> findAllMovimientoCajaChicas() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
