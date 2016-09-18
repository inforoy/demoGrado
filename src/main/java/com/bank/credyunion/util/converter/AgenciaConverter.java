package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.AgenciaBean;
import com.bank.credyunion.domain.T001_Agencia;

public class AgenciaConverter {

	public static T001_Agencia parseConverter_FromBeanToPojo(AgenciaBean bean){
		T001_Agencia model = new T001_Agencia();
		model.setDescripcionAgencia(bean.getDescripcionAgencia());
		model.setIdAgencia(bean.getIdAgencia());
		model.setIdEmpresa(bean.getIdEmpresa());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
       return model;
	}
		
	public static AgenciaBean parseConverter_FromPojoToBean(T001_Agencia model){
		AgenciaBean bean = new AgenciaBean();
		bean.setDescripcionAgencia(model.getDescripcionAgencia());
		bean.setIdAgencia(model.getIdAgencia());
		bean.setIdEmpresa(model.getIdEmpresa());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
	    return bean;
	}
}
