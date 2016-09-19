package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T006_Empresa;

public class EmpresaMapper implements Serializable {

	private static final long serialVersionUID = 548503025002839522L;

	public List<T006_Empresa> listBusinessMapper (List<Map<String, Object>> businessMaps ) {
		List<T006_Empresa> listBusiness = new LinkedList<T006_Empresa>();
		for (Map<String, Object> business : businessMaps ) {
			T006_Empresa usuario = new T006_Empresa();
		    usuario.setIdEmpresa( (String) business.get("id_empresa") );
		    usuario.setDescripcion( (String) business.get("descripcion") );
		    usuario.setFechaDeCreacion( (Date) business.get("fecha_creacion") );
		    usuario.setIndicadorEliminacion( (String) business.get("indicador_emilinacion") );
		    listBusiness.add(usuario);
		}
		return listBusiness;
		
		
	}
	
}
