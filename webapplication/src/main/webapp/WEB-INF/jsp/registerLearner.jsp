<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <div>
    <form:form action="registerLearner_" modelAttribute="learner" >
        <table>
    <tr>
        <td>First Name :</td>
        <td><form:input path="name"/></td>
    </tr><tr>
        <td>Password :</td>
        <td><form:password path="password"/></td>
    </tr><tr>
        <td>Email Id :</td>
        <td><form:input path="emailId"/></td>
    </tr><tr>
    <tr>
        <td>Creator Age :</td>
        <td><form:input path="age"/></td>
    </tr>
    <tr>
        <td>Date of Birth :</td>
        <td><form:input type="date" path="dob"/></td>
    </tr>
    <tr>
		<td><input type="submit" value="Register"></td>
		<td><input type="reset" value="Clear"></td>
	</tr><tr>
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
    
    </table>
    </form:form>
    
    <a href="/">HomePage</a>
</div>





</body>
</html>