package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T007_IngresosEgresos;

public interface IngresosEgresosRepository {

	boolean registerIngresosEgresos(T007_IngresosEgresos ingresosEgresosModel);
	boolean updateIngresosEgresos(T007_IngresosEgresos ingresosEgresosModel);
	boolean deleteIngresosEgresos(T007_IngresosEgresos ingresosEgresosModel);
	T007_IngresosEgresos findIngresosEgresosById(T007_IngresosEgresos ingresosEgresosModel);
	List<T007_IngresosEgresos> findAllIngresosEgresoss();
	int getNextIngresosEgresos();
	
}
