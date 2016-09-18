package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T006_Empresa;

public interface EmpresaRepository {
	
	boolean registerBusiness(T006_Empresa empresa);
	boolean updateBusiness(T006_Empresa empresa);
	boolean deleteBusiness(T006_Empresa empresa);
	T006_Empresa findBusinessById(T006_Empresa empresa);
	List<T006_Empresa> findAllBusiness();
	int getNextBusiness();
	
}
