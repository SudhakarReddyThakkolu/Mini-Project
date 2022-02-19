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

    <form:form action="addition" modelAttribute="contents" enctype="multipart/form-data">
    <table>
    <tr>
        <td>Thumbnail :</td>
        <td><input type="file" name="pic"/></td>
    <tr>
    <tr>
        <td>SourceFile :</td>
        <td><input type="file" name="source"/></td>
    <tr>
    <tr>
    </tr>
    <tr>
        
        <td><input type="radio" name="the" value="true"/>
            <input type="radio" name="the" value="true" checked></td>
        <td><label>Theoritical</label></td>
    </tr><tr>
        <td><input type="radio" name="exp" value="true" >
        <input type="radio" name="exp" value="false" checked></td>
        <td><label>Experimental</label></td>
    </tr><tr>
        <td><input type="radio" name="ast" value="true"/>
        <input type="radio" name="ast" value="false" checked></td>
        <td><label>Astronomical</label></td>
    </tr><tr>
        <td><input type="radio" name="nuc" value="true"/>
        <input type="radio" name="nuc" value="false" checked></td>
        <td><label>Nuclear</label></td>
    </tr><tr>
        <td><input type="radio" name="par" value="true"/>
        <input type="radio" name="par" value="false" checked></td>
        <td><label>Particle</label></td>
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