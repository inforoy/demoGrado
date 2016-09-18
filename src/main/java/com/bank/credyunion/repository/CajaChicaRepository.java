package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T003_CajaChica;

public interface CajaChicaRepository {
	
	boolean registerCajaChica(T003_CajaChica cajaChicaModel);
	boolean updateCajaChica(T003_CajaChica cajaChicaModel);
	boolean deleteCajaChica(T003_CajaChica cajaChicaModel);
	T003_CajaChica findCajaChicaById(T003_CajaChica cajaChicaModel);
	List<T003_CajaChica> findAllCajaChicas();
	int getNextCajaChica();
	
}
