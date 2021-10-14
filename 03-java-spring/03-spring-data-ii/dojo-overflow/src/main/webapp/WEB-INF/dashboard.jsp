<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div class = "container">
<P><c:out value="${user.firstName}"/></P>
<a href= "/logout">LogOut</a>
<h1>Questions Dashboard</h1>
<table class = "table table-striped table-dark table-bordered">
    <thead>
        <tr>
            <th>Question</th>
            <th>Tags</th>
            
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${questions}" var="q">
        <tr>
            <td><a href="/question/${q.id}"><c:out value="${q.title}"/></a></td>
            <td>
            	<c:forEach items="${q.allTag}" var="tag">
            		<c:out value="${tag.subject}"/>
            	</c:forEach>
            </td>
            
        </tr>
        </c:forEach>
    </tbody>
</table>
<p><a href="question/new">Create a new Question</a>


</div>
</body>
</html>