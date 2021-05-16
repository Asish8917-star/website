<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Welcome To Mongodb</h1>
<a href="create">Create</a>
<table border="1">
<tr>
<th>ID</th>
<th>NAME</th>
<th>ADDRESS</th>
<th>CONTACT</th>
<th>ACTION</th>
</tr>
<c:forEach var="asish" items="${list}">
<tr>
<td>${asish.id}</td>
<td>${asish.name}</td>
<td>${asish.address}</td>
<td>${asish.contact}</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>