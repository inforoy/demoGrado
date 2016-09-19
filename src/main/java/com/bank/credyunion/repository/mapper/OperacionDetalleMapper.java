package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T012_OperacionDetalle;

public class OperacionDetalleMapper implements Serializable {

	private static final long serialVersionUID = 1303243171564495768L;
	
	public List<T012_OperacionDetalle> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T012_OperacionDetalle> listModels = new LinkedList<T012_OperacionDetalle>();
		for (Map<String, Object> maps : modelMaps ) {
			T012_OperacionDetalle temp = new T012_OperacionDetalle();
			temp.setCodigoDeOperacion((String) maps.get(""));
			temp.setCodigoDeSubOperacion((String) maps.get(""));
			temp.setIdOperacion((String) maps.get(""));
			temp.setIdOperacionDetalle((String) maps.get(""));
			temp.setIndicadorEliminacion((String) maps.get(""));
			temp.setMonto((BigDecimal) maps.get(""));
		    listModels.add(temp);
		}
		return listModels;
    }

}
