package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.model.T006_Empresa;

public interface BusinessRepository {
	
	boolean registerBusiness(T006_Empresa empresa);
	boolean updateBusiness(T006_Empresa empresa);
	boolean deleteBusiness(T006_Empresa empresa);
	T006_Empresa findBusinessById(T006_Empresa empresa);
	List<T006_Empresa> findAllBusiness();
	int getNextBusiness();
	
}
