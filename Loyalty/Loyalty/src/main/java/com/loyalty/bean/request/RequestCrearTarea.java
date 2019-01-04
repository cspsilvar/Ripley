package com.loyalty.bean.request;

import java.util.List;

public class RequestCrearTarea {

	private TipoEntrada type ;
	private List<ParametroEntrada> params ;
	
	
	public TipoEntrada getType() {
		return type;
	}
	public void setType(TipoEntrada type) {
		this.type = type;
	}
	public List<ParametroEntrada> getParams() {
		return params;
	}
	public void setParams(List<ParametroEntrada> params) {
		this.params = params;
	}
	
	
	
		
}
