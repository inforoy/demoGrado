package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.OperacionBean;

public interface OperacionService {

	boolean registerOperacion(OperacionBean operacionBean);
	boolean updateOperacion(OperacionBean operacionBean);
	boolean deleteOperacion(OperacionBean operacionBean);
	OperacionBean findOperacionById(OperacionBean operacionBean);
	List<OperacionBean> findAllOperacions();
	
}
