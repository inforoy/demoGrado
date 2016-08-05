<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Acceso Denegado</title>

<spring:url value="/resources/core/css/hello.css" var="coreCss" />
<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
<spring:url value="/resources/core/ext-4.2.1/resources/css/ext-all.css" var="extAllCss" />

<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
<link href="${extAllCss}" rel="stylesheet" />
</head>

<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">CredyUnion</a>
		</div>
	</div>
</nav>

<div class="jumbotron">
	<div class="container">
	<br/>
	<p>
	Querido <strong>${user}</strong>, no tiene autorizaciOn para acceder a esta pAgina
	</p>
	
	<p>
	<a class="btn btn-primary btn-lg" role="button" href="<c:url value="/logout" />">Logout</a>
	</p>
	
	</div>
</div>

<spring:url value="/resources/core/js/hello.js" var="coreJs" />
<spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapJs" />
<spring:url value="/resources/core/ext-4.2.1/ext-all.js" var="extAllJs" />

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="${extAllJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

</body>
</html>