<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<spring:form action="./loginCheck">
	Enter User Name : <spring:input path="username"/><br><br>
	Enter Password : <spring:password path="password"/><br><br>
	<input type="submit" value="Login">
</spring:form>
<!--  
<form action="./loginCheck" method="post">
	Enter UserName : <input type="text" name="uname"><br><br>
	Enter password: <input type="password" name="pwd"><br><br>
	<input type="submit" value="Login">
</form>
-->
</body>
</html>