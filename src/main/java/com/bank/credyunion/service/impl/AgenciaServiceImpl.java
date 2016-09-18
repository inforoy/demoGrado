package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.AgenciaBean;
import com.bank.credyunion.repository.AgenciaRepository;
import com.bank.credyunion.service.AgenciaService;

@Service("agenciaService")
public class AgenciaServiceImpl implements AgenciaService{
	
	@Autowired
	private AgenciaRepository agenciaRepository;

	@Override
	public boolean registerAgencia(AgenciaBean agenciaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAgencia(AgenciaBean agenciaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAgencia(AgenciaBean agenciaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AgenciaBean findAgenciaById(AgenciaBean agenciaBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AgenciaBean> findAllAgencias() {
		// TODO Auto-generated method stub
		return null;
	}
}
