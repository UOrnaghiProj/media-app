package com.freeinfo.mediaw.mediawapp.service;


import com.freeinfo.mediaw.mediawapp.connector.MediaWorldFeignClient;
import com.freeinfo.mediaw.mediawapp.connector.OpenCageDatqaFeignClient;
import com.freeinfo.mediaw.mediawapp.model.Location;
import com.freeinfo.mediaw.mediawapp.model.MediaAvabilityDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductInfoService {

    OpenCageDatqaFeignClient openCageDataClient;
    MediaWorldFeignClient mediaWorldClient;
    String stato;
    String token;

    ProductInfoService(
            OpenCageDatqaFeignClient mediaworlFeignClient,
            MediaWorldFeignClient mediaWorldFeignClient,
            @Value("${client.opencagedata.state}") String state,
            @Value("${client.opencagedata.token}") String key
    ){
        mediaWorldClient = mediaWorldFeignClient;
        openCageDataClient = mediaworlFeignClient;
        stato = state;
        token = key;
    }

    public Location retrieveLocation (String locotationCode){

        return openCageDataClient.searchLocationByName(locotationCode, stato,  token);
    }

    public MediaAvabilityDTO searchInLocation(String locotationCode, String productCode){

        Location location = retrieveLocation(locotationCode);
        String cordinates = location.getResults().get(0).getGeometry().getLat() +  "," + location.getResults().get(0).getGeometry().getLng();
         return  mediaWorldClient.searchOnLocation(productCode,cordinates);
    }

}
