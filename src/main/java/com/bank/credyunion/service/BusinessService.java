package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.EmpresaBean;
import com.bank.credyunion.bean.UsuarioBean;

public interface BusinessService {
	
	boolean registerBusiness(EmpresaBean empresa);
	boolean updateBusiness(EmpresaBean empresa);
	boolean deleteBusiness(EmpresaBean empresa);
	EmpresaBean findBusinessById(EmpresaBean empresa);
	List<EmpresaBean> findAllBusiness();
	
}
