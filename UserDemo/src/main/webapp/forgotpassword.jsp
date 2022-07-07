<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot password</title>
<link rel="stylesheet" type="text/css" href ="styles/styles6.css">
</head>
<body>


 <div class="fbox">
   <h1>Forgot Password</h1>
      <form action="forgot" method="post"> 

     <div class="textbox">
  <label for="email"><br>Enter email</label>
  <input type ="text" name= "email" placeholder="Enter email" value=""required><br><br>
  </div>
  
     <div class="textbox1">
  <label for="phone number"><br>Phone number</label>
  <input type ="text" name= "phone" placeholder="Enter your phone number" value=""required><br><br>
  </div>
  
  
  
  
  
  <br><br>
  
  
  <label>
   <input type="checkbox" id="chkbx"  name="checkbox" onclick="enableBtutton()" required>Accept privacy policy and terms?</label><br>


  <div class ="textbutton">
  <br><input type ="submit" name="submit" value ="Submit" onclick="enableButton()"></input>
  </div><br>
  
</form>
</div>

 <div class ="fobn">
    <a href ="login.jsp">
    <input type ="button" name="submit" value ="Back">
    </a>
    </div>





</body>
</html>