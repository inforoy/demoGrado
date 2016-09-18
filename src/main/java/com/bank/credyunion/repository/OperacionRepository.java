package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T011_Operacion;

public interface OperacionRepository {

	boolean registerOperacion(T011_Operacion operacionModel);
	boolean updateOperacion(T011_Operacion operacionModel);
	boolean deleteOperacion(T011_Operacion operacionModel);
	T011_Operacion findOperacionById(T011_Operacion operacionModel);
	List<T011_Operacion> findAllOperacions();
	int getNextOperacion();
	
}
