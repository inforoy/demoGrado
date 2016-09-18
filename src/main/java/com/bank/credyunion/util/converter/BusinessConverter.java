package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.EmpresaBean;
import com.bank.credyunion.domain.T006_Empresa;

public class BusinessConverter {
	
	public static T006_Empresa parseConverter_FromBeanToPojo(EmpresaBean empresaBean){
		T006_Empresa tEmpresa = new T006_Empresa();
		tEmpresa.setIdEmpresa(empresaBean.getIdEmpresa());
		tEmpresa.setDescripcion(empresaBean.getDescripcion());
		tEmpresa.setFechaDeCreacion(empresaBean.getFechaDeCreacion());
		tEmpresa.setIndicadorEliminacion(empresaBean.getIndicadorEliminacion());
        return tEmpresa;
	}
	
	public static EmpresaBean parseConverter_FromPojoToBean(T006_Empresa tEmpresa){
		EmpresaBean empresaBean = new EmpresaBean();
		empresaBean.setIdEmpresa(tEmpresa.getIdEmpresa());
		empresaBean.setDescripcion(tEmpresa.getDescripcion());
		empresaBean.setFechaDeCreacion(tEmpresa.getFechaDeCreacion());
		empresaBean.setIndicadorEliminacion(tEmpresa.getIndicadorEliminacion());
        return empresaBean;
	}
	
}
