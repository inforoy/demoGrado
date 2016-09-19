package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T005_Cuenta;

public class CuentaMapper implements Serializable {

	private static final long serialVersionUID = 1312225979560607895L;
	
	public List<T005_Cuenta> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T005_Cuenta> listModels = new LinkedList<T005_Cuenta>();
		for (Map<String, Object> maps : modelMaps ) {
			T005_Cuenta temp = new T005_Cuenta();
			temp.setCodigoAgencia((String) maps.get(""));
			temp.setCodigoUsuarioApertura((String) maps.get(""));
			temp.setCodigoUsuarioCancelacion((String) maps.get(""));
			temp.setEstadoCuenta((String) maps.get(""));
			temp.setFechaDeApertura((Date) maps.get(""));
			temp.setFechaDeCancelacion((Date) maps.get(""));
			temp.setIdCuenta((String) maps.get(""));
			temp.setIdProductoCuenta((String) maps.get(""));
			temp.setIdSocio((String) maps.get(""));
			temp.setIndicadorEliminacion((String) maps.get(""));
			temp.setMoneda((String) maps.get(""));
			temp.setMontoDeApertura((BigDecimal) maps.get(""));
			temp.setMovimientoCorrelativo((String) maps.get(""));
			temp.setObservacion((String) maps.get(""));
			temp.setSaldoCapital((BigDecimal) maps.get(""));
		    listModels.add(temp);
		}
		return listModels;
    }

}
