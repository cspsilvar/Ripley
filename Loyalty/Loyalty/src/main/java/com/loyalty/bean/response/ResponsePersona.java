package com.loyalty.bean.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponsePersona {

	private Integer status;
	private String message;
	private String typeMsg;
	private Object data;
	
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTypeMsg() {
		return typeMsg;
	}
	public void setTypeMsg(String typeMsg) {
		this.typeMsg = typeMsg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResponsePersona [status=" + status + ", message=" + message + ", typeMsg=" + typeMsg + ", data=" + data
				+ "]";
	}
	
	
	
}
