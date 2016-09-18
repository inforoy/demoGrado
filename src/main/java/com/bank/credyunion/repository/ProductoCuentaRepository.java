package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T017_ProductoCuenta;

public interface ProductoCuentaRepository {
	
	boolean registerProductoCuenta(T017_ProductoCuenta productoCuentaModel);
	boolean updateProductoCuenta(T017_ProductoCuenta productoCuentaModel);
	boolean deleteProductoCuenta(T017_ProductoCuenta productoCuentaModel);
	T017_ProductoCuenta findProductoCuentaById(T017_ProductoCuenta productoCuentaModel);
	List<T017_ProductoCuenta> findAllProductoCuentas();
	int getNextProductoCuenta();

}
