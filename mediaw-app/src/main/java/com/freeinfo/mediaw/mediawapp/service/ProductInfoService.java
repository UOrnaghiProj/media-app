package com.freeinfo.mediaw.mediawapp.service;


import com.freeinfo.mediaw.mediawapp.connector.MediaworlFeignClient;
import com.freeinfo.mediaw.mediawapp.model.Location;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductInfoService {


    MediaworlFeignClient mediaworlClient;
    String stato;
    String token;


    ProductInfoService(MediaworlFeignClient mediaworlFeignClient, @Value("${mediaworld.state}") String state,@Value("${mediaworld.key}") String key){
        mediaworlClient = mediaworlFeignClient;
        stato = state;
        token = key;
    }


    public Location retrieveLocation (String code){
        String productCode = code +  stato;
        return mediaworlClient.productLocation(productCode, token);
    }

}
