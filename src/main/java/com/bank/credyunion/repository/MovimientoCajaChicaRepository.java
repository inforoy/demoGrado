package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T008_MovimientoCajaChica;

public interface MovimientoCajaChicaRepository {
	
	boolean registerMovimientoCajaChica(T008_MovimientoCajaChica movimientoCajaChicaModel);
	boolean updateMovimientoCajaChica(T008_MovimientoCajaChica movimientoCajaChicaModel);
	boolean deleteMovimientoCajaChica(T008_MovimientoCajaChica movimientoCajaChicaModel);
	T008_MovimientoCajaChica findMovimientoCajaChicaById(T008_MovimientoCajaChica movimientoCajaChicaModel);
	List<T008_MovimientoCajaChica> findAllMovimientoCajaChicas();
	int getNextMovimientoCajaChica();
	
}
