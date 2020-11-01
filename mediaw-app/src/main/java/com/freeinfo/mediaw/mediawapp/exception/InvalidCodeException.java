package com.freeinfo.mediaw.mediawapp.exception;

public class InvalidCodeException extends Exception {

	private static final long serialVersionUID = 2558945763323306222L;

	private String messaggio = "Codice prodotto non valido";

	public InvalidCodeException() {
		
	}
	
	public InvalidCodeException(String messaggio) {
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
