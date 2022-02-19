<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="u"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles/style2.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Akaya+Telivigala&display=swap" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>E-Learning</title>
</head>
<body style="background-color: #E0F6F9;">
<h1>${msg}</h1>
<h1 height="100" class="division1" style="-webkit-background-clip: text;">WELCOME</h1>
             <div><button class="openButton"><a href="admin" ><strong>ADMIN</strong></a></button></div><br><br><br>
             <div class="openBtn"><button class="openButton" onclick="openForm()"><strong >LOGIN</strong></button></div><br><br><br>
             <button class="openButton"><a href="creator"><strong>CREATOR</strong></a></button><br><br><br> 
            
<div style=" background-color:black; height: 75px; background-image: url('styles/galactical.gif'); font-color:''black'" align="center"  >
</div>
       <div class="loginPopup">
      <div class="formPopup" id="popupForm">
        <form:form action="/validateLearner" class="formContainer" modelAttribute="learners" >
          <h2>Please Log in</h2>
          <label for="email">
            <strong>E-mail</strong>
          </label>
          <input type="text" id="email" placeholder="Your Email" name="emailId" required/>
          <label for="psw">
            <strong>Password</strong>
          </label>
          <input type="password" id="psw" placeholder="Your Password" name="password" required/>
           <a href="learnerLogin"><button type="submit" class="btn">Log in</button></a>
          <button type="button" class="btn cancel" onclick="closeForm()">Close</button>
          <a href="learnerRegister">New Learner?register</a>
        </form:form>
        
      </div>
      
    </div>
    <script>
      function openForm() {
        document.getElementById("popupForm").style.display = "block";
      }
      function closeForm() {
        document.getElementById("popupForm").style.display = "none";
      }
    </script>
<div align="center" ><u:forEach items="${contents}" var="c">
           <td><a href="pdfView/${c.id}"><img style="padding: 10px" alt="No Photo" width=250 height="350" src="data:image/jpg;base64,${c.contentsThumbnail}"></img></a></td>
		
		</u:forEach></div>
		
		
</body>
</html>