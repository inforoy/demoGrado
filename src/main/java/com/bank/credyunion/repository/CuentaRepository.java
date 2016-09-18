package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T005_Cuenta;

public interface CuentaRepository {
	
	boolean registerCuenta(T005_Cuenta cuentaModel);
	boolean updateCuenta(T005_Cuenta cuentaModel);
	boolean deleteCuenta(T005_Cuenta cuentaModel);
	T005_Cuenta findCuentaById(T005_Cuenta cuentaModel);
	List<T005_Cuenta> findAllCuentas();
	int getNextCuenta();

}
