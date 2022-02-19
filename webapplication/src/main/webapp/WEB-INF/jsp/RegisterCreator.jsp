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

    <form:form action="addCreator" modelAttribute="creator" enctype="multipart/form-data">
    <table>
    <tr>
        <td>First Name :</td>
        <td><form:input path="creatorName"/></td>
    </tr><tr>
        <td>Password :</td>
        <td><form:password path="password"/></td>
    </tr><tr>
        <td>Email Id :</td>
        <td><form:input path="emailId"/></td>
    </tr><tr>
    <tr>
        <td>Creator Age :</td>
        <td><form:input path="creatorAge"/></td>
    </tr><tr>
        <td>Photo :</td>
        <td><input type="file" name="pic"/></td>
    <tr>
		<td><input type="submit" value="Register"></td>
		<td><input type="reset" value="Clear"></td>
	</tr>
    
    </table>
    </form:form>
    
    <a href="adminhome">HomePage</a>
</div>

</body>
</html>