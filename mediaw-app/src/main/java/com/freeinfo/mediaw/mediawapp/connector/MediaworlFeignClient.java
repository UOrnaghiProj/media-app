package com.freeinfo.mediaw.mediawapp.connector;

import com.freeinfo.mediaw.mediawapp.model.Location;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="mediawrold", url = "${mediaworld.cordinate}")
public interface MediaworlFeignClient {

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    Location productLocation(
            @RequestParam("q") String productCode,
            @RequestParam("key") String key
    );
}