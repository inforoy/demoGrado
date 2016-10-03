package com.bank.credyunion.exception;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 352030637198909958L;

	public ServiceException(){
		super();
	}

	public ServiceException(String newMensaje){
	    super(newMensaje);
	}
}
