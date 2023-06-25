package com.spring.modeldata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CityMain {
 
	 private Boolean error;
	 private String msg; 
	 private List<Data> data; ///Data Class Means Country

	
	CityMain(Boolean error, String msg, List<Data> data) {
		super();
		this.error = error;
		this.msg = msg;
		this.data = data;
	}

	public Boolean getError() {
		return error;
	}

	public void setError(Boolean error) {
		this.error = error;
	}

	public CityMain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}
	    
}
