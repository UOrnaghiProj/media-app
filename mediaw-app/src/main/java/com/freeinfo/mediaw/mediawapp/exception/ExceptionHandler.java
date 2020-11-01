package com.freeinfo.mediaw.mediawapp.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
@Controller
public class ExceptionHandler extends ResponseEntityExceptionHandler{
	
	@org.springframework.web.bind.annotation.ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public final String exceptionNotFoundHandler(NotFoundException ex, Model model){
		
		model.addAttribute("errore",true);
		model.addAttribute("messaggio",ex.getMessaggio());
		
		return "index :: errMsg";
		
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(InvalidParametersException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public final String exceptionInvalidParameters(InvalidParametersException ex, Model model){
		
		model.addAttribute("errore",true);
		model.addAttribute("messaggio",ex.getMessaggio());
		
		return "index :: errMsg";
		
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(InvalidCodeException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public final String exceptionInvalidCode(InvalidCodeException ex, Model model){
		
		model.addAttribute("errore",true);
		model.addAttribute("messaggio",ex.getMessaggio());
		
		return "index :: errMsg";
		
	}

}
