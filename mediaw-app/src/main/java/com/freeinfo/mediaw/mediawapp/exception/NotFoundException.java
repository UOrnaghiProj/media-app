package com.freeinfo.mediaw.mediawapp.exception;

public class NotFoundException extends Exception{

	private static final long serialVersionUID = -7096748236141930492L;
	
	private String messaggio = "Il sito Mediaworld ha riscontrato problemi per il luogo indicato prova a cambiare";

	public NotFoundException() {}
	
	public NotFoundException(String messaggio) {
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
