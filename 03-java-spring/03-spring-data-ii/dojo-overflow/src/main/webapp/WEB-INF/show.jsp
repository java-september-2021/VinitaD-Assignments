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
<title>Answer Page</title>
</head>
<body>
<h1><c:out value="${question.title}"></c:out></h1>
<p> Tag: <c:forEach items = "${question.allTag}" var = "tag">
<c:out value="${tag.subject}"></c:out>
</c:forEach>
</p>
<ul>
<c:forEach items= "${question.answers}" var = "ans">
<li><c:out value="${ans.title}"></c:out></li>
</c:forEach>
</ul>
<form:form method="POST" action="/answer/${question.id}" modelAttribute="answer">
<div class="form-group row">
	<form:label path="title">Question</form:label>
	<form:errors path="title"/>
	<form:input type="text" class="form-control" path="title"/>
</div>


<p><button class="btn btn-success">Submit A Answer</button></p>
</form:form>
</body>
</html>