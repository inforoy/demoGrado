package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.MovimientoCajaChicaBean;

public interface MovimientoCajaChicaService {
	
	boolean registerMovimientoCajaChica(MovimientoCajaChicaBean movimientoCajaChicaBean);
	boolean updateMovimientoCajaChica(MovimientoCajaChicaBean movimientoCajaChicaBean);
	boolean deleteMovimientoCajaChica(MovimientoCajaChicaBean movimientoCajaChicaBean);
	MovimientoCajaChicaBean findMovimientoCajaChicaById(MovimientoCajaChicaBean movimientoCajaChicaBean);
	List<MovimientoCajaChicaBean> findAllMovimientoCajaChicas();

}
