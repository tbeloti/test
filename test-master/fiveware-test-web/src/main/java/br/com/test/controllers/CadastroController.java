package br.com.test.controllers;

import java.net.MalformedURLException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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
   public String salvar(@Valid FormularioDto formulario, Model model ) throws MalformedURLException{
	   System.out.println("valor" + formulario.toString() ); 
	   
		  cadastroService.salvarFormulario(formulario);
		   model.addAttribute("status", "OK");
		   model.addAttribute("formulario", formulario);
	  
	   
	  
	   return "ok";
   }
   
  
}
