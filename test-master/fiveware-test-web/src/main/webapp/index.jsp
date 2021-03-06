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
  	<link rel="stylesheet" href="<c:url value='/assets/css/index.css'/>">
	
</head>
<body>
	<div class="container">
		<div id="painelCadastro" class="panel panel-primary">
		  <div class="panel-heading">
		    <h3 class="panel-title">Cadastro Test Master</h3>
		  </div>
		  <div class="panel-body">
		    <form action="salvar" method="post">
	  			<div class="row">
	  				<div class="col-xs-10">
	  					<div class="form-group">
		  					<label for="nome">Nome</label>
		    				<input type="text" class="form-control" id="nome" name="nome" data-msgErro="favor informe o nome." maxlength="100">
	    				</div>
	  				</div>
	  				<div class="col-xs-2">
	  					<div class="form-group">
		  					<label for="idade">Idade</label>
		    				<input type="text" class="form-control onlyNumber" id="idade" name="idade" data-msgErro="favor informe a idade" maxlength="2">
	    				</div>
	  				</div>
	  			</div>
	  			<div class="row">
			  		<div class="col-xs-6">
			  			<div class="form-group">
				  			<label for="estadoCivil">Estado Civil</label>
				  			<select  id="estadoCivil" name="estadoCivil" data-msgErro="favor selecione o estado Civil.">
				  				<option value="">SELECIONE...</option>
				  				<option value="S">Solteiro</option>
				  				<option value="C">Casado</option>
				  				<option value="D">Divorciado</option>
				  				<option value="V">Viúvo</option>
				  				
				  			</select>
				  			
			    		</div>
			  		</div>
			  		<div class="col-xs-3">
			  			<div class="form-group">
				  			<label for="temFilhos">Tem Filhos</label>
				  			<div class="checkbox">
				    		<label>Sim <input type="radio" name="temFilhos" value="1"> </label>
				    		<label>Não <input type="radio" name="temFilhos" value="0" checked="checked"> </label>
				    		</div>
			    		</div>
			  		</div>
			  		<div class="col-xs-2">
	  					<div class="form-group">
		  					<label for="qdtFilhos">Quantos Filhos</label>
		    				<input type="text" class="form-control onlyNumber" id="qdtFilhos" name="qtdFilhos" maxlength="2" readonly value="0" data-msgErro="favor informe quantos filhos.">
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
		  							<input type="text" class="form-control" id="logradouro" name="logradouro" data-msgErro="favor informe o logradouro do endereço." maxlength="100">
		  						</div>
		  						<div class="col-xs-1">
		  							<label for="numero">Número</label>
		  							<input type="text" class="form-control onlyNumber" id="numero" name="numero" data-msgErro="favor informe o número do endereço" maxlength="10">
		  						</div>
		  						<div class="col-xs-2">
		  							<label for="cep">CEP</label>
		  							<input type="text" class="form-control" id="cep"  name="cep" data-msgErro="favor informe o CEP do endereço" >
		  						</div>
		  						<div class="col-xs-3">
		  							<label for="bairro">Bairro</label>
		  							<input type="text" class="form-control" id="bairro" name="bairro" data-msgErro="favor informe o nome do bairro do endereço." maxlength="50">
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
  		<!-- Modal inicio -->
  		<div class="modal fade" id="msgModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		        <h4 class="modal-title" id="myModalLabel">Atenção!</h4>
		      </div>
		      <div class="modal-body">
		       <p id="msgInfoErro" ></p> 
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
		      </div>
		    </div>
		  </div>
		</div>
  		<!-- Modal fim -->
  		<div id="mensagemSucesso" class="jumbotron">
		  <h1>Parabens! <br/><small>Seu cadastro de dados pessoais foi salvo com sucesso!</small></h1>
		</div>
	</div>
	<script src="<c:url value='/assets/js/jquery-2.1.4.min.js'/>"></script>
	<script src="<c:url value='/assets/js/bootstrap.min.js'/>"></script>
	<script src="<c:url value='/assets/js/jquery.maskedinput.js'/>"></script>
	<script>
		$(function(){
			
			
			
			$("#mensagemSucesso").hide();
			
			$("#cep").mask("99999-999");
			
			$('.onlyNumber').keypress(function(event) {
		        var key = (window.event) ? event.keyCode : event.which;
		        if ((key > 47 && key < 58)) return true;
		        else {
		            if (key != 8) return false;
		            else return true;
		        }
		    });
			
			$("form :radio").click( function(){
				if ($('input[name="temFilhos"]:checked').val() == 1 ){
					$("#qdtFilhos").val("");
					$("#qdtFilhos").prop('readonly', false);
				}else{
					$("#qdtFilhos").val(0);
					$("#qdtFilhos").prop('readonly', true);
				}
			});
			
			
			
			$("#btnEnviar").click(function(){
				
				var estaCompleto = true;
				$.each($('input[type="text"], select') , function(index, value){
				      console.log(index);
				      if ( $(value).val() == '' ){
				    	  $("#msgInfoErro").html($(value).data().msgerro);
				    	  $('#msgModal').modal("show");
				    	  estaCompleto = false;
				    	  return false;
				      }
				      
				});
				
				if (estaCompleto && $('input[name="conhecimentos"]:checked').length == 0 ){
					$("#msgInfoErro").html('Selecione pelo menos um conhecimento.');
					$('#msgModal').modal("show");
					estaCompleto = false;
				}
				
				if(estaCompleto){
					$.ajax({
						url: "salvar", 
						success: function(result){
							$("#mensagemSucesso").show();
							$("#painelCadastro").hide();
			    		},
			    		context: document.body,
			    		method: 'POST',
			    		data: $("form").serialize()
					});
				}
				
				
			});
		});
	</script>
</body>
</html>
