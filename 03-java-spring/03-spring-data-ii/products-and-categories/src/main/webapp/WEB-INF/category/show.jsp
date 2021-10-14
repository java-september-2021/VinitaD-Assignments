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
<h1><c:out value="${category.name}"/></h1>
<h2>List Of Products in this category</h2>
<ul>
	<c:forEach items="${category.products}" var="p">
	   <li><c:out value="${p.name}"/></li>
	</c:forEach>
</ul>
<hr>
<h3>Add More products to this Category</h3>
<form action="/catProduct/${category.id}" method="POST">
	<div class = "form-group row">
		<label for="product">Add Product</label>     
		<select name="product">
		  	<c:forEach items="${ notInProduct }" var="p">
		      	<option value=${ p.id }>${ p.name }</option>
		  	</c:forEach>
		</select>
	</div>
	<input type="submit" value="Submit"/>
</form>  
	    
   
</div>
</body>
</html>
    