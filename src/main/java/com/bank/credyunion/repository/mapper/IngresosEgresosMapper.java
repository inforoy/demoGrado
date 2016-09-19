package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T007_IngresosEgresos;

public class IngresosEgresosMapper implements Serializable {

	private static final long serialVersionUID = 4968460480472736403L;
	
	public List<T007_IngresosEgresos> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T007_IngresosEgresos> listModels = new LinkedList<T007_IngresosEgresos>();
		for (Map<String, Object> maps : modelMaps ) {
			T007_IngresosEgresos temp = new T007_IngresosEgresos();
			temp.setCodigoOperacion((String) maps.get(""));
			temp.setDescripcion((String) maps.get(""));
			temp.setIdIngresoEgreso((String) maps.get(""));
			temp.setIndicadorDeMovimiento((String) maps.get(""));
			temp.setIndicadorEliminacion((String) maps.get(""));
		    listModels.add(temp);
		}
		return listModels;
    }

}
