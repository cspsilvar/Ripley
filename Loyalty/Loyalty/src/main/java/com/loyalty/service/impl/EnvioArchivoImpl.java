package com.loyalty.service.impl;

import java.io.IOException;
import java.io.InputStream;

import com.loyalty.bean.ResultadoProceso;
import com.loyalty.service.IEnvioArchivo;

public class EnvioArchivoImpl implements IEnvioArchivo {

	@Override
	public ResultadoProceso envioArchivo() {
		ResultadoProceso resultado = new ResultadoProceso() ;
		String ejecucion = "java " ;
		ejecucion += " -cp .:lib/*" ;
		ejecucion += " -jar " ;
		//ejecucion += " C:\\csr\\Aligare\\Ripley\\Loyalty\\procesoJAR\\SDK\\Components\\lib\\" ;
		ejecucion += " lib/" ;
		ejecucion += "loyalty-objectstorage-1.0.0.jar " ;
		ejecucion += "\"put\" " ;
		ejecucion += " \"C:\\\\csr\\\\aligare\\\\ripley\\\\Loyalty\\\\ProcesoJar\\\\SDK\\\\Components\\\\lib\\tmp\\\\\" " ;
		ejecucion += " \"ORAINT010.ECCSA.IN.201812011212\" " ;
		ejecucion += " \"dev\" " ;
		try {
			Process proceso = Runtime.getRuntime().exec(ejecucion) ;
			proceso.waitFor() ;
			InputStream in = proceso.getInputStream() ;
			InputStream err = proceso.getErrorStream() ;
			
			byte b[]=new byte[in.available()];
			in.read(b,0,b.length);
			System.out.println(new String(b));

			byte c[]=new byte[err.available()];
			err.read(c,0,c.length);
			System.out.println(new String(c));
			
		} catch (IOException e) {
			resultado.setCodigoEstado(-1);
			resultado.setEstado("ERROR");
			resultado.setDescripcionEstado(e.getMessage());
		} catch (InterruptedException e) {
			resultado.setCodigoEstado(-1);
			resultado.setEstado("ERROR");
			resultado.setDescripcionEstado(e.getMessage());
		}
		return resultado ;
	}

}
