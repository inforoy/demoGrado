package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T010_MovimientoCuenta;

public class MovimientoCuentaMapper implements Serializable {

	private static final long serialVersionUID = 2497184715363158585L;
	
	public List<T010_MovimientoCuenta> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T010_MovimientoCuenta> listModels = new LinkedList<T010_MovimientoCuenta>();
		for (Map<String, Object> maps : modelMaps ) {
			T010_MovimientoCuenta temp = new T010_MovimientoCuenta();
			temp.setCodigoDeOperacion((String) maps.get(""));
			temp.setCodigoUsuario((String) maps.get(""));
			temp.setFechaMovimiento((Date) maps.get(""));
			temp.setIdCuenta((String) maps.get(""));
			temp.setIdMovimientoCuenta((String) maps.get(""));
			temp.setIdOperation((String) maps.get(""));
			temp.setIndicadorEliminacion((String) maps.get(""));
			temp.setMontoMovimiento((BigDecimal) maps.get(""));
			temp.setMovimientoCorrelativo((String) maps.get(""));
			temp.setSaldoCapitalActual((BigDecimal) maps.get(""));
			temp.setSaldoCapitalAnterior((BigDecimal) maps.get(""));
		    listModels.add(temp);
		}
		return listModels;
    }

}
