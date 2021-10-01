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
<a href="/logout">LogOut</a>
<p>Welcome <c:out value="${user.firstName}"></c:out>
<a href = "/category/new">Add a Category</a> 
<h1>New Product</h1>
	<div class ="col">
		<div>
			<form:form action="/product/new" method="post" modelAttribute="product">
				<div class = "form-group row">
				    <p>
				        <form:label path="name">Title</form:label>
				        <form:errors path="name"/>
				        <form:input path="name" class="form-control"/>
				    </p>
				 </div>
				 <div class = "form-group row">
				    <p>
				        <form:label path="description">Description</form:label>
				        <form:errors path="description"/>
				        <form:textarea path="description"  class="form-control"/>
				    </p>
				 </div>
				 <div class = "form-group row">
				    <p>
				        <form:label path="price">Price</form:label>
				        <form:errors path="price"/>
				        <form:input path="price"  class="form-control"/>
				    </p>
				 </div>      
			    <input type="submit" value="Submit"/>
			</form:form>  
		</div> 
		<div>
		<h2>All Products</h2>
		<hr>
			<ul>
			<c:forEach items="${allProduct}" var="p">
			    <li><a href ="/products/<c:out value="${p.id}"/>"><c:out value="${p.name}"/></a>
			    <p>In Number of Categories:<c:out value="${p.categories.size()}"/></p>
			    <p>Either Like or Dislike
			    <c:choose>
			    <c:when test="${p.userLiked.contains(user)}">
			    <a href="/dislike/<c:out value="${p.id}"/>">DisLike</a>
			    </c:when>
			    <c:otherwise>
			    <a href="/like/<c:out value="${p.id}"/>">Like</a>
			    </c:otherwise>
			    </c:choose>
			    </p>
			    <p>Number of likes: <c:out value="${p.userLiked.size()}"/></p>
			    </li>
			</c:forEach>
			</ul>
		</div>  
	</div>
	
</div>
</body>
</html>
	
        
            
        