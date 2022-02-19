<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles/style1.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Akaya+Telivigala&display=swap" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${msg}</h1>
<h2>ADMIN LOGIN</h2>
<form:form action="validate" modelAttribute="admin">
				<table>
				<tr>
					<td>Admin Email :</td>
					<td><form:input path="emailId"/></td>
				</tr>

				<tr>
					<td>Password :</td>
					<td><form:password path="password"/></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Login"></td>
					<td><input type="reset" value="Clear"></td>
				</tr>
			</table>
		</form:form>


</body>
</html>