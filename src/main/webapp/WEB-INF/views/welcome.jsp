<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>CredyUnion</title>

<!-- Latest compiled and minified CSS -->
<!-- <link href="https://cdnjs.cloudflare.com/ajax/libs/extjs/4.2.1/resources/css/ext-all.css" rel="stylesheet" /> -->

<spring:url value="/static/core/css/ext-all.css" var="extAllCss" />
<link href="${extAllCss}" rel="stylesheet" />

</head>

<body>*</body>

<!-- Latest compiled and minified JavaScript -->
<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/extjs/4.2.1/ext-all.js"></script> -->
<spring:url value="/static/core/js/ext-all.js" var="extAllJs" />
<script src="${extAllJs}"></script>

<spring:url value="/static/app.js" var="appJs" />
<script src="${appJs}"></script>



</html>