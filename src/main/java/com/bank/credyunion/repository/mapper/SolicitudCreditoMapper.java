package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T019_SolicitudCredito;

public class SolicitudCreditoMapper implements Serializable {

	private static final long serialVersionUID = -2094717851614955961L;
	
	public List<T019_SolicitudCredito> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T019_SolicitudCredito> listModels = new LinkedList<T019_SolicitudCredito>();
		for (Map<String, Object> maps : modelMaps ) {
			T019_SolicitudCredito temp = new T019_SolicitudCredito();
			temp.setCodigoAgencia( (String) maps.get("") );
			temp.setCodigoUsuario((String) maps.get(""));
			temp.setFechaDeSolicitud((Date) maps.get(""));
			temp.setFechaDeVencimiento((Date) maps.get(""));
			temp.setIdProductoCredito((String) maps.get(""));
			temp.setIdSolicitudCredito((String) maps.get(""));
			temp.setIndicadorEliminacion((String) maps.get(""));
			temp.setMoneda((String) maps.get(""));
			temp.setMontoSolicitado((BigDecimal) maps.get(""));
			temp.setNumeroCuotas((int) maps.get(""));
			temp.setPrimeraFechaPago((Date) maps.get(""));
			temp.setTasaDeCuota((BigDecimal) maps.get(""));
			temp.setTasaMoratoria((BigDecimal) maps.get(""));
		    listModels.add(temp);
		}
		return listModels;
    }

}
