package com.spring.modeldata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class City {
   private String city;

public City(String city) {
	super();
	this.city = city;
}

public City() {
	super();
	
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
   
}
