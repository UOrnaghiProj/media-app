package com.freeinfo.mediaw.mediawapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Annotations {

    @JsonProperty("DMS") 
    private DMS dMS;
    @JsonProperty("MGRS") 
    private String mGRS;
    @JsonProperty("Maidenhead") 
    private String maidenhead;
    @JsonProperty("Mercator") 
    private Mercator mercator;
    @JsonProperty("OSM") 
    private OSM oSM;
    @JsonProperty("UN_M49") 
    private UNM49 uN_M49;
    private int callingcode;
    private Currency currency;
    private String flag;
    private String geohash;
    private double qibla;
    private Roadinfo roadinfo;
    private Sun sun;
    private Timezone timezone;
    private What3words what3words;
    private String wikidata;
	
}
