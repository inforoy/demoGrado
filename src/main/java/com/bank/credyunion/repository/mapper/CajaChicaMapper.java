package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T003_CajaChica;

public class CajaChicaMapper implements Serializable {

	private static final long serialVersionUID = 6443952532433866275L;
	
	public List<T003_CajaChica> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T003_CajaChica> listModels = new LinkedList<T003_CajaChica>();
		for (Map<String, Object> maps : modelMaps ) {
			T003_CajaChica temp = new T003_CajaChica();
			temp.setDocumentoDeReferencia((String) maps.get(""));
			temp.setEngresoTotal((BigDecimal) maps.get(""));
			temp.setFechaDeProceso((Date) maps.get(""));
			temp.setIdCajaChica((String) maps.get(""));
			temp.setIdProductoCajaChica((String) maps.get(""));
			temp.setIdSocio((String) maps.get(""));
			temp.setIndicadorEliminacion((String) maps.get(""));
			temp.setIngresoTotal((BigDecimal) maps.get(""));
			temp.setSaldoDeCierre((BigDecimal) maps.get(""));
		    listModels.add(temp);
		}
		return listModels;
    }

}
