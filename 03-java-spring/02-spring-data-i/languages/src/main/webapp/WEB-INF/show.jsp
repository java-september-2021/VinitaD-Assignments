<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href= "/language">Dashboard</a>
<p><c:out value="${lang.name}"/></p>
<p><c:out value="${lang.version}"/></p>
<p><c:out value="${lang.creator}"/></p>
<p><a href ='/language/<c:out value="${lang.id}"/>/edit'>Edit</a></p>
<p>
	<form action='/language/<c:out value="${lang.id}"/>/delete' method="post">
    	<input type="hidden" name="_method" value="delete">
    	<input type="submit" value="Delete">
	</form>
</body>
</html>