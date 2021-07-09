<%@page import="com.sujata.bean.Employee"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Details</h1>
	<% Collection<Employee>emps=(Collection<Employee>)request.getAttribute("employees");%>
	<table border="1">
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Department</th>
			<th>Employee Designation</th>
			<th>Employee Salary</th>
		</tr>
		<%for(Employee employee:emps){ %>
		<tr>
			<td><%out.println(employee.geteId()); %></td>
			<td><% out.println(employee.geteName()); %></td>
			<td><% out.println(employee.getDeptt()); %></td>
			<td><% out.println(employee.getDesig()); %></td>
			<td><% out.println(employee.getSalary()); %></td>
		</tr>
		<% } %>
	</table>
	
</body>
</html>