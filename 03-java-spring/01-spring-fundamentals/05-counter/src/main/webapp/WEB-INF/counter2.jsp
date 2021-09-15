<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counter by Two</title>
</head>
<body>
<p>You have visited <c:out value="${count}"/> times</p>
<a href = "/reset">Reset</a>
</body>
</html>