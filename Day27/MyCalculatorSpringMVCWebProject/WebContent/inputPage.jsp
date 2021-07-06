<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  
<form action="./performCalculator">
Enter First Number : <input type="text" name="no1"><br><br>
Enter Second Number : <input type="text" name="no2"><br><br>
<input type="submit" name="operation" value="Sum">
<input type="submit" name="operation" value="Subtract">
<input type="submit" name="operation" value="Multiply">
<input type="submit" name="operation" value="Divide">
</form>

-->
   
<spring:form action="./performCalculator">
Enter first number <spring:input path="number1"/><br><br>
Enter second number <spring:input path="number2"/><br><br>
<input type="submit" name="operation" value="Sum">
<input type="submit" name="operation" value="Subtract">
<input type="submit" name="operation" value="Multiply">
<input type="submit" name="operation" value="Divide">
</spring:form>



</body>
</html>