package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T009_MovimientoCredito;

public interface MovimientoCreditoRepository {

	boolean registerMovimientoCredito(T009_MovimientoCredito movimientoCreditoModel);
	boolean updateMovimientoCredito(T009_MovimientoCredito movimientoCreditoModel);
	boolean deleteMovimientoCredito(T009_MovimientoCredito movimientoCreditoModel);
	T009_MovimientoCredito findMovimientoCreditoById(T009_MovimientoCredito movimientoCreditoModel);
	List<T009_MovimientoCredito> findAllMovimientoCreditos();
	int getNextMovimientoCredito();
	
}
