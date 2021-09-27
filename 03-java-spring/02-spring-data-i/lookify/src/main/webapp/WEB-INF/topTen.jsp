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
<title>Insert title here</title>
</head>
<body>
<a href= "/dashboard">Dashboard</a>
<table>
	<thead>
		<tr>
			<th>Rating</th>
			<th>Title</th>
			<th>Artist</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${ songs }" var="song">
		<tr>
			<td>${ song.rating }</td>
			<td><a href="/songs/${ song.id }">${ song.title }</a></td>
			<td>${ song.artist}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>