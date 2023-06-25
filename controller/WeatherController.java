package com.spring.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.spring.modeldata.Weather;
import com.spring.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    

	@Autowired
	private WeatherService weatherService;
	
	
    @GetMapping("/{location}")
    public Object getWeather(@PathVariable String location) {
    	
       return weatherService.getWeather(location);
    }
}   
         
