<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Person Details!!</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
<div class= "container">
<h1>Person Info</h1>
<p>Expiration Date: <span class= "date"><fmt:formatDate pattern ="MM/dd/yyyy" value = "${person.license.expiration_date}" /></span></P>
<p>Name: <c:out value = "${person.firstName}"/> <c:out value = "${person.lastName}"/></p>
<p>License Number: <c:out value = "${person.license.licenseNumber}"/></p>
<p>State: <c:out value = "${person.license.state}"/></p>
</div>
</body>
</html>



