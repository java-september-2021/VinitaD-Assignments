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
<form action ="/process" method= "POST">
<label for="name">Name:</label>
<input type="text" name="name">
<label for="location">Location:</label>
<select name="location">
<c:forEach var="location" items="${locations}">
  <option value="${location}">${location}</option>
</c:forEach>
  
           
        
</select>
<label for="language">Language:</label>
<select name="language">
<c:forEach var="language" items="${languages}">
  <option value="${language}">${language}</option>
</c:forEach> 
</select>
<label for= "comment">Comment(optional):</label>
<textarea name="comment" rows="10" cols="30"></textarea>
<button>Submit</button>

</form>

</body>
</html>