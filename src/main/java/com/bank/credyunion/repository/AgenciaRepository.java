package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T001_Agencia;

public interface AgenciaRepository {
	
	boolean registerAgencia(T001_Agencia agenciaModel);
	boolean updateAgencia(T001_Agencia agenciaModel);
	boolean deleteAgencia(T001_Agencia agenciaModel);
	T001_Agencia findAgenciaById(T001_Agencia agenciaModel);
	List<T001_Agencia> findAllAgencias();
	int getNextAgencia();

}
