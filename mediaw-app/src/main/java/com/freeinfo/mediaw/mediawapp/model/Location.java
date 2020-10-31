package com.freeinfo.mediaw.mediawapp.model;

import java.util.List;

import lombok.Data;

@Data
public class Location {
	
    private String documentation;
    private List<License> licenses;
    private Rate rate;
    private List<Result> results;
    private Status status;
    private StayInformed stay_informed;
    private String thanks;
    private Timestamp timestamp;
    private int total_results;

}
