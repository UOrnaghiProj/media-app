package com.freeinfo.mediaw.mediawapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.freeinfo.mediaw.mediawapp.exception.InvalidCodeException;
import com.freeinfo.mediaw.mediawapp.exception.InvalidParametersException;
import com.freeinfo.mediaw.mediawapp.model.MediaAvabilityDTO;
import com.freeinfo.mediaw.mediawapp.service.MediaService;

@Controller
public class MediaController {
	
	@Autowired
	MediaService mediaService;
	
	@GetMapping(value = "/avability")
	public String getCoordinates(@RequestParam(value = "location") String location,
								 @RequestParam(value = "itemCode") String itemCode,
								 Model model) throws InvalidParametersException, InvalidCodeException{
		
		String coordinate = mediaService.getCoordates(location);
		
		MediaAvabilityDTO resp = mediaService.chiamtaMedia(itemCode, coordinate, location);
		
		model.addAttribute("result",resp);
		
		return "index :: tabModale";
		
	}
	
	@GetMapping(value = "/")
	public String getHome(Model model) {
		
		model.addAttribute("errore",false);
		
		return "index";
	}
	

}
