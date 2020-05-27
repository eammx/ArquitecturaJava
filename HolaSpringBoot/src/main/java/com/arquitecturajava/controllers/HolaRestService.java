package com.arquitecturajava.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaRestService {
	
	@RequestMapping("/hola")
	public String hola() {
	    
	    return "hola desde spring";
	  }
}
