package com.bank.credyunion.util.converter;

import com.bank.credyunion.bean.IngresosEgresosBean;
import com.bank.credyunion.domain.T007_IngresosEgresos;

public class IngresosEgresosConverter {

	public static T007_IngresosEgresos parseConverter_FromBeanToPojo(IngresosEgresosBean bean){
		T007_IngresosEgresos model = new T007_IngresosEgresos();
		model.setCodigoOperacion(bean.getCodigoOperacion());
		model.setDescripcion(bean.getDescripcion());
		model.setIdIngresoEgreso(bean.getIdIngresoEgreso());
		model.setIndicadorDeMovimiento(bean.getIndicadorDeMovimiento());
		model.setIndicadorEliminacion(bean.getIndicadorEliminacion());
       return model;
	}
		
	public static IngresosEgresosBean parseConverter_FromPojoToBean(T007_IngresosEgresos model){
		IngresosEgresosBean bean = new IngresosEgresosBean();
		bean.setCodigoOperacion(model.getCodigoOperacion());
		bean.setDescripcion(model.getDescripcion());
		bean.setIdIngresoEgreso(model.getIdIngresoEgreso());
		bean.setIndicadorDeMovimiento(model.getIndicadorDeMovimiento());
		bean.setIndicadorEliminacion(model.getIndicadorEliminacion());
	    return bean;
	}
	
}
