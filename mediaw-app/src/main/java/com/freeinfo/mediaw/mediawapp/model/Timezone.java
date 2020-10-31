package com.freeinfo.mediaw.mediawapp.model;

import lombok.Data;

@Data
public class Timezone {

    private String name;
    private int now_in_dst;
    private int offset_sec;
    private String offset_string;
    private String short_name;
	
}
