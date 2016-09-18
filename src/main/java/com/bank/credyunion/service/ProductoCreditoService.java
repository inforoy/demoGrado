package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.ProductoCreditoBean;

public interface ProductoCreditoService {

	boolean registerProductoCredito(ProductoCreditoBean productoCreditoBean);
	boolean updateProductoCredito(ProductoCreditoBean productoCreditoBean);
	boolean deleteProductoCredito(ProductoCreditoBean productoCreditoBean);
	ProductoCreditoBean findProductoCreditoById(ProductoCreditoBean productoCreditoBean);
	List<ProductoCreditoBean> findAllProductoCreditos();
	
}
