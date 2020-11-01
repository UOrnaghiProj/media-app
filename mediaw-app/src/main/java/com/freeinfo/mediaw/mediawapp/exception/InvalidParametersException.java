package com.freeinfo.mediaw.mediawapp.exception;


public class InvalidParametersException extends Exception {

	private static final long serialVersionUID = 9108865674799243800L;
	
	private String messaggio = "Luogo non valido";

	public InvalidParametersException() {
		
	}
	
	public InvalidParametersException(String messaggio) {
		super();
		this.messaggio = messaggio;
	}

	public String getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}
	
}
