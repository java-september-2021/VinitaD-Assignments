<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/style.css">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<p>Your Gold: <c:out value= "${totalGold}"/></p>
<div class= "building">
<form action= "/findgold" method="POST">
<h3>Farm</h3>
<input type = "hidden" name = "building" value = "farm">
<p>(earns 10-20 Gold)</p>
<button>Find Gold</button>
</form>
<form action= "/findgold" method="POST">
<h3>House</h3>
<input type = "hidden" name = "building" value = "house">
<p>(earns 2-5 Gold)</p>
<button>Find Gold</button>
</form>
<form action= "/findgold" method="POST">
<h3>Cave</h3>
<input type = "hidden" name = "building" value = "cave">
<p>(earns 5-10 Gold)</p>
<button>Find Gold</button>
</form>
<form action= "/findgold" method="POST">
<h3>Casino</h3>
<input type = "hidden" name = "building" value = "casino">
<p>(earns and takes 0-50 Gold)</p>
<button>Find Gold</button>
</form>

</div>
<h2>Activities</h2>
<div class="activities">
<c:forEach items="${messages}" var="act">
<c:choose>
<c:when test="${act.contains('ouch')}">
<p class="red">${act}</p>
</c:when>
<c:otherwise>
<p class="green">${act}</p>
</c:otherwise>
</c:choose>
</c:forEach>
</div>
</div>
</body>
</html>