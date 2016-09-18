package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.CajaBean;

public interface CajaService {

	boolean registerCaja(CajaBean cajaBean);
	boolean updateCaja(CajaBean cajaBean);
	boolean deleteCaja(CajaBean cajaBean);
	CajaBean findCajaById(CajaBean cajaBean);
	List<CajaBean> findAllCajas();
	
}
