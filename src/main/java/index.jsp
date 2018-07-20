<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix = "spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "c"  uri= "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<nav class= "navbar navbar-inverse">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Spring Boot</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="#about">About</a></li>
			</ul>
		</div>
	</div>
</nav>
<div class="container">
	<div class="starter-template">
		 <h3 class="well">Cadastro</h3>
 			<br/>
 			<form action="/colaborador-insert" method="post" role="form">
 			<input type="text" name="cpf" id="cpf" size="50" placeholder="Entre Com CPF" class="form-control"/>
 			<br/>
 			<input type="text" name="nome" id="nome" size="50" placeholder="Entre Com Nome" class="form-control"/>
 			<br/>
 			<input type="text" name="telefone" id="telefone" size="15" placeholder="Entre Com Telefone" class="form-control" />
 			<br/>
 			<input type="text" name="email" id="email" size="50" placeholder="Entre Com email" class="form-control" />
 			<br/>
 			<button id="btn1" type="submit" class="btn btnprimary">Enviar os Dados</button>
 			<br/><br/>
 			${msg}
 			</form>
 			<br/>
 			
 			<table class="table table-striped">
	 			<tr>
	 				<td><a href="/colaborador-list"><img src="https://www.sudac.com.br/blog/wp-content/uploads/2017/09/Governo-paulista-oferece-investimentos-para-instalar-empresa-no-Estado-02.jpg" width="70px" height="70px" /></a></td>
					<td style="padding:20px;color:#00f">WebService</td>
				</tr>
				<tr>
	 				<td><a href="/colaborador-list"><img src="https://img3.stockfresh.com/files/c/coramax/m/65/7483784_stock-photo-nerd.jpg" width="70px" height="70px" /></a></td>
					<td style="padding:20px;color:#00f">Listagem</td>
				</tr>
			</table>
	</div>
	<ul>
	<c:forEach items="${lista}" var="item">
	
	<li>${item.cpf} , ${item.nome} ,${item.telefone},${item.email}</li>
	</c:forEach>
	</ul>


</div>
<script type="text/javascript"
src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>
</html>