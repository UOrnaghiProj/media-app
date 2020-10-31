package com.freeinfo.mediaw.mediawapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.freeinfo.mediaw.mediawapp.exception.InvalidParametersException;
import com.freeinfo.mediaw.mediawapp.exception.NotFoundException;
import com.freeinfo.mediaw.mediawapp.model.Location;
import com.freeinfo.mediaw.mediawapp.model.MediaAvabilityDTO;


import reactor.core.publisher.Mono;

@Service
public class MediaService {
	
	private static final Logger logger = LoggerFactory.getLogger(MediaService.class);

	
	private static final String URI_AVANILITY = "https://www.mediaworld.it/api/v1/stores/itemsAvailability/";
	private static final String URI_COORDINATES = "https://api.opencagedata.com/geocode/v1/json?q=";
	private static final String KEY = "&key=a337393afafc42e8a36dd548a94b7008";
	private static final String ITALY = "italy";
	
	
	@Autowired
	private WebClient.Builder webClient;
	
	@Cacheable("locations")
	public String getCoordates(String input) {
		
		Location location = new Location();
		
		location = webClient.build()
				 .get()
				 .uri(URI_COORDINATES + input + "," + ITALY + KEY)
				 .retrieve()
				 .bodyToMono(Location.class)
				 .block();
		
		logger.info("***** Ritiro i dati delle coordinate del luogo richiesto :" + input + " *****");
		
		Double latitudine = location.getResults().get(0).getGeometry().getLat();
		Double longitudine = location.getResults().get(0).getGeometry().getLng();
	
		return latitudine + "," + longitudine;
	}

	@Cacheable("mediaData")
	public MediaAvabilityDTO chiamtaMedia(String itemCode, String coordinates) throws InvalidParametersException {
		
		MediaAvabilityDTO media = new MediaAvabilityDTO();
		
		media = webClient.build()
				 .get()
				 .uri(URI_AVANILITY + itemCode + "/" + coordinates)
				 .retrieve()
				 .onStatus(HttpStatus::is4xxClientError,response -> {return Mono.error(new NotFoundException());})
				 .bodyToMono(MediaAvabilityDTO.class)
				 .block();
		
		//Se il servizio ritorna Terni e Perugia vuol dire che ci sono dei problemi nell'inserimento del luogo
		if(("Terni").equals(media.getStoresList().getStores().get(0).getName())
				&& ("Perugia").equals(media.getStoresList().getStores().get(1).getName()))
			throw new InvalidParametersException();
		
		logger.info("***** Ritiro i dati dell'oggetto :" + itemCode + " dal sito Mediaworld *****");
		
		return media;
	
	}
	
}
