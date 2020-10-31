package com.freeinfo.mediaw.mediawapp.model;

import lombok.Data;

@Data
public class Store {
	
    private String stloc_id;
    private String stloc_physical_id;
    private String city;
    private String province;
    private String address_one;
    private String address_two;
    private String postcode;
    private String phone;
    private Object website;
    private String orariApertura;
    private String orariAperturaTech;
    private String apertureXtra;
    private String name;
    private String latitude;
    private String longitude;
    private String distance;
    //Setting del valore di default per evitare valori nulli
    private Availability availability = new Availability(0, "null", "null");
    private int distanzaKM;
    private int tempo;

}
