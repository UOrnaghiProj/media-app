package com.freeinfo.mediaw.mediawapp.model;

import lombok.Data;

@Data
public class Availability {
		
    private int giacenzaReale;
    private String giacenzaStato;
    private String giacenzaRGB;
    
    public Availability() {
    	
    }
    
	public Availability(int giacenzaReale, String giacenzaStato, String giacenzaRGB) {
		super();
		this.giacenzaReale = giacenzaReale;
		this.giacenzaStato = giacenzaStato;
		this.giacenzaRGB = giacenzaRGB;
	}
    
    
	
}
