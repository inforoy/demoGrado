package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.OperacionDetalleBean;
import com.bank.credyunion.repository.OperacionDetalleRepository;
import com.bank.credyunion.service.OperacionDetalleService;

@Service("operacionDetalleService")
public class OperacionDetalleServiceImpl implements OperacionDetalleService {

	@Autowired
	private OperacionDetalleRepository operacionDetalleRepository;

	@Override
	public boolean registerOperacionDetalle(
			OperacionDetalleBean operacionDetalleBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOperacionDetalle(
			OperacionDetalleBean operacionDetalleBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOperacionDetalle(
			OperacionDetalleBean operacionDetalleBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OperacionDetalleBean findOperacionDetalleById(
			OperacionDetalleBean operacionDetalleBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OperacionDetalleBean> findAllOperacionDetalles() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
