package com.loyalty.bean.request;

import java.util.List;

import com.loyalty.bean.response.Resultado;


public class RequestActualizarTarea {

	private String id ;
	private EstadoEntrada status ;
	private List<Resultado> results ;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public EstadoEntrada getStatus() {
		return status;
	}
	public void setStatus(EstadoEntrada status) {
		this.status = status;
	}
	public List<Resultado> getResults() {
		return results;
	}
	public void setResults(List<Resultado> results) {
		this.results = results;
	}
	
}
