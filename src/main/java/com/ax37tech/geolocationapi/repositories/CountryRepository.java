package com.ax37tech.geolocationapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ax37tech.geolocationapi.domain.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{

}
