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
<title>New Question</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class= "container">
<p>${errors}</p>
<form:form method="POST" action="/question/new" modelAttribute="question">
<div class="form-group row">
	<form:label path="title">Question</form:label>
	<form:errors path="title"/>
	<form:input type="text" class="form-control" path="title"/>
</div>
<div class="form-group row">
	<form:label path="tagFromForm">tag</form:label>
	<form:errors path="tagFromForm"/>
	<form:input type="text" class="form-control" path="tagFromForm"/>
</div>

<p><button class="btn btn-success">Submit A Question</button></p>
</form:form>



</div>

</body>
</html>