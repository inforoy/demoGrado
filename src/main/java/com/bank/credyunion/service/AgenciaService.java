package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.AgenciaBean;

public interface AgenciaService {
	
	boolean registerAgencia(AgenciaBean agenciaBean);
	boolean updateAgencia(AgenciaBean agenciaBean);
	boolean deleteAgencia(AgenciaBean agenciaBean);
	AgenciaBean findAgenciaById(AgenciaBean agenciaBean);
	List<AgenciaBean> findAllAgencias();
	
}
