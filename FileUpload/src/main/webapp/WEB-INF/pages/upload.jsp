<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Spring Boot-File Upload</h1>

<form method="post" action="upload" enctype="multipart/form-data">
	<input type="file" name="file"/><br>
	<input type="submit" value="upload"> 
</form>
</body>
</html>