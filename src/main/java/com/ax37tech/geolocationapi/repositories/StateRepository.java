package com.ax37tech.geolocationapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ax37tech.geolocationapi.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{

}
