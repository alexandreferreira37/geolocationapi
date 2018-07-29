package com.ax37tech.geolocationapi.domain;

import java.util.Date;

public class City {
	
	private Long id;
	private String name;
	private Long population;
	private String microRegion;
	private Date fundationDate;
	private Double Latitude;
	private Double Longitude;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	public String getMicroRegion() {
		return microRegion;
	}
	public void setMicroRegion(String microRegion) {
		this.microRegion = microRegion;
	}
	public Date getFundationDate() {
		return fundationDate;
	}
	public void setFundationDate(Date fundationDate) {
		this.fundationDate = fundationDate;
	}
	public Double getLatitude() {
		return Latitude;
	}
	public void setLatitude(Double latitude) {
		Latitude = latitude;
	}
	public Double getLongitude() {
		return Longitude;
	}
	public void setLongitude(Double longitude) {
		Longitude = longitude;
	}
	
	
	
}
