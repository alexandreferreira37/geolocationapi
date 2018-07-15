package com.ax37tech.geolocationapi.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/countries")
public class CountryResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "rest está funcionando";
	}
}
