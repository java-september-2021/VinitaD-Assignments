<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
<div class = "container">
<h1>Please Edit A Person</h1>
<form:form method="POST" action="/person/edit/${person.id}" modelAttribute="person">
<div class = "form-group">
	<form:label path="firstName">First Name</form:label>
	<form:errors path="firstName"/>
	<form:input type="text" class = "form-control" path="firstName"/>
</div>
<div class = "form-group">
	<form:label path="lastName">Last Name</form:label>
	<form:errors path="lastName"/>
	<form:input type="text" class = "form-control" path="lastName"/>
</div>
	<p><button>Edit Person</button>
</form:form>
</div>
</body>
</html>