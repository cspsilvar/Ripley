package com.loyalty.bean.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseCrearTarea {

	private String creationDate ;
	private String id ;
	private String lastUpdateDate ;
	private List<Resultado> results ;
	private Estado status ;
	private Tipo type ;
	private List<Parametro> params ;
	
	
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public List<Resultado> getResults() {
		return results;
	}
	public void setResults(List<Resultado> results) {
		this.results = results;
	}

	public Estado getStatus() {
		return status;
	}
	public void setStatus(Estado status) {
		this.status = status;
	}

	public Tipo getType() {
		return type;
	}
	public void setType(Tipo type) {
		this.type = type;
	}
	public List<Parametro> getParams() {
		return params;
	}
	public void setParams(List<Parametro> params) {
		this.params = params;
	}
	@Override
	public String toString() {
		return "ResponseCrearTarea [creationDate=" + creationDate + ", id=" + id + ", lastUpdateDate=" + lastUpdateDate
				+ ", results=" + results + ", status=" + status + ", type=" + type + ", params=" + params + "]";
	}
	
	
	
}
