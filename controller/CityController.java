package com.spring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.modeldata.Data;
import com.spring.service.CityService;

@RestController
@RequestMapping("/country")
public class CityController {
	@Autowired
	private CityService cityService;

	
	@GetMapping("/allcountry")
	public List<Data> allCountry() {
		List<Data> data = cityService.getAll();
		return data;
	}

      @GetMapping("/one/{country}")
	public List<Data> getOne1(@PathVariable("country") String country)
	{
		return cityService.getOne1(country);
	}
	}
