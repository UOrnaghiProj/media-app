package com.freeinfo.mediaw.mediawapp.model;

import java.util.List;

import lombok.Data;

@Data
public class Currency {
	
    private List<Object> alternate_symbols;
    private String decimal_mark;
    private String html_entity;
    private String iso_code;
    private String iso_numeric;
    private String name;
    private int smallest_denomination;
    private String subunit;
    private int subunit_to_unit;
    private String symbol;
    private int symbol_first;
    private String thousands_separator;

}
