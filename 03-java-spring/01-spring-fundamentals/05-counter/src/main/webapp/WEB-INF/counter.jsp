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
<p>You have visited <a href="/">Home page </a><c:out value="${count}"/> times</p>
<a href = "/flush">Test Another Visit?</a>
</body>
</html>