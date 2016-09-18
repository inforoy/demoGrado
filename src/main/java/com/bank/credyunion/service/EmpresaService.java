package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.EmpresaBean;

public interface EmpresaService {
	
	boolean registerEmpresa(EmpresaBean empresa);
	boolean updateEmpresa(EmpresaBean empresa);
	boolean deleteEmpresa(EmpresaBean empresa);
	EmpresaBean findEmpresaById(EmpresaBean empresa);
	List<EmpresaBean> findAllEmpresas();
	
}