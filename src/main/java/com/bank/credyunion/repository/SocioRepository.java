package com.bank.credyunion.repository;

import java.util.List;

import com.bank.credyunion.domain.T018_Socio;

public interface SocioRepository {

	boolean registerSocio(T018_Socio socioModel);
	boolean updateSolicitudCredito(T018_Socio socioModel);
	boolean deleteSocio(T018_Socio socioModel);
	T018_Socio findSocioById(T018_Socio socioModel);
	List<T018_Socio> findAllSocios();
	int getNextSocio();
	
}
