package com.freeinfo.mediaw.mediawapp.controller;

import com.freeinfo.mediaw.mediawapp.model.Location;
import com.freeinfo.mediaw.mediawapp.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest")
public class MediaRestController {

    @Autowired
    ProductInfoService productInfoService;


    @GetMapping(value = "location/{code}")
    public Location getLocation(@PathVariable("code") String productCode){
        return productInfoService.retrieveLocation(productCode);
    }
}