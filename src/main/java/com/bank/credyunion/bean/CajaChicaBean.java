package com.bank.credyunion.bean;

import java.math.BigDecimal;
import java.util.Date;

public class CajaChicaBean {
	
	private String idCajaChica;
	private String idProductoCajaChica;
	private String idSocio;
	private BigDecimal ingresoTotal;
	private BigDecimal engresoTotal;		
	private BigDecimal saldoDeCierre;
	private Date fechaDeProceso;
	private String documentoDeReferencia;
	private String indicadorEliminacion;
	
	public String getIdCajaChica() {
		return idCajaChica;
	}
	public void setIdCajaChica(String idCajaChica) {
		this.idCajaChica = idCajaChica;
	}
	public String getIdProductoCajaChica() {
		return idProductoCajaChica;
	}
	public void setIdProductoCajaChica(String idProductoCajaChica) {
		this.idProductoCajaChica = idProductoCajaChica;
	}
	public String getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(String idSocio) {
		this.idSocio = idSocio;
	}
	public BigDecimal getIngresoTotal() {
		return ingresoTotal;
	}
	public void setIngresoTotal(BigDecimal ingresoTotal) {
		this.ingresoTotal = ingresoTotal;
	}
	public BigDecimal getEngresoTotal() {
		return engresoTotal;
	}
	public void setEngresoTotal(BigDecimal engresoTotal) {
		this.engresoTotal = engresoTotal;
	}
	public BigDecimal getSaldoDeCierre() {
		return saldoDeCierre;
	}
	public void setSaldoDeCierre(BigDecimal saldoDeCierre) {
		this.saldoDeCierre = saldoDeCierre;
	}
	public Date getFechaDeProceso() {
		return fechaDeProceso;
	}
	public void setFechaDeProceso(Date fechaDeProceso) {
		this.fechaDeProceso = fechaDeProceso;
	}
	public String getDocumentoDeReferencia() {
		return documentoDeReferencia;
	}
	public void setDocumentoDeReferencia(String documentoDeReferencia) {
		this.documentoDeReferencia = documentoDeReferencia;
	}
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
	
}
