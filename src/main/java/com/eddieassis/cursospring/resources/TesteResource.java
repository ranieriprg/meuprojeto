package com.eddieassis.cursospring.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/testes")
public class TesteResource {

	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "Rest Está funcionando ";
	}
	
	
}
