package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T009_MovimientoCredito;

public class MovimientoCreditoMapper implements Serializable {

	private static final long serialVersionUID = -2302285357193917426L;
	
	public List<T009_MovimientoCredito> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T009_MovimientoCredito> listModels = new LinkedList<T009_MovimientoCredito>();
		for (Map<String, Object> maps : modelMaps ) {
			T009_MovimientoCredito temp = new T009_MovimientoCredito();
			temp.setCapitalActual((BigDecimal) maps.get(""));
			temp.setCapitalAnterior((BigDecimal) maps.get(""));
			temp.setCodigoAgencia((String) maps.get(""));
			temp.setCodigoDeOperacion((String) maps.get(""));
			temp.setCodigoUsuario((String) maps.get(""));
			temp.setFechaDeMovimiento((Date) maps.get(""));
			temp.setIdCredito((String) maps.get(""));
			temp.setIdMovimientoCredito((String) maps.get(""));
			temp.setIdOperation((String) maps.get(""));
			temp.setIndicadorEliminacion((String) maps.get(""));
			temp.setMontoDelCapital((BigDecimal) maps.get(""));
			temp.setMontoDelCargo((BigDecimal) maps.get(""));
			temp.setMontoDelInteres((BigDecimal) maps.get(""));
			temp.setMontoDeMora((BigDecimal) maps.get(""));
			temp.setMontoDeMovimiento((BigDecimal) maps.get(""));
			temp.setMovimientoCorrelativo((String) maps.get(""));
			temp.setNumeroMovimiento((String) maps.get(""));
		    listModels.add(temp);
		}
		return listModels;
    }

}
