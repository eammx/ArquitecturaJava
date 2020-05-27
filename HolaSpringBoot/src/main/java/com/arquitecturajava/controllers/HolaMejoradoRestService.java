package com.arquitecturajava.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * A partir de la versión 4.3 de Spring Framework existe la posibilidad de tener
 * unas anotaciones algo más compactas y más sencillas de leer que se encarguen
 * cada una de ellas de uno de los verbos HTTP (get,post, put,delete)
 * 
 * @author ernesto
 *
 */
@RestController
public class HolaMejoradoRestService {

	@GetMapping("/holaMejorado")
	public String hola() {

		return "hola desde spring con Getmapping";
	}
}
