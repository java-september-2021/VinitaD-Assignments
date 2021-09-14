<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/main.js"></script>

<title>This is a Date Template</title>
</head>
<body>
<script>dateSelect()</script>
<P class= "date"><fmt:formatDate pattern = "yyyy-MM-dd" value = "${date}" /></P>
</body>
</html>