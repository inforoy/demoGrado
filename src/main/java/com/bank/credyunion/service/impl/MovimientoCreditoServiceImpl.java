package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.MovimientoCreditoBean;
import com.bank.credyunion.repository.MovimientoCreditoRepository;
import com.bank.credyunion.service.MovimientoCreditoService;

@Service("movimientoCreditoService")
public class MovimientoCreditoServiceImpl implements MovimientoCreditoService {

	@Autowired
	private MovimientoCreditoRepository movimientoCreditoRepository;

	@Override
	public boolean registerMovimientoCredito(
			MovimientoCreditoBean movimientoCreditoBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateMovimientoCredito(
			MovimientoCreditoBean movimientoCreditoBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMovimientoCredito(
			MovimientoCreditoBean movimientoCreditoBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MovimientoCreditoBean findMovimientoCreditoById(
			MovimientoCreditoBean movimientoCreditoBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MovimientoCreditoBean> findAllMovimientoCreditos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
