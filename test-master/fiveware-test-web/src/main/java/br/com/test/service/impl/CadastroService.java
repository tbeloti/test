package br.com.test.service.impl;

import java.net.MalformedURLException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import br.com.test.dto.FormularioDto;


@Service
public class CadastroService {

	private static final String  urlString = "http://localhost:8080/fiveware-test-service/rest/pessoa/salvar";
	
	public void salvarFormulario(FormularioDto formulario)  {
		
		Gson gson = new Gson();
		
		String json = gson.toJson(formulario);
		// create request body
		RestTemplate restTemplate = new RestTemplate();

		// set headers
		HttpHeaders headers = new HttpHeaders();
		 headers.add("Accept", "application/json");
		headers.add("Content-Type", "application/json");
		HttpEntity<String> entity = new HttpEntity<String>(json, headers);

		// send request and parse result
		ResponseEntity<String> loginResponse = restTemplate.exchange(urlString, HttpMethod.POST, entity, String.class);
		if (loginResponse.getStatusCode() == HttpStatus.OK) {
		 	System.out.println("OK");
		} else if (loginResponse.getStatusCode() == HttpStatus.UNAUTHORIZED) {
		  System.out.println("ERRO");
		}
	}

}
