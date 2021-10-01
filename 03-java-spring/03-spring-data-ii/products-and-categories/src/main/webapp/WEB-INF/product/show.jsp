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
<h1><c:out value="${product.name}"/></h1>
<hr>
<p>List of Category that is assigned to product</p>
<ul>
	<c:forEach items="${product.categories}" var="p">
	   <li><c:out value="${p.name}"/></li>
	</c:forEach>
</ul>
<hr>

<p>I need a list of category that is not assigned to product</p>
<ul>
	<c:forEach items="${notInCategory}" var="p">
	   <li><c:out value="${p.name}"/></li>
	</c:forEach>
</ul>
<hr>
<p>I need a form to add category to product, for that i need a model atttribute, I can name it prodCat and then i will make a post mapping to add and save </p>
<p>Tried doing mvc form but coulnot, so doing in normal html form</p>
<form action="/prodCat/${product.id}" method="POST">
<div class = "form-group row">
    
       <%--  <form:label path="category">Add Category to Product</form:label>  
        <form:errors path="category"/>
        <form:select class="form-control" path="category">
        <c:forEach items="${ notInCategory }" var="c">
        	<option value=${ c.id }>${ c.name }</option>
        </c:forEach>
        </form:select> --%>
        <label for="category">Add Category to Product:</label>

<select name="category">
  <c:forEach items="${ notInCategory }" var="c">
      <option value=${ c.id }>${ c.name }</option>
  </c:forEach>
</select>
   
 </div>
    
   <input type="submit" value="Submit"/>
</form>  

</div>

</body>
</html>