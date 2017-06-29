<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:url value="/resources/css/" var="context" />
<link rel="stylesheet" href="${context }estilo.css">
<link rel="stylesheet" href="${context }bootstrap.css">
<link rel="stylesheet" href="${context }bootstrap-theme.css">

<title>TesteWeb2017</title>
</head>
<body>
	<nav class="navbar navbar-default navbar-static-top">
	<div class="container">
		<ul class="nav navbar-nav">
			<li><a href='<c:url value="/"/>'>Mercadorias</a></li>
			<li><a href='<c:url value="/cadastrar/"/>'>Cadastrar Mercadoria</a></li>
		</ul>
	</div>
	</nav>