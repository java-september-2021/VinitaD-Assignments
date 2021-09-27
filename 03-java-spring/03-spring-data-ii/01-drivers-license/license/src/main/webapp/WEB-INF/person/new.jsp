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
<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"> -->
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">

</head>
<body>
<div class = "conatiner">
<h1>Hello world!!!!!!!!!!!</h1>
<p><a href = "/license">Create a New License</a></p>
<table class="table table-striped table-dark">
<thead>
	<tr>
		<th>Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Action</th>
		
	</tr>
</thead>
<tbody>
	<c:forEach items="${allperson}" var="per">
	<tr>
		<td>${per.id}</td>
		<td>${per.firstName}</td>
		<td>${per.lastName}</td>
		<td>
		<a href ="/person/edit/${per.id}">Edit</a>
		<a href = "/person/show/${per.id}">Details</a>
		<form action = "/person/delete/${per.id}" method = "POST">
			<p><button>Delete</button></p>
		</form>
		</td>
	</tr>
	</c:forEach>
</tbody>
</table>
<form:form method="POST" action="/person/new" modelAttribute="person">
<div class="form-group">
	<form:label path="firstName">First Name</form:label>
	<form:errors path="firstName"/>
	<form:input type="text" class="form-control" path="firstName"/>
</div>
<div class="form-group">
	<form:label path="lastName">Last Name</form:label>
	<form:errors path="lastName"/>
	<form:input type="text" class="form-control" path="lastName"/>
</div>	
	<p><button>Create Person</button></p>
</form:form>
</div>
</body>
</html>
		
	