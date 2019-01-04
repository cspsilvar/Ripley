package com.loyalty.bean;

public class ResultadoProceso {
	private int codigoEstado ;
	private String estado ;
	private boolean ok ;
	private String descripcionEstado ;
	
	
	public ResultadoProceso() {
		super() ;
		this.codigoEstado = 0 ;
		this.estado = "EXITO" ;
		this.ok = true ;
		this.descripcionEstado = "Proceso Exitoso" ;
	}


	public int getCodigoEstado() {
		return codigoEstado;
	}


	public void setCodigoEstado(int codigoEstado) {
		this.codigoEstado = codigoEstado;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public boolean isOk() {
		return ok;
	}


	public void setOk(boolean ok) {
		this.ok = ok;
	}


	public String getDescripcionEstado() {
		return descripcionEstado;
	}


	public void setDescripcionEstado(String descripcionEstado) {
		this.descripcionEstado = descripcionEstado;
	}
	
	
}
