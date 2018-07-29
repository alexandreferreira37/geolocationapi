package com.ax37tech.geolocationapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.ax37tech.geolocationapi.domain.Country;
import com.ax37tech.geolocationapi.dto.CountryDTO;
import com.ax37tech.geolocationapi.repositories.CountryRepository;
import com.ax37tech.geolocationapi.services.exceptions.DataIntegrityException;
import com.ax37tech.geolocationapi.services.exceptions.ObjectNotFoundException;

@Service
public class CountryService {

	@Autowired
	private CountryRepository repo;
	
	public Country find(Long id) {
		Optional<Country> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Country.class.getName()));
	}
	
	public Country insert(Country obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Country update(Country obj) {
		Country newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}
	
	public void delete(Long id) {
		find(id);
		try {
			repo.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir um pais que possui estados");
		}
	}
	
	public List<Country> findAll() {
		return repo.findAll();
	}
	
	public Page<Country> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	public Country fromDTO(CountryDTO objDto) {
		return new Country(objDto.getId(), objDto.getName());
	}
	
	private void updateData(Country newObj, Country obj) {
		newObj.setName(obj.getName());
	}
	
}
