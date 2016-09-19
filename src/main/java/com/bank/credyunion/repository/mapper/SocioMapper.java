package com.bank.credyunion.repository.mapper;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bank.credyunion.domain.T018_Socio;

public class SocioMapper implements Serializable {

	private static final long serialVersionUID = -4860785685572909858L;
	
	public List<T018_Socio> listModelMapper(List<Map<String, Object>> modelMaps ) {
		List<T018_Socio> listModels = new LinkedList<T018_Socio>();
		for (Map<String, Object> maps : modelMaps ) {
			T018_Socio temp = new T018_Socio();
			temp.setApellidoMaterno( (String) maps.get("") );
			temp.setApellidoPaterno( (String) maps.get("") );
			temp.setCorreoElectronicoDos( (String) maps.get("") );
			temp.setCorreoElectronicoUno( (String) maps.get("") );
			temp.setFechaDeIngreso( (Date) maps.get("") );
			temp.setFechaDeNacimiento( (Date) maps.get("") );
			temp.setIdAgencia( (String) maps.get("") );
			temp.setIdSocio( (String) maps.get("") );
			temp.setIndicadorEliminacion( (String) maps.get("") );
			temp.setNombres( (String) maps.get("") );
			temp.setNumeroDni( (String) maps.get("") );
			temp.setTelefonoFijo( (String) maps.get("") );
			temp.setTelefonoMovilDos( (String) maps.get("") );
			temp.setTelefonoMovilUno( (String) maps.get("") );
		    listModels.add(temp);
		}
		return listModels;
    }

}
