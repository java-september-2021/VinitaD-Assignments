<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class = "container"> 
<a href= "/product/new">Add a new Product</a>
<h1>New Category</h1>

<form:form action="/category/new" method="post" modelAttribute="category">
<div class = "form-group row">
    <p>
        <form:label path="name">Title</form:label>
        <form:errors path="name"/>
        <form:input path="name" class="form-control"/>
    </p>
 </div>
 
    <input type="submit" value="Submit"/>
</form:form>  
</div>   
<div>
<h2>All Categories</h2>
<hr>
	<ul>
		<c:forEach items="${allCategory}" var="p">
		<li><a href ="/category/<c:out value="${p.id}"/>"><c:out value="${p.name}"/></a></li>
		</c:forEach>
	</ul>
		
	</div>  

</body>
</html>