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
<a href = "/songs/new">Add New</a>
<a href= "/search/topTen">Top Songs</a>
<%-- <form:form action="/search" method="post" modelAttribute="music">
    
    <p>
        <form:label path="artist">Pages</form:label>
        <form:errors path="artist"/>     
        <form:input type="text" path="artist"/>
    </p>    
    <input type="submit" value="Search Artists"/>
</form:form>  --%> 
<p>${errors}</p>
<form action ="/search">
	<input type="text" placeholder="Search" name="artist">
    <button type="submit">Search Artist</button>
</form>
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Rating</th>
            <th>Actions</th>
            
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${songs}" var="song">
        <tr>
            <td><a href="songs/${song.id}"><c:out value="${song.title}"/></a></td>
            <td><c:out value="${song.rating}"/></td>
            <td>
            <form action= "/delete/${song.id}" method = "POST">
            <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
            
            </form>
        </td>
           
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>