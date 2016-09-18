package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.ProductoCuentaBean;

public interface ProductoCuentaService {
	
	boolean registerProductoCuenta(ProductoCuentaBean productoCuentaBean);
	boolean updateProductoCuenta(ProductoCuentaBean productoCuentaBean);
	boolean deleteProductoCuenta(ProductoCuentaBean productoCuentaBean);
	ProductoCuentaBean findProductoCuentaById(ProductoCuentaBean productoCuentaBean);
	List<ProductoCuentaBean> findAllProductoCuentas();

}
