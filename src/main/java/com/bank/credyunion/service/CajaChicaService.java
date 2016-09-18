package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.CajaChicaBean;

public interface CajaChicaService {
	
	boolean registerCajaChica(CajaChicaBean cajaChicaBean);
	boolean updateCajaChica(CajaChicaBean cajaChicaBean);
	boolean deleteCajaChica(CajaChicaBean cajaChicaBean);
	CajaChicaBean findCajaChicaById(CajaChicaBean cajaChicaBean);
	List<CajaChicaBean> findAllCajaChicas();

}
