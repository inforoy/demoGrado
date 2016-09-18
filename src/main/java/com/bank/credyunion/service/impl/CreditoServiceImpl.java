package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.CreditoBean;
import com.bank.credyunion.repository.CreditoRepository;
import com.bank.credyunion.service.CreditoService;

@Service("creditoService")
public class CreditoServiceImpl implements CreditoService {
	
	@Autowired
	private CreditoRepository creditoRepository;

	@Override
	public boolean registerCredito(CreditoBean creditoBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCredito(CreditoBean creditoBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCredito(CreditoBean creditoBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CreditoBean findCreditoById(CreditoBean creditoBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CreditoBean> findAllCreditos() {
		// TODO Auto-generated method stub
		return null;
	}

}
