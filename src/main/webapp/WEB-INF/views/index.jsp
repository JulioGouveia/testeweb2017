<%@include file="/WEB-INF/views/headerTemplate.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

	<div class="container">
	<fieldset>
	<legend>Mercadorias Cadastradas</legend>
		<table class="table table-bordered table-striped table-hover">
			<tr>
				<td>Código Mercadoria</td>
				<td>Tipo da Mercadoria</td>
				<td>Nome da Mercadoria</td>
				<td>Quantidade</td>
				<td>Preço</td>
				<td>Tipo do Negocio</td>
			</tr>

			<c:forEach items="${listaMercadorias }" var="listaItens">
				<tr>
					<td>${listaItens.cod_mercadoria }</td>
					<td>${listaItens.tipo_mercadoria }</td>
					<td>${listaItens.nome_mercadoria}</td>
					<td>${listaItens.quantidade}</td>
					<td>${listaItens.preco}</td>
					<td>${listaItens.tipo_negocio}</td>
					<td>
						<form action="${s:mvcUrl('MC#delete').arg(0, listaItens.cod_mercadoria).build() }" method="POST">
							<button type="submit" class="btn btn-xs btn-inverse"> excluir </button>
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
	</fieldset>
</div>
</body>
</html>