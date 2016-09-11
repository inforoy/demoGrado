package com.bank.credyunion.model;

import java.io.Serializable;
import java.util.Date;

public class T018_Socio implements Serializable {

	private static final long serialVersionUID = -5445891723271292073L;
	private String idSocio;
	private String idAgencia;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String numeroDni;
	private Date fechaDeIngreso; 
	private Date fechaDeNacimiento;
	private String telefonoMovilUno;
	private String telefonoMovilDos;
	private String telefonoFijo;
	private String correoElectronicoUno;
	private String correoElectronicoDos;
	private String indicadorEliminacion;
		
}
