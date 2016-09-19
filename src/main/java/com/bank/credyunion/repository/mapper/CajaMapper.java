package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T002_Caja;

public class CajaMapper implements Serializable {

	private static final long serialVersionUID = 4239563163647345049L;
	
	public List<T002_Caja> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T002_Caja> listModels = new LinkedList<T002_Caja>();
		for (Map<String, Object> maps : modelMaps ) {
			T002_Caja temp = new T002_Caja();
			temp.setCodigoDeUsuario((String) maps.get(""));
			temp.setDocumentoDeReferencia((String) maps.get(""));
			temp.setEgresoTotal((BigDecimal) maps.get(""));
			temp.setFechaDeProceso((Date) maps.get(""));
			temp.setIdAgencia((String) maps.get(""));
			temp.setIdCaja((String) maps.get(""));
			temp.setIndicadorEliminacion((String) maps.get(""));
			temp.setIngresoTotal((BigDecimal) maps.get(""));
			temp.setMontoDeCierre((BigDecimal) maps.get(""));
			temp.setNombreDeUsuario((String) maps.get(""));
			temp.setSaldoFinal((BigDecimal) maps.get(""));
			temp.setSaldoInicial((BigDecimal) maps.get(""));
		    listModels.add(temp);
		}
		return listModels;
    }
	
}
