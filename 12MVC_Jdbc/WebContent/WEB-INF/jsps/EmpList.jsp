<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Capgemini India</h1>
	<h3>Employee List</h3>
	<table style="color:red" border="1"  >
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee Salary</th>
		</tr>

		<c:forEach items="${empList}" var="emp">
			<tr style="color:red">
				<td>${emp.empId}</td>
				<td>${emp.firstName}</td>
				<td>${emp.salary}</td>

			</tr>
		</c:forEach>

	</table>
</body>
</html>


