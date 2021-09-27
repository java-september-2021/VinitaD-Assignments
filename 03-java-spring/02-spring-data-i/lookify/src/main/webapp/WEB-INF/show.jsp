<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%-- <!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href= "/dashboard">Dashboard</a>
<p>Title <c:out value="${song.title}"/></p>
<p>Artist <c:out value="${song.artist}"/></p>
<p>Rating(1-10) <c:out value="${song.rating}"/></p>
<form action= "/delete/${song.id}" method = "POST">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>

</body>
</html>