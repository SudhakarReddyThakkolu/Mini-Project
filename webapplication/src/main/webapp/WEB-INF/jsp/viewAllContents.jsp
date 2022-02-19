<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="u"%>
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
<div align="center">
      <h2 style="color: green">${msg}</h2>
      <table border="1">
           <tr>
           <td>ID:</td>
           <td>Thumbnail:  </td>
           <td>Theoritical: </td>
           <td>Experimental: </td>
           <td>Astronomical </td>
           <td>Nuclear: </td>
           <td>Particle: </td>
          
           <td>Edit </td>
           <td>Delete </td>
           </tr>
           <u:forEach items="${contents}" var="c">
           <tr>
           <td>${c.id}</td>
           <td><img alt="No Photo" width="100 height=300" src="data:image/jpg;base64,${c.contentsThumbnail}"></img></td>
           <td>${c.theoritical}</td>
           <td>${c.experimental}</td>
           <td>${c.astronomical}</td>
           <td>${c.nuclear}</td>
           <td>${c.particle}</td>
           
		   <td><a href="updateContents/${c.id}">Edit</a></td>
   		   <td><a href="deleteContents/${c.id}">Delete</a></td>
		</tr>
		</u:forEach>
      </table>  
</div>


</body>
</html>