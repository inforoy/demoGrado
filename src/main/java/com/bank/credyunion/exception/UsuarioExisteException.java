package com.bank.credyunion.exception;

public class UsuarioExisteException extends ServiceException{
	
	private static final long serialVersionUID = -2665974726368057924L;
	
	public UsuarioExisteException(){
        super();
    }
    public UsuarioExisteException(String newMensaje){
        super(newMensaje);
    }
    
}