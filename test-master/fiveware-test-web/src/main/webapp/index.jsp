<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Test Master Web</title>
	<link rel="stylesheet" href="<c:url value='/assets/css/bootstrap.min.css'/>">
  	<link rel="stylesheet" href="<c:url value='/assets/css/bootstrap-theme.min.css'/>">
	
</head>
<body>
	<div class="container">
		<div class="panel panel-default">
		  <div class="panel-heading">
		    <h3 class="panel-title">Cadastro Test Master</h3>
		  </div>
		  <div class="panel-body">
		    <form action="salvar" method="post">
	  			<div class="row">
	  				<div class="col-xs-10">
	  					<div class="form-group">
		  					<label for="nome">Nome</label>
		    				<input type="text" class="form-control" id="nome" name="nome" >
	    				</div>
	  				</div>
	  				<div class="col-xs-2">
	  					<div class="form-group">
		  					<label for="idade">Idade</label>
		    				<input type="text" class="form-control" id="idade" name="idade">
	    				</div>
	  				</div>
	  			</div>
	  			<div class="row">
			  		<div class="col-xs-6">
			  			<div class="form-group">
				  			<label for="estadoCivil">Estado Civil</label>
				  			<div class="checkbox">
				    		<label>Solteiro <input type="radio" name="estadoCivil" value="S"> </label>
				    		<label>Casado <input type="radio" name="estadoCivil" value="N"> </label>
				    		<label>Divorciado <input type="radio" name="estadoCivil" value="D"> </label>
				    		<label>Viuvo <input type="radio" name="estadoCivil" value="V"> </label>
				    		</div>
			    		</div>
			  		</div>
			  		<div class="col-xs-3">
			  			<div class="form-group">
				  			<label for="temFilhos">Tem Filhos</label>
				  			<div class="checkbox">
				    		<label>Sim <input type="radio" name="temFilhos" value="1"> </label>
				    		<label>Não <input type="radio" name="temFilhos" value="0"> </label>
				    		</div>
			    		</div>
			  		</div>
			  		<div class="col-xs-2">
	  					<div class="form-group">
		  					<label for="qdtFilhos">Quantos Filhos</label>
		    				<input type="text" class="form-control" id="qdtFilhos" name="qtdFilhos" maxlength="2">
	    				</div>
	  				</div>		
			  	</div>
			  	<div class="row" style="height: 20px;">	
	  				<hr>
	  			</div>
	  			<div class="row">
	  				<div class="col-xs-12">
		  				<fieldset>
		  					<legend>Endereço</legend>
		  					<div class="row">
		  						<div class="col-xs-6">
		  							<label for="logradouro">Logradouro</label>
		  							<input type="text" class="form-control" id="logradouro" name	="logradouro">
		  						</div>
		  						<div class="col-xs-1">
		  							<label for="numero">Numero</label>
		  							<input type="text" class="form-control" id="numero" name="numero">
		  						</div>
		  						<div class="col-xs-2">
		  							<label for="cep">CEP</label>
		  							<input type="text" class="form-control" id="cep"  name="cep">
		  						</div>
		  						<div class="col-xs-3">
		  							<label for="bairro">Bairro</label>
		  							<input type="text" class="form-control" id="bairro" name="bairro">
		  						</div>
		  					</div>
		  					
		  				</fieldset>
	  				</div>
	  			</div>
	  			<div class="row" style="height: 20px;">	
	  				<hr>
	  			</div>
	  			<div class="row">
	  				<div class="col-xs-12">
	  					<fieldset>
	  						<legend>Conhecimento</legend>
	  						<div class="checkbox">
	  							<div class="row">
		  							<div class="col-xs-2">
		  								<label> <input type="checkbox" name="conhecimentos" value="JAVA">JAVA</label>
		  							</div>
		  							<div class="col-xs-2">
		  								<label> <input type="checkbox" name="conhecimentos" value="C++"> C++ </label>
		  							</div>
		  							<div class="col-xs-2">
		  								<label><input type="checkbox" name="conhecimentos" value="C#"> C# </label>
		  							</div>
		  							<div class="col-xs-2">
		  								<label>	 <input type="checkbox" name="conhecimentos" value="COBOL"> COBOL </label>
		  							</div>
		  						
		  							<div class="col-xs-2">
		  								<label> <input type="checkbox" name="conhecimentos" value="ABAP"> ABAP </label>
		  							</div>
		  							<div class="col-xs-2">
		  								<label> <input type="checkbox" name="conhecimentos" value=".NET"> .NET </label>
		  							</div>
	  							</div>
	  						</div>
	  						
	  						
	  					</fieldset>	
	  				</div>
	  			</div>
	  			<div class="row" style="height: 20px;">	
	  				&nbsp;
	  			</div>
	  			<div class="row">
	  				<div class="col-xs-12 text-right">
	  					<button type="button" id="btnEnviar" class="btn btn-success" > <span class="glyphicon glyphicon-floppy-disk"></span> Enviar</button>
	  				</div>
	  			</div>
	  			
	  		</form>
		  </div>
		</div>
  		
	</div>
	<script src="<c:url value='/assets/js/jquery-2.1.4.min.js'/>"></script>
	<script src="<c:url value='/assets/js/bootstrap.min.js'/>"></script>
	<script>
		$(function(){
			$("#btnEnviar").click(function(){
				$.ajax({
						url: "salvar", 
						success: function(result){
								console.log('ok ' + result)
			    				},
			    		context: document.body,
			    		method: 'POST',
			    		data: $("form").serialize()
				});
			});
		});
	</script>
</body>
</html>