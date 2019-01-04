package com.loyalty.service;

import com.loyalty.bean.ResultadoProceso;

public interface ITarea {

	public ResultadoProceso obtenerTarea() ;
	
	public ResultadoProceso crearTarea() ;

	public ResultadoProceso actualizarTarea() ;

	public ResultadoProceso obtenerTareas() ;
	
}
