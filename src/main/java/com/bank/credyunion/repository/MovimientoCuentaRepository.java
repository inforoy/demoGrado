package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T010_MovimientoCuenta;

public interface MovimientoCuentaRepository {

	boolean registerMovimientoCuenta(T010_MovimientoCuenta movimientoCuentaModel);
	boolean updateMovimientoCuenta(T010_MovimientoCuenta movimientoCuentaModel);
	boolean deleteMovimientoCuenta(T010_MovimientoCuenta movimientoCuentaModel);
	T010_MovimientoCuenta findMovimientoCuentaById(T010_MovimientoCuenta movimientoCuentaModel);
	List<T010_MovimientoCuenta> findAllMovimientoCuentas();
	int getNextMovimientoCuenta();
	
}
