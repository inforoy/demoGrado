package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T012_OperacionDetalle;

public interface OperacionDetalleRepository {

	boolean registerOperacionDetalle(T012_OperacionDetalle operacionDetalleModel);
	boolean updateOperacionDetalle(T012_OperacionDetalle operacionDetalleModel);
	boolean deleteOperacionDetalle(T012_OperacionDetalle operacionDetalleModel);
	T012_OperacionDetalle findOperacionDetalleById(T012_OperacionDetalle operacionDetalleModel);
	List<T012_OperacionDetalle> findAllOperacionDetalles();
	int getNextOperacionDetalle();
	
}
