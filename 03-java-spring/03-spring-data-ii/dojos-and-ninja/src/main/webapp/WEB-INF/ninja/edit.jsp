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
<title>Edit Ninja</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
<div class = "container">
<p><a href ="/dojo">DashBoard</a></p>
<h1>Edit Ninja</h1>
<p><a href ="/dojo">DashBoard</a></p>
<form action = "/ninja/delete/${ninja.id}" method = "POST">
     <button>Delete</button>
 </form>
<form:form method="POST" action="/ninja/edit/${ninja.id}" modelAttribute="ninja">
<div class="form-group row">
	<form:label path="firstName">First Name</form:label>
	<form:errors path="firstName"/>
	<form:input type="text" class="form-control" path="firstName"/>
</div>
<div class="form-group row">
	<form:label path="lastName">Last Name</form:label>
	<form:errors path="lastName"/>
	<form:input type="text" class="form-control" path="lastName"/>
</div>
<div class="form-group row">
	<form:label path="age">Age</form:label>
	<form:errors path="age"/>
	<form:input type="number" class="form-control" path="age"/>
</div>
<div class = "form-group row">
	<form:label path="dojo">Location</form:label>
	<form:errors path="dojo"/>
	<form:select type="text" class="form-control" path="dojo">
		<c:forEach items="${ allDojo }" var="dojo">
    		<form:option value="${ dojo.id }">${ dojo.name }</form:option>
    	</c:forEach>
    </form:select>
</div>

	<p><button>Update Ninja</button></p>
</form:form>
</div>

</body>
</html>