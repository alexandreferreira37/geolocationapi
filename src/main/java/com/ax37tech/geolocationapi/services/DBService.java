package com.ax37tech.geolocationapi.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ax37tech.geolocationapi.domain.Country;
import com.ax37tech.geolocationapi.domain.State;
import com.ax37tech.geolocationapi.repositories.CountryRepository;
import com.ax37tech.geolocationapi.repositories.StateRepository;

@Service
public class DBService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	public void instantiateTestDatabase() {
		
		Country c1 = new Country(null,"Brasil");
		
		State s2 = new State(null,"Espirito Santo","ES","Sudeste",1200000.00, (long) 120000);
		State s1 = new State(null,"São Paulo","SP","Sudeste",2400000.00, (long) 270000);
		c1.getStates().addAll(Arrays.asList(s1,s2));
		
		countryRepository.saveAll(Arrays.asList(c1));
		stateRepository.saveAll(Arrays.asList(s1, s2));		
	}
}
