package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T004_Credito;

public interface CreditoRepository {
	
	boolean registerCredito(T004_Credito creditoModel);
	boolean updateCredito(T004_Credito creditoModel);
	boolean deleteCredito(T004_Credito creditoModel);
	T004_Credito findCreditoById(T004_Credito creditoModel);
	List<T004_Credito> findAllCreditos();
	int getNextCredito();

}
