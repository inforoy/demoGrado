package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T002_Caja;

public interface CajaRepository {
	
	boolean registerCaja(T002_Caja cajaModel);
	boolean updateCaja(T002_Caja cajaModel);
	boolean deleteCaja(T002_Caja cajaModel);
	T002_Caja findCajaById(T002_Caja cajaModel);
	List<T002_Caja> findAllCajas();
	int getNextCaja();

}
