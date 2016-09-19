package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T015_ProductoCajaChica;

public class ProductoCajaChicaMapper implements Serializable {

	private static final long serialVersionUID = 8679492585475999566L;
	
	public List<T015_ProductoCajaChica> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T015_ProductoCajaChica> listModels = new LinkedList<T015_ProductoCajaChica>();
		for (Map<String, Object> maps : modelMaps ) {
			T015_ProductoCajaChica temp = new T015_ProductoCajaChica();
			temp.setDescripcion( (String) maps.get("") );
			temp.setIdProductoCajaChica( (String) maps.get("") );
			temp.setIndicadorEliminacion( (String) maps.get("") );
			temp.setMonto( (BigDecimal) maps.get("") );
		    listModels.add(temp);
		}
		return listModels;
    }

}
