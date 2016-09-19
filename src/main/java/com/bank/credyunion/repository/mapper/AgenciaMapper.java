package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T001_Agencia;

public class AgenciaMapper implements Serializable {

	private static final long serialVersionUID = -6466024204079956538L;
	
	public List<T001_Agencia> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T001_Agencia> listModels = new LinkedList<T001_Agencia>();
		for (Map<String, Object> maps : modelMaps ) {
			T001_Agencia temp = new T001_Agencia();
			temp.setDescripcionAgencia((String) maps.get(""));
			temp.setIdAgencia((String) maps.get(""));
			temp.setIdEmpresa((String) maps.get(""));
			temp.setIndicadorEliminacion((String) maps.get(""));
		    listModels.add(temp);
		}
		return listModels;
    }

}
