<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<script>
  function startDictation() {

    if (window.hasOwnProperty('webkitSpeechRecognition')) {

      var recognition = new webkitSpeechRecognition();

      recognition.continuous = false;
      recognition.interimResults = false;

      recognition.lang = "en-US";
      recognition.start();

      recognition.onresult = function(e) {
        document.getElementById('transcript').value
                                 = e.results[0][0].transcript;
        recognition.stop();
        document.getElementById('labnol').submit();
      };

      recognition.onerror = function(e) {
        recognition.stop();
      }

    }
  }
</script>
<style>
  .speech {border: 1px solid #DDD; width: 300px; padding: 0; margin: 0}
  .speech input {border: 0; width: 240px; display: inline-block; height: 30px;}
  .speech img {float: right; width: 40px }
</style>

</head>
<body style="background: url('https://images.unsplash.com/photo-1562813733-b31f71025d54?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80');background-position: center;background-size: cover;">


<div align="center">
<h1 style="color: #ffcc99">Online Book Store</h1><br>
<form id="labnol" method="get" action="/name" modelAttribute="name">
  <div class="speech">
    <input type="text" name="name" id="transcript" placeholder="Speak" />
    <img onclick="startDictation()" src="https://lh3.googleusercontent.com/proxy/lUmB0W2ZPvF0nipi-bIbxWi51wB_diGjoK-IwYzUaHXQ2jPxrJSDqNnLy8Olo8YtEBxMrxFPzQ-6QTiyuB1Muvu1YmxL-FXinqMcmVnQ-FDZKA" height="30" width="20" />
  </div>
</form>
<br><br>
<a href="create"><button>Add Books</button></a><br><br>
<table border="1">
<tr style="color:#40ff00 ">
	<th>ID</th>
	<th>BOOK NAME</th>
	<th>AUTHOR NAME</th>
	<th>STATUS</th>
	<th>PRICE</th>
	<th>ISBN</th>
	<th>ACTION</th>
</tr>
<c:forEach var="asish" items="${blist}">
	<tr style="color: #1affff">
		<td>${asish.id}</td>
		<td>${asish.bookName}</td>
		<td>${asish.authorName}</td>
		<td>${asish.status}</td>
		<td>${asish.price}</td>
		<td>${asish.isbn}</td>
		<td><a href="update?id=${asish.id}"><button type="button" class="btn btn-warning">Edit</button>&nbsp;</a><a href="delete?id=${asish.id}"><button type="button" class="btn btn-danger">Delete</button></a></td>
	</tr>
</c:forEach>
</table>
</div>
</body>
</html>