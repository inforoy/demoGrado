package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T017_ProductoCuenta;

public class ProductoCuentaMapper implements Serializable {

	private static final long serialVersionUID = 5256445100703907223L;
	
	public List<T017_ProductoCuenta> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T017_ProductoCuenta> listModels = new LinkedList<T017_ProductoCuenta>();
		for (Map<String, Object> maps : modelMaps ) {
			T017_ProductoCuenta temp = new T017_ProductoCuenta();
			temp.setDescripcion( (String) maps.get("") );
			temp.setIdProductoCuenta( (String) maps.get("") );
			temp.setIndicadorEliminacion( (String) maps.get("") );
			temp.setMontoMaximo( (BigDecimal) maps.get("") );
			temp.setMontoMinimo( (BigDecimal) maps.get("") );
			temp.setTasa( (BigDecimal) maps.get("") );
		    listModels.add(temp);
		}
		return listModels;
    }

}
