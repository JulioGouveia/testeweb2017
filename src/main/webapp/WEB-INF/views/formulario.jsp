<%@include file="/WEB-INF/views/headerTemplate.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div class="container">
		<form class="form-horizontal"
		action="<c:url value='/cadastrar' />" method="POST">
		<fieldset>

			<legend>Cadastre Sua Mercadoria</legend>
			
			<div class="form-group">
				<label class="col-md-4 control-label" for="TipoMercadoria">Tipo:</label>
				<div class="col-md-4">
					<input id="TipoMercadoria" name="tipo_mercadoria" type="text"
						placeholder="Tipo da Mercadoria" class="form-control input-md" required="required">

				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label" for="NameMercadoria">Nome:</label>
				<div class="col-md-4">
					<input id="NameMercadoria" name="nome_mercadoria" type="text"
						placeholder="Nome da Mercadoria" class="form-control input-md" required="required">

				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label" for="quantidade">Quantidade:</label>
				<div class="col-md-4">
					<input id="Quantidade" name="Quantidade" type="number"
						placeholder="Quantidade" class="form-control input-md" required="required">

				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label" for="preco">Preço:</label>
				<div class="col-md-4">
					<input id="Preco" name="Preco" type="number" placeholder="Preço"
						class="form-control input-md" required="required">

				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label" for="radios">Tipo
					Mercadoria:</label>
				<div class="col-md-4">
					<div class="radio">
						<label for="radios-0"> <input type="radio"
							name="tipo_negocio" id="radios-0" value="COMPRA"
							checked="checked"> Compra
						</label>
					</div>
					<div class="radio">
						<label for="radios-1"> <input type="radio"
							name="tipo_negocio" id="radios-1" value="VENDA"> Venda
						</label>
					</div>
				</div>
			</div>

			<!-- Button -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="button"></label>
				<div class="col-md-4">
					<button id="button" name="button" class="btn btn-inverse"
						>Confirma</button>
				</div>
			</div>

		</fieldset>
	</form>
</div>
</body>
</html>