package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.IngresosEgresosBean;

public interface IngresosEgresosService {
	
	boolean registerIngresosEgresos(IngresosEgresosBean ingresosEgresosBean);
	boolean updateIngresosEgresos(IngresosEgresosBean ingresosEgresosBean);
	boolean deleteIngresosEgresos(IngresosEgresosBean ingresosEgresosBean);
	IngresosEgresosBean findIngresosEgresosById(IngresosEgresosBean ingresosEgresosBean);
	List<IngresosEgresosBean> findAllIngresosEgresos();

}
