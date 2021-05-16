<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Postal Registration</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<style>
.error {
color: #fa0228;
font-style: italic;
}
</style>
</head>
<body>
<h1 style="color: green" align="center"><b>INDIA POSTAL</b></h1>
<script type="text/javascript" src="https://www.google.com/recaptcha/api.js" async="false" defer="defer"></script>
<form:form action="create" method="post" modelAttribute="postal">
	<form:hidden path="id"/>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="fname">FirstName</label>
      <form:input path="fname" class="form-control" placeholder="Enter firstname"/>
      <form:errors path="fname" cssClass="error"/>
    </div>
    <div class="form-group col-md-6">
      <label for="lname">LastName</label>
      <form:input path="lname" class="form-control" placeholder="Enter Lastname"/>
      <form:errors path="lname" cssClass="error"/>
    </div>
  </div>
  <div class="form-row">
  <div class="form-group col-md-6">
    <label for="inputAddress">FatherName</label>
    <form:input path="fatherName" class="form-control" placeholder="Enter fathername"/>
    <form:errors path="fatherName" cssClass="error"/>
  </div>
  <div class="form-group col-md-6">
      <label for="inputZip">Email</label>
      <form:input path="email" type="email" class="form-control" placeholder="Enter Email"/>
      <form:errors path="email" cssClass="error"/>
    </div>
  </div>
  <div class="form-row">
  <div class="form-group col-md-6">
    <label for="inputAddress">DOB</label>
    <form:input path="dob" type="date" class="form-control"/>
    <form:errors path="dob" cssClass="error"/>
  </div>
  <div class="form-group col-md-6">
    <label for="inputAddress2">Address</label>
    <form:input path="addrs" class="form-control" placeholder="Enter Address"/>
    <form:errors path="addrs" cssClass="error"/>
  </div>
  </div>
  <div class="form-row"> 
    <div class="form-group col-md-6">
      <label for="inputCity">Country</label>
      <form:input path="country" class="form-control" placeholder="Enter CountryName"/>
      <form:errors path="country" cssClass="error"/>
    </div>
    <div class="form-group col-md-6">
      <label for="inputCity">City</label>
      <form:input path="city" class="form-control" placeholder="Enter City"/>
      <form:errors path="city" cssClass="error"/>
    </div>
  </div>
  <div class="form-row">
    <div class="form-group col-md-4">
      <label for="inputState">State</label>
      <form:input path="state" class="form-control" placeholder="Enter State"/>
      <form:errors path="state" cssClass="error"/>
    </div>
    <div class="form-group col-md-4">
      <label for="inputZip">Zip</label>
      <form:input path="pincode" class="form-control" placeholder="Enter Pincode"/>
      <form:errors path="pincode" cssClass="error"/>
    </div>
    <div class="form-group col-md-4">
      <label for="inputZip">Mobile</label>
     <form:input path="mob" type="tel" class="form-control" placeholder="Enter MobileNo"/>
     <form:errors path="mob" cssClass="error"/>
    </div>
  </div>
  <div class="g-recaptcha m3 row justify-content-center" data-sitekey="6LfovtUZAAAAAAlYRfO3LkasXlM297NzE_ycr9Yy"></div>
 	<div align="center">
  <button type="submit" class="btn btn-primary">Register</button>
  </div>
</form:form>
</body>
</html>