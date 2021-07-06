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
<form action="./searchEmp">
	Enter Employee ID to be searched for <input type="text" name="empId"><br><br>
	<input type="submit" value="Search">
</form>
-->
<spring:form action="./searchEmp">
	Select Employee ID : <spring:select path="eId">
	<spring:option value="">Select Employee ID</spring:option>
	<spring:options items="${empIds }"/>
	</spring:select>
	<input type="submit" value="Search">
</spring:form>
<br><br>
<a href="./">Go to Main Page</a>
</body>
</html>