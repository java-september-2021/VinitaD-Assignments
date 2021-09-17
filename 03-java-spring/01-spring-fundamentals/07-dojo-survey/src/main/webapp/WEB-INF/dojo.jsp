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
<h1>Submitted Info:</h1>
<p>Name: <c:out value="${result.name}"/></p>
<p>Dojo Location: <c:out value="${result.location}"/></p>
<p>Favorite Language: <c:out value="${result.language}"/>
<c:if test = '${result.language.equals("Java")}'>
<p><a href='/java'>click to another page</a></p>
</c:if>
<p>Comment(If any): <c:out value="${result.comment}"/></p>
<a href = "/">Go Back</a>



</body>
</html>