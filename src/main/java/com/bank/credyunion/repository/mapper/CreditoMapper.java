package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T004_Credito;

public class CreditoMapper implements Serializable {

	private static final long serialVersionUID = 7960156435589527418L;
	
	public List<T004_Credito> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T004_Credito> listModels = new LinkedList<T004_Credito>();
		for (Map<String, Object> maps : modelMaps ) {
			T004_Credito temp = new T004_Credito();
			temp.setCantidadDeCuotas((int) maps.get(""));
			temp.setCodigoAgencia((String) maps.get(""));
			temp.setCodigoUsuario((String) maps.get(""));
			temp.setEstadoCredito((String) maps.get(""));
			temp.setFechaDeAprobacion((Date) maps.get(""));
			temp.setFechaDeCancelacion((Date) maps.get(""));
			temp.setFechaDeVencimiento((Date) maps.get(""));
			temp.setIdCredito((String) maps.get(""));
			temp.setIdProductoCredito((String) maps.get(""));
			temp.setIdSocio((String) maps.get(""));
			temp.setIdSolicitudCredito((String) maps.get(""));
			temp.setIndicadorEliminacion((String) maps.get(""));
			temp.setMoneda((String) maps.get(""));
			temp.setMontoDeCredito((BigDecimal) maps.get(""));
			temp.setPrimeraFechaDePago((Date) maps.get(""));
			temp.setSaldoDeCredito((BigDecimal) maps.get(""));
			temp.setSaldoDeDeuda((BigDecimal) maps.get(""));
			temp.setSaldoDeInteres((BigDecimal) maps.get(""));
			temp.setSaldoDeMora((BigDecimal) maps.get(""));
			temp.setTasaDeCuota((BigDecimal) maps.get(""));
			temp.setTasaMoratoria((BigDecimal) maps.get(""));
			temp.setUltimaFechaDePago((Date) maps.get(""));
		    listModels.add(temp);
		}
		return listModels;
    }

}
