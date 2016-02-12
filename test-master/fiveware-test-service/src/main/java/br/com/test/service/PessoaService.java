package br.com.test.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.test.dto.FormularioDto;

@Path("/pessoa")
public class PessoaService {
	
	
	@GET
	@Path("/teste")
	public Response teste (  ){
		System.out.println("Ok");
		return Response.ok().build();
	}
	
	@POST
	@Path("/salvar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response salvar(  String conteudo) {
		
		FormularioDto formulario = new Gson().fromJson(conteudo, FormularioDto.class);
		
		
		System.out.println("Ufa Cheguei e estou bem e meu nome e : "+formulario.getNome());
		return Response.ok().build();
	}
}
