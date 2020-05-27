package com.arquitecturajava.controllers;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


/**
 * A partir de Spring 5 tenemos la opción de usar Spring WebFlux Router que nos
 * permite mapear el servicio sin añadir anotaciones al propio contenido de
 * nuestra clase. Algo que permite centralizar y clarificar las configuraciones
 * dejando las clases más limpias. Para que todo nos funcione correctamente
 * deberemos actualizar el proyecto pom.xml para usar programación reactiva
 * con io.projectreactor
 * 
 * @author ernesto
 *
 */
@Service
public class HolaMejoradoConFluxRestService {

	public Mono<String> hola() {
	    return Mono.just("hola desde spring y configuracion funcional");
	  }
}
