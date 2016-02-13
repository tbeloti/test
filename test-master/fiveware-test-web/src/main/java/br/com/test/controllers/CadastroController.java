package br.com.test.controllers;

import java.net.MalformedURLException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.test.dto.FormularioDto;
import br.com.test.service.impl.CadastroService;


@Controller
public class CadastroController
{
	
   @Autowired
   private CadastroService cadastroService;
	
   @RequestMapping("/")
   public String index()  {
	   return "index";
   }
   
 
   
   
   
   @RequestMapping(value = "/salvar", method = RequestMethod.POST)
   public ResponseEntity<?> salvar(@Valid FormularioDto formulario, Model model ) {
	   
	  try{
		  cadastroService.salvarFormulario(formulario);
		  model.addAttribute("status", "OK");
		   model.addAttribute("formulario", formulario);
	  
	   
		   
	   return new ResponseEntity<>(HttpStatus.OK);
	  }catch(Exception e){
		  String errorMessage;
	       errorMessage = "Erro : " + e.getMessage();
	       return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST); 
	  }
		  
			   
			  
   }
   
  
}
