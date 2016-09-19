package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T014_PlanDePagoSolicitud;

public class PlanDePagoSolicitudMapper implements Serializable {

	private static final long serialVersionUID = 310498215922293973L;
	
	public List<T014_PlanDePagoSolicitud> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T014_PlanDePagoSolicitud> listModels = new LinkedList<T014_PlanDePagoSolicitud>();
		for (Map<String, Object> maps : modelMaps ) {
			T014_PlanDePagoSolicitud temp = new T014_PlanDePagoSolicitud();
			temp.setCapital( (BigDecimal) maps.get("") );
			temp.setCargo( (BigDecimal) maps.get("") );
			temp.setFechaDeCuota( (Date) maps.get("") );
			temp.setIdPlanDePagoSolicitud( (String) maps.get("") );
			temp.setIdSolicitudCredito( (String) maps.get("") );
			temp.setIndicadorEliminacion( (String) maps.get("") );
			temp.setInteres( (BigDecimal) maps.get("") );
			temp.setNumeroCuota( (int) maps.get("") );
			temp.setSaldoDeCuota( (BigDecimal) maps.get("") );
		    listModels.add(temp);
		}
		return listModels;
    }

}
