package com.bank.credyunion.domain;

import java.io.Serializable;

public class T001_Agencia implements Serializable {
	
	private static final long serialVersionUID = 1318842614571121942L;
	private String idAgencia;
	private String idEmpresa;
	private String descripcionAgencia;
	private String indicadorEliminacion;
	
	public String getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(String idAgencia) {
		this.idAgencia = idAgencia;
	}
	public String getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getDescripcionAgencia() {
		return descripcionAgencia;
	}
	public void setDescripcionAgencia(String descripcionAgencia) {
		this.descripcionAgencia = descripcionAgencia;
	}
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
	
}