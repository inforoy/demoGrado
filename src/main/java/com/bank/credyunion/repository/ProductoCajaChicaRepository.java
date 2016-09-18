package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T015_ProductoCajaChica;

public interface ProductoCajaChicaRepository {

	boolean registerProductoCajaChica(T015_ProductoCajaChica productoCajaChicaModel);
	boolean updateProductoCajaChica(T015_ProductoCajaChica productoCajaChicaModel);
	boolean deleteProductoCajaChica(T015_ProductoCajaChica productoCajaChicaModel);
	T015_ProductoCajaChica findProductoCajaChicaById(T015_ProductoCajaChica productoCajaChicaModel);
	List<T015_ProductoCajaChica> findAllProductoCajaChicas();
	int getNextProductoCajaChica();
	
}
