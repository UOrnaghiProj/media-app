package com.freeinfo.mediaw.mediawapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Components {
	
    @JsonProperty("ISO_3166-1_alpha-2") 
    private String iSO31661Alpha2;
    @JsonProperty("ISO_3166-1_alpha-3") 
    private String iSO31661Alpha3;
    private String _category;
    private String _type;
    private String continent;
    private String country;
    private String country_code;
    private String county;
    private String county_code;
    private String political_union;
    private String state;
    private String town;
    private String house_number;
    private String post_office;
    private String postcode;
    private String road;
    private String hamlet;
    private String railway;

}
