package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T008_MovimientoCajaChica;

public class MovimientoCajaChicaMapper implements Serializable {

	private static final long serialVersionUID = 7335366920922002452L;
	
	public List<T008_MovimientoCajaChica> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T008_MovimientoCajaChica> listModels = new LinkedList<T008_MovimientoCajaChica>();
		for (Map<String, Object> maps : modelMaps ) {
			T008_MovimientoCajaChica temp = new T008_MovimientoCajaChica();
			temp.setCodigoDeOperacion((String) maps.get(""));
			temp.setFechaDeMovimiento((Date) maps.get(""));
			temp.setIdCajaChica((String) maps.get(""));
			temp.setIdMovimientoCajaChica((String) maps.get(""));
			temp.setIdOperacion((String) maps.get(""));
			temp.setIndicadorEliminacion((String) maps.get(""));
			temp.setMontoDeMovimiento((BigDecimal) maps.get(""));
			temp.setMovimientoCorrelativo((String) maps.get(""));
			temp.setSaldoCapitalActual((BigDecimal) maps.get(""));
			temp.setSaldoCapitalAnterior((BigDecimal) maps.get(""));
		    listModels.add(temp);
		}
		return listModels;
    }

}
