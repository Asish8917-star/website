<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>particular books details</title>
</head>
<body style="background: url('https://cdn3.vectorstock.com/i/1000x1000/94/42/magic-book-background-vector-17029442.jpg');background-position: center;background-repeat: no-repeat;background-size: cover;">
<div align="center" style="color: #006600">
<c:forEach var="aa" items="${name}">	
		<h3>Id				:${aa.id}</h3>
		<h3>Book name 	 	:${aa.bookName}</h3>
		<h3>Author name	 	:${aa.authorName}</h3>
		<h3>Book Status 	:${aa.status}</h3>
		<h3>Book Price 	 	:${aa.price}</h3>
		<h3>Isbn no 		:${aa.isbn}</h3>
</c:forEach>
<a href="get"><button class="btn btn-primary">Go Home</button></a>
</div>
</body>
</html>