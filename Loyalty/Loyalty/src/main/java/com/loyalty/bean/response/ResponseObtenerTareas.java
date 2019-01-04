package com.loyalty.bean.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseObtenerTareas {

	private List<Tarea> tasks ;

	public List<Tarea> getTasks() {
		return tasks;
	}

	public void setTasks(List<Tarea> tasks) {
		this.tasks = tasks;
	}
	
	
	
}
