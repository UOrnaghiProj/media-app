package com.freeinfo.mediaw.mediawapp.connector;

import com.freeinfo.mediaw.mediawapp.model.Location;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="opencagedate", url = "${client.opencagedata.base_url}")
public interface OpenCageDatqaFeignClient {

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    Location searchLocationByName(
            @RequestParam("q") String productCode,
            @RequestParam("countrycode") String countryCode,
            @RequestParam("key") String key
    );
}