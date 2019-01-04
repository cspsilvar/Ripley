package com.loyalty.service.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.loyalty.bean.ResultadoProceso;
import com.loyalty.bean.request.ParametroEntrada;
import com.loyalty.bean.request.RequestActualizarTarea;
import com.loyalty.bean.request.RequestCrearTarea;
import com.loyalty.bean.request.RequestObtenerTareas;
import com.loyalty.bean.request.TipoEntrada;
import com.loyalty.bean.response.ResponseCrearTarea;
import com.loyalty.bean.response.ResponseObtenerTarea;
import com.loyalty.bean.response.ResponseObtenerTareas;
import com.loyalty.service.ITarea;
import com.loyalty.util.SSLCertificateValidation;



public class TareaImpl implements ITarea {

	@Override
	public ResultadoProceso obtenerTarea() {
		ResultadoProceso resultado = new ResultadoProceso() ;
		RestTemplate restTemplate = new RestTemplate() ;
		URI uri;
		try {			
			SSLCertificateValidation.disable();
			uri = new URI("https://129.213.132.210/batchRestApi/resources/1.0/tasks/4");
			try {
				ResponseObtenerTarea response = (ResponseObtenerTarea) restTemplate.getForObject(uri, ResponseObtenerTarea.class);
//				ResponsePersona response = (ResponsePersona) restTemplate.postForObject(uri, request, ResponsePersona.class);
				resultado.setDescripcionEstado(response.toString());
			} catch (Exception e) {
				resultado.setCodigoEstado(-1);
				resultado.setEstado("ERROR");
				resultado.setOk(false);
				resultado.setDescripcionEstado(e.getMessage());
			}
		} catch (URISyntaxException e) {
			resultado.setCodigoEstado(-1);
			resultado.setEstado("ERROR");
			resultado.setOk(false);
			resultado.setDescripcionEstado(e.getMessage());
		}
		return resultado ;
	}

	@Override
	public ResultadoProceso crearTarea() {
		ResultadoProceso resultado = new ResultadoProceso() ;
		RestTemplate restTemplate = new RestTemplate() ;
		URI uri;
		try {			
			SSLCertificateValidation.disable();
			uri = new URI("https://129.213.132.210/batchRestApi/resources/1.0/tasks");
			try {
				RequestCrearTarea request  = new RequestCrearTarea();
				request.setType(new TipoEntrada("BatchAccrualsTrxnTask"));
				
				List<ParametroEntrada> paramsList = new ArrayList<ParametroEntrada>();
				ParametroEntrada p = new ParametroEntrada("partner","ECCSA");
				paramsList.add(p);
				ParametroEntrada p2 = new ParametroEntrada("file","ORAINT010.ECCSA.IN.201812261212");
				paramsList.add(p2);
				request.setParams(paramsList);
				ResponseCrearTarea response = (ResponseCrearTarea) restTemplate.postForObject(uri, request, ResponseCrearTarea.class);
				resultado.setDescripcionEstado(response.toString());
			} catch (Exception e) {
				resultado.setCodigoEstado(-1);
				resultado.setEstado("ERROR");
				resultado.setOk(false);
				resultado.setDescripcionEstado(e.getMessage());
			}
		} catch (URISyntaxException e) {
			resultado.setCodigoEstado(-1);
			resultado.setEstado("ERROR");
			resultado.setOk(false);
			resultado.setDescripcionEstado(e.getMessage());
		}
		return resultado ;
	}

	@Override
	public ResultadoProceso actualizarTarea() {
		ResultadoProceso resultado = new ResultadoProceso() ;
		RestTemplate restTemplate = new RestTemplate() ;
		URI uri;
		try {			
			SSLCertificateValidation.disable();
			uri = new URI("https://129.213.132.210/batchRestApi/resources/1.0/tasks/4");
			RequestActualizarTarea request = new RequestActualizarTarea() ;
		
			//ResponseActualizarTarea response = restTemplate.put(uri, request);
			//resultado.setDescripcionEstado(response.toString());
		} catch (Exception e) {
			resultado.setCodigoEstado(-1);
			resultado.setEstado("ERROR");
			resultado.setOk(false);
			resultado.setDescripcionEstado(e.getMessage());
		}
		return resultado ;
	}

	@Override
	public ResultadoProceso obtenerTareas() {
		ResultadoProceso resultado = new ResultadoProceso() ;
		RestTemplate restTemplate = new RestTemplate() ;
		String transactionUrl = "https://129.213.132.210/batchRestApi/resources/1.0/tasks" ;
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(transactionUrl)
		    // Add query parameter
		    .queryParam("status", "PREPARED")
		    .queryParam("type", "BatchAccrualsTrxnTask");
	
			SSLCertificateValidation.disable();
			try {
				RequestObtenerTareas request = new RequestObtenerTareas() ;
				request.setStatus("PREPARED"); 
				request.setType(new TipoEntrada("BatchAccrualsTrxnTask"));
				ResponseObtenerTareas response = (ResponseObtenerTareas) restTemplate.getForObject(builder.toUriString(), ResponseObtenerTareas.class);
				resultado.setDescripcionEstado(response.toString());
			} catch (Exception e) {
				resultado.setCodigoEstado(-1);
				resultado.setEstado("ERROR");
				resultado.setOk(false);
				resultado.setDescripcionEstado(e.getMessage());
			}
		
		return resultado ;
	}

}
