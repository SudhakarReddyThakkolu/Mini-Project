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
<div>

    <form:form action="addAdmin" modelAttribute="admin">
    <table>
    <tr>
        <td>First Name :</td>
        <td><form:input path="firstName"/></td>
    </tr><tr>
        <td>Last Name :</td>
        <td><form:input path="lastName"/></td>
    </tr><tr>
        <td>Password :</td>
        <td><form:password path="password"/></td>
    </tr><tr>
        <td>Confirm Password :</td>
        <td><form:password path="confirmPassword"/></td>
    </tr><tr>
        <td>Email Id :</td>
        <td><form:input path="emailId"/></td>
    </tr>
    <tr>
        <td>Mobile  :</td>
        <td><form:input path="mobileNum"/></td>
    </tr>
    <tr>
		<td><input type="submit" value="Register"></td>
		<td><input type="reset" value="Clear"></td>
	</tr>
    
    </table>
    </form:form>
</div>
</body>
</html>