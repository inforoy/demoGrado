package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.OperacionBean;
import com.bank.credyunion.repository.OperacionRepository;
import com.bank.credyunion.service.OperacionService;

@Service("operacionService")
public class OperacionServiceImpl implements OperacionService {

	@Autowired
	private OperacionRepository operacionRepository;

	@Override
	public boolean registerOperacion(OperacionBean operacionBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOperacion(OperacionBean operacionBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOperacion(OperacionBean operacionBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OperacionBean findOperacionById(OperacionBean operacionBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OperacionBean> findAllOperacions() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
