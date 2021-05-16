<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<form:form action="save" method="post" modelAttribute="mongo">
<tr>
<form:label path="id">Id:</form:label>
<form:input path="id"/>
</tr>
<tr>
<form:label path="name">Name:</form:label>
<form:input path="name"/>
</tr>
<br>
<tr>
<form:label path="address">Address:</form:label>
<form:input path="address"/>
</tr>
<br>
<tr>
<form:label path="contact">Contact:</form:label>
<form:input path="contact"/>
</tr>
<tr>
<td colspan="1">
<input type="submit" value="register">
</tr>
</form:form>
</table>
</body>
</html>