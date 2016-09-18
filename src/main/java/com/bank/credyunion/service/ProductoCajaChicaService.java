package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.ProductoCajaChicaBean;

public interface ProductoCajaChicaService {

	boolean registerProductoCajaChica(ProductoCajaChicaBean productoCajaChicaBean);
	boolean updateProductoCajaChica(ProductoCajaChicaBean productoCajaChicaBean);
	boolean deleteProductoCajaChica(ProductoCajaChicaBean productoCajaChicaBean);
	ProductoCajaChicaBean findProductoCajaChicaById(ProductoCajaChicaBean productoCajaChicaBean);
	List<ProductoCajaChicaBean> findAllProductoCajaChicas();
	
}
