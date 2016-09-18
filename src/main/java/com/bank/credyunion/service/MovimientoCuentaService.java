package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.MovimientoCuentaBean;

public interface MovimientoCuentaService {

	boolean registerMovimientoCuenta(MovimientoCuentaBean movimientoCuentaBean);
	boolean updateMovimientoCuenta(MovimientoCuentaBean movimientoCuentaBean);
	boolean deleteMovimientoCuenta(MovimientoCuentaBean movimientoCuentaBean);
	MovimientoCuentaBean findMovimientoCuentaById(MovimientoCuentaBean movimientoCuentaBean);
	List<MovimientoCuentaBean> findAllMovimientoCuentas();
	
}
