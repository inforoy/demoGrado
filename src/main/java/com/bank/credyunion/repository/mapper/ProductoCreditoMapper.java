package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T016_ProductoCredito;

public class ProductoCreditoMapper implements Serializable {

	private static final long serialVersionUID = 932451577122741976L;
	
	public List<T016_ProductoCredito> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T016_ProductoCredito> listModels = new LinkedList<T016_ProductoCredito>();
		for (Map<String, Object> maps : modelMaps ) {
			T016_ProductoCredito temp = new T016_ProductoCredito();
			temp.setDescripcion( (String) maps.get("") );
			temp.setIdProductoCredito( (String) maps.get("") );
			temp.setIndicadorEliminacion( (String) maps.get("") );
			temp.setMontoMaximo( (BigDecimal) maps.get("") );
			temp.setMontoMinimo( (BigDecimal) maps.get("") );
			temp.setTasa( (BigDecimal) maps.get("") );
		    listModels.add(temp);
		}
		return listModels;
    }

}
