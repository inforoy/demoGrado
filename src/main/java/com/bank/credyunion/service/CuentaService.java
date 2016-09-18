package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.CuentaBean;

public interface CuentaService {
	
	boolean registerCuenta(CuentaBean cuentaBean);
	boolean updateCuenta(CuentaBean cuentaBean);
	boolean deleteCuenta(CuentaBean cuentaBean);
	CuentaBean findCuentaById(CuentaBean cuentaBean);
	List<CuentaBean> findAllCuentas();
	
}
