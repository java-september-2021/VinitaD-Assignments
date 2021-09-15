<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link rel="stylesheet" type="text/css" href="css/style.css">

<title>Insert title here</title>
</head>
<body>
<p class = "red"><c:out value="${ error }" /></p>
<form action = "/attempt" method = "POST">
<label for= "code">What is the code?</label>
<input type = text name ="code">
<button>Try Code</button>
<p></p>
</form>
</body>
</html>