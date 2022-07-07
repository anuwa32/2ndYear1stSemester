<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password 2</title>
<link rel="stylesheet" type="text/css" href ="styles/styles8.css">
</head>
<body>


<div class="f2box">
   <h1>Forgot Password</h1>
      <form action="forgot2" method="post"> 


  <div class="textbox1">
  <label for="email"><br>Re Enter email</label>
  <input type ="text" name= "email" placeholder="Enter your email" value=""required><br><br>
  </div>

  <div class="textbox">
  <label for="password"><br>Enter password</label>
  <input type ="password" name= "pass" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
   title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" placeholder="Enter your new password" value=""required><br><br>
  </div>
  
  
  
  
  
    
  
  <br><br>
  
  
  <label>
   <input type="checkbox" id="chkbx"  name="checkbox" onclick="enableBtutton()" required>Accept privacy policy and terms?</label><br>


  <div class ="textbutton">
  <br><input type ="submit" name="submit" value ="Submit" onclick="enableButton()"></input>
  </div><br>
  
</form>
</div>




</body>
</html>