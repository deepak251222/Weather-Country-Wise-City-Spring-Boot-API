package com.spring.service;
import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.modeldata.CityMain;
import com.spring.modeldata.Data;

@Service
public class CityService {
      
	 List<Data> collect =new ArrayList<>();
	public  List<Data> getAll() {

		String uri = "https://countriesnow.space/api/v0.1/countries";

		RestTemplate temp1 = new RestTemplate();

	    Object[] objects = new Object[] {temp1.getForObject(uri,Object.class)};
	     
	     ObjectMapper mapper =new ObjectMapper();
	        collect = Arrays.stream(objects).map(o->mapper.convertValue(o, CityMain.class))
	    		.map(CityMain :: getData).collect(Collectors.toList()).get(0);
		return collect;

	}
	

	public List<Data> getOne1(String countrya) {
		
		String uri = "https://countriesnow.space/api/v0.1/countries";

		RestTemplate temp1 = new RestTemplate();

	    Object[] objects = new Object[] {temp1.getForObject(uri,Object.class)};
	     
	     ObjectMapper mapper =new ObjectMapper();
	     List<Data> collect = Arrays.stream(objects).map(o->mapper.convertValue(o, CityMain.class))
	    		.map(CityMain :: getData).collect(Collectors.toList()).get(0);
          for(Data collect1 : collect)
          {
        	  System.out.println(collect1 + " country name");
          }
		   return collect.stream().filter(e->e.getCountry().equals(countrya)).collect(Collectors.toList());
	}

}
