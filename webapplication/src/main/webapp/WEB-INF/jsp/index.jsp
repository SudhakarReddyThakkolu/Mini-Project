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
<body style="background-color: #800080; background-image: url('https://i.pinimg.com/originals/3d/08/e0/3d08e03cb40252526fee2036a67f07f1.gif');">
<div style="">
<h1>${msg}</h1>
<h1  height="100" class="division1" style="-webkit-background-clip: text;"><img style="padding : 10px" alt="Try" width=50 height=75 src="sp1"></img> To Learn</h1>
</div>

             <div><button class="openButton"><a href="admin" ><strong>ADMIN</strong></a></button></div><br><br><br>
             <div class="openBtn"><button class="openButton" onclick="openForm()"><strong >LOGIN</strong></button></div><br><br><br>
             <button class="openButton"><a href="creator"><strong>CREATOR</strong></a></button><br><br><br> 
            
<div style=" background-color:maroon; height: 75px; background-image: url('https://i.pinimg.com/originals/3d/08/e0/3d08e03cb40252526fee2036a67f07f1.gif'); font-color:''maroon'" align="center"  >
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
           <td><a href="#" onclick="myFunction()"><img style="padding: 10px" alt="No Photo" width=250 height="350" src="data:image/jpg;base64,${c.contentsThumbnail}"></img></a></td>

<script>
function myFunction() {
  alert("Please Login First!");
}
</script>
</u:forEach></div>
		
		
</body>
</html>