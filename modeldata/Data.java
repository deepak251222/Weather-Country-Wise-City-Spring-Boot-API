package com.spring.modeldata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	private String iso2;
    private String  iso3;
    private String  country;
    
    private List<City> cities;

	public Data() {
		super();
	}

	

	public Data(String iso2, String iso3, String country, List<City> cities) {
		super();
		this.iso2 = iso2;
		this.iso3 = iso3;
		this.country = country;
		this.cities = cities;
	}



	public String getIso2() {
		return iso2;
	}

	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}

	public String getIso3() {
		return iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<City> getCities() {
		return cities;
	}



	public void setCities(List<City> cities) {
		this.cities = cities;
	}

}
