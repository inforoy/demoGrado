package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T016_ProductoCredito;

public interface ProductoCreditoRepository {
	
	boolean registerProductoCredito(T016_ProductoCredito productoCreditoModel);
	boolean updateProductoCredito(T016_ProductoCredito productoCreditoModel);
	boolean deleteProductoCredito(T016_ProductoCredito productoCreditoModel);
	T016_ProductoCredito findProductoCreditoById(T016_ProductoCredito productoCreditoModel);
	List<T016_ProductoCredito> findAllProductoCreditos();
	int getNextProductoCredito();
	
}
