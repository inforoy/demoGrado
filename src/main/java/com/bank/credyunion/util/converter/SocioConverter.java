package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.SocioBean;
import com.bank.credyunion.domain.T018_Socio;

public class SocioConverter {
	
	public static T018_Socio parseConverter_FromBeanToPojo(SocioBean bean){
		T018_Socio model = new T018_Socio();
		model.setApellidoMaterno(bean.getApellidoMaterno());
		model.setApellidoPaterno(bean.getApellidoPaterno());
		model.setCorreoElectronicoDos(bean.getCorreoElectronicoDos());
		model.setCorreoElectronicoUno(bean.getCorreoElectronicoUno());
		model.setFechaDeIngreso(bean.getFechaDeIngreso());
		model.setFechaDeNacimiento(bean.getFechaDeNacimiento());
		model.setIdAgencia(bean.getIdAgencia());
		model.setIdSocio(bean.getIdSocio());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
		model.setNombres(bean.getNombres());
		model.setNumeroDni(bean.getNumeroDni());
		model.setTelefonoFijo(bean.getTelefonoFijo());
		model.setTelefonoMovilDos(bean.getTelefonoMovilDos());
		model.setTelefonoMovilUno(bean.getTelefonoMovilUno());
       return model;
	}
	
	public static SocioBean parseConverter_FromPojoToBean(T018_Socio model){
		SocioBean bean = new SocioBean();
		bean.setApellidoMaterno(model.getApellidoMaterno());
		bean.setApellidoPaterno(model.getApellidoPaterno());
		bean.setCorreoElectronicoDos(model.getCorreoElectronicoDos());
		bean.setCorreoElectronicoUno(model.getCorreoElectronicoUno());
		bean.setFechaDeIngreso(model.getFechaDeIngreso());
		bean.setFechaDeNacimiento(model.getFechaDeNacimiento());
		bean.setIdAgencia(model.getIdAgencia());
		bean.setIdSocio(model.getIdSocio());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
		bean.setNombres(model.getNombres());
		bean.setNumeroDni(model.getNumeroDni());
		bean.setTelefonoFijo(model.getTelefonoFijo());
		bean.setTelefonoMovilDos(model.getTelefonoMovilDos());
		bean.setTelefonoMovilUno(model.getTelefonoMovilUno());
	    return bean;
	}
	
}
