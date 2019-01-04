package com.loyalty.bean.response;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseObtenerTarea {

	private int id ;
	private Date creationDate ;
	private Date lastUpdateDate ;
	private Estado status ;
	private Tipo type ;
	private List<Parametro> params ;
	private List<Resultado> results ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
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
	public List<Resultado> getResults() {
		return results;
	}
	public void setResults(List<Resultado> results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "ResponseObtenerTarea [id=" + id + ", creationDate=" + creationDate + ", lastUpdateDate="
				+ lastUpdateDate + ", status=" + status + ", type=" + type + ", params=" + params + ", results="
				+ results + "]";
	}
	
	
	
	
}
