package br.com.rest.service;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.rest.dto.FormularioDto;
import br.com.rest.facade.PessoalFacade;

@Path("/pessoa")
public class PessoaService {
	
	@Inject
	private PessoalFacade pessoalFacade;
	
	
	
	@POST
	@Path("/salvar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response salvar(  String conteudo) {
		
		FormularioDto formulario = new Gson().fromJson(conteudo, FormularioDto.class);
		
		
		
		try{
			pessoalFacade.salvar(formulario);
			
			return Response.ok().build();
		}catch(Exception e){
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
}
