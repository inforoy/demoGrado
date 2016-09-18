package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.SocioBean;

public interface SocioService {
	
	boolean registerSolicitudCredito(SocioBean socioBean);
	boolean updateSolicitudCredito(SocioBean socioBean);
	boolean deleteSolicitudCredito(SocioBean socioBean);
	SocioBean findSocioById(SocioBean socioBean);
	List<SocioBean> findAllSocios();

}
