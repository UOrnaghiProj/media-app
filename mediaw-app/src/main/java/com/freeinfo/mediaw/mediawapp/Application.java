package com.freeinfo.mediaw.mediawapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Applicazione per la ricerca della disponibilita' dei prodotti
 * Mediaworld nei vari centri
 * @author umberto Ornaghi
 *
 */

@SpringBootApplication
@EnableCaching
@EnableFeignClients
public class Application {
	
	@Bean
	public WebClient.Builder getWebClientBuilder(){
		return WebClient.builder();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
