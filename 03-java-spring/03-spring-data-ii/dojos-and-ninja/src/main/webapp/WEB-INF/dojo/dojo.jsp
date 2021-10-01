<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

</head>
<body>
<div class = "container">
<p class= "nav"><a href ="/ninja">Create Ninja</a></p>
<h1>Add a Location</h1>
<form:form method="POST" action="/dojo/new" modelAttribute="dojo">
<div class="form-group row">
	<form:label path="name">Location</form:label>
	<form:errors path="name"/>
	<form:input type="text" class="form-control" path="name"/>
</div>

	<p><button>Create Location</button></p>
</form:form>
<c:forEach var="loco" items="${locations}">
        <a href= "/dojo/show/<c:out value="${loco.id}"></c:out>"><c:out value="${loco.name}"></c:out></a>
 </c:forEach>

</div>

</body>
</html>