<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Employee Details</h1>
<spring:form action="./insertEmp" modelAttribute="emp">
	Enter Employee ID : <spring:input path="eId"/><br><br>
	Enter Employee Name : <spring:input path="eName"/><br><br>
	Enter Employee Designation : <spring:input path="desig"/><br><br>
	Enter Employee Department : <spring:radiobuttons path="deptt" items="${departments}"/><br><br>
	Enter Employee Salary : <spring:input path="salary"/><br><br>
	<input type="submit" value="Save">
</spring:form>
<br><br>
<a href="./">Go to Main Page</a>
</body>
</html>