package com.ax37tech.geolocationapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ax37tech.geolocationapi.domain.Country;
import com.ax37tech.geolocationapi.services.CountryService;

@RestController
@RequestMapping(value="/countries")
public class CountryResource {
	
	@Autowired
	private CountryService countryService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "rest está funcionando";
	}	
	
	@RequestMapping (value="/{id}",method=RequestMethod.GET )
	public ResponseEntity<Country> find(@PathVariable Long id) {
				
		Country obj = countryService.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
