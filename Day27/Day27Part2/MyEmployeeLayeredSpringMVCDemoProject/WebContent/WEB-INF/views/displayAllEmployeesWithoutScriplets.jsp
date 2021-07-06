<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee details without Scriplets</h1>
	<table border="1">
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Department</th>
			<th>Employee Designation</th>
			<th>Employee Salary</th>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.eId }</td>
				<td>${employee.eName }</td>
				<td>${employee.deptt }</td>
				<td>${employee.desig }</td>
				<td>${employee.salary }</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<a href="./">Go to Main Page</a>
</body>
</html>