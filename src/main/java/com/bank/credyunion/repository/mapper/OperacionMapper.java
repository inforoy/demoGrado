package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T011_Operacion;

public class OperacionMapper implements Serializable {

	private static final long serialVersionUID = -599826511539131L;
	
	public List<T011_Operacion> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T011_Operacion> listModels = new LinkedList<T011_Operacion>();
		for (Map<String, Object> maps : modelMaps ) {
			T011_Operacion temp = new T011_Operacion();
			temp.setCodigoAgencia((String) maps.get(""));
			temp.setCodigoDeOperacion((String) maps.get(""));
			temp.setCodigoSocio((String) maps.get(""));
			temp.setCodigoUsuario((String) maps.get(""));
			temp.setDocumentoDeReferencia((String) maps.get(""));
			temp.setFechaDeOperacion((Date) maps.get(""));
			temp.setIdOperacion((String) maps.get(""));
			temp.setIndicadorEliminacion((String) maps.get(""));
			temp.setIndicadorMovimiento((String) maps.get(""));
			temp.setMoneda((String) maps.get(""));
			temp.setMontoMovimiento((BigDecimal) maps.get(""));
			temp.setNombreSocio((String) maps.get(""));
			temp.setNumeroTransaccion((String) maps.get(""));
			temp.setObservacion((String) maps.get(""));
			temp.setOperacionCorrelativa((String) maps.get(""));
		    listModels.add(temp);
		}
		return listModels;
    }

}
