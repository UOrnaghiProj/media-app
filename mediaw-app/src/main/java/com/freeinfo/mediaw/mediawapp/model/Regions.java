package com.freeinfo.mediaw.mediawapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Regions {

    @JsonProperty("EUROPE") 
    private String eUROPE;
    @JsonProperty("IT") 
    private String iT;
    @JsonProperty("SOUTHERN_EUROPE") 
    private String sOUTHERN_EUROPE;
    @JsonProperty("WORLD") 
    private String wORLD;
	
}
