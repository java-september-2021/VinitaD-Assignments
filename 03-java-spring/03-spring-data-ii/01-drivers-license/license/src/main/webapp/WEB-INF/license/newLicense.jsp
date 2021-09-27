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
<title>New License</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>

<div class = "container">
<h1>New License</h1>
<a href = "/person">Add a new Person!</a>
<form:form method="POST" action="/license/new" modelAttribute="license">
<div class = "form-group">
	<form:label path="person">Person</form:label>
	<form:errors path="person"/>
	<form:select type="text" class="form-control" path="person">
		<c:forEach items="${ allPerson }" var="p">
    		<form:option value="${ p.id }">${ p.firstName } ${ p.lastName }</form:option>
    	</c:forEach>
    </form:select>
</div>
<div class = "form-group">
	<form:label path="state">State</form:label>
	<form:errors path="state"/>
	<form:input type="text" class="form-control" path="state"/>
</div>
<div class = "form-group">
	<form:label path="expiration_date">Expiration Date</form:label>
	<form:errors path="expiration_date"/>
	<form:input type="date" class="form-control" path="expiration_date"/>
</div>	
	<p><button>Create License</button>
</form:form>
</div>
</body>
</html>