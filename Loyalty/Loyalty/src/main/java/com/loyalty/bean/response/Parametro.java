package com.loyalty.bean.response;

public class Parametro {
	
	private int id ;
	private String key ;
	private String value ;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Parametro [id=" + id + ", key=" + key + ", value=" + value + "]";
	}
	
	
	
}
