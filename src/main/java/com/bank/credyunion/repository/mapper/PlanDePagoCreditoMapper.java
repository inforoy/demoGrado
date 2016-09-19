package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T013_PlanDePagoCredito;

public class PlanDePagoCreditoMapper implements Serializable {

	private static final long serialVersionUID = 3168565880253477807L;
	
	public List<T013_PlanDePagoCredito> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T013_PlanDePagoCredito> listModels = new LinkedList<T013_PlanDePagoCredito>();
		for (Map<String, Object> maps : modelMaps ) {
			T013_PlanDePagoCredito temp = new T013_PlanDePagoCredito();
			temp.setCapital((BigDecimal) maps.get(""));
			temp.setCargo((BigDecimal) maps.get(""));
			temp.setFechaDeCuota((Date) maps.get(""));
			temp.setFechaDePago((Date) maps.get(""));
			temp.setIdCredito((String) maps.get(""));
			temp.setIdPlanDePagoCredito((String) maps.get(""));
			temp.setIndicadorEliminacion((String) maps.get(""));
			temp.setInteres((BigDecimal) maps.get(""));
			temp.setMora((BigDecimal) maps.get(""));
			temp.setNumeroCuota((int) maps.get(""));
			temp.setSaldoDeCuota((BigDecimal) maps.get(""));
		    listModels.add(temp);
		}
		return listModels;
    }

}
