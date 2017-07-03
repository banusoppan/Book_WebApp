
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>email</th>
			<th>password</th>
		</tr>
			<tr>
				<td><c:out value="${user.id }"/></td>
				<td><c:out value="${user.name}"/></td>
				<td><c:out value="${user.email}"/></td>
				<td><c:out value="${user.password}"/></td>
			</tr>
			</table>

</body>
</html>