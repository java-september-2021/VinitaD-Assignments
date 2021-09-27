<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%-- <%@ page isErrorPage="true" %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add A New Song</title>
</head>
<body>
<a href= "/dashboard">Dashboard</a>
<h1>Add a New Song!</h1>
<form:form action="/songs" method="POST" modelAttribute="music">
	<div class="form-group">
        <form:label path="title">Song Title</form:label>
        <form:errors path="title"/>
        <form:input class="form-control" path="title"/>
    </div>
    <div class="form-group">
        <form:label path="artist">Artist</form:label>
        <form:errors path="artist"/>
        <form:input class="form-control" path="artist"/>
    </div>
    <div class="form-group">
        <form:label path="rating">Rating(1-10)</form:label>
        <form:errors path="rating"/>
        <form:input type="number" class="form-control" path="rating"/>
    </div>
    <button>Add Song</button>
</form:form>
</body>
</html>