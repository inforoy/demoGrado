package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.CreditoBean;

public interface CreditoService {

	boolean registerCredito(CreditoBean creditoBean);
	boolean updateCredito(CreditoBean creditoBean);
	boolean deleteCredito(CreditoBean creditoBean);
	CreditoBean findCreditoById(CreditoBean creditoBean);
	List<CreditoBean> findAllCreditos();
	
}
