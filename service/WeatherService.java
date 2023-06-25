package com.spring.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.modeldata.Weather;

@Service
public class WeatherService {
      
	public Object getWeather(String location)
	{
		final String API_KEY ="ba61e79a0119a86f77cc471643451b24";
		 String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + API_KEY;
		 
	        RestTemplate restTemplate = new RestTemplate();
	        try {
	        	 Object response = restTemplate.getForObject(apiUrl, Object.class);
	 	        return response;
			} catch (Exception e) {
				//e.printStackTrace();
			}
	        
	        return null;
	}

	
	
}
