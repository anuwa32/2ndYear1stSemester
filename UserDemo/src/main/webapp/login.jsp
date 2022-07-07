<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<link rel="stylesheet" type="text/css" href ="dd/styles1.css">
</head>
<body>
     <div class="loginbox">
     
   <h1>Login</h1>
      <form action="LogServlet" method="post"> 

  <div class="textbox">
  <label for="username"><br>Username</label>
  
  
  <input type ="text" class="unam" name= "uid" placeholder="Enter username" value="" required><br><br>
  
  
  </div>
  
  <div class ="textbox2">
  <label for="password"><br>Password </label> 
  <input type="password" class="unam1" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
  title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" name="pass"  placeholder="Enter password" value=""required><br><br>
  </div>
  
  <div class ="textbutton">
  <br><input type ="submit" name="submit" value ="Login" onclick="enableButton()"></input>
  </div><br>

   <label>
   <input type="checkbox" id="chkbx"  name="checkbox" onclick="enableBtutton()" required>Remember me?</label><br>


<br>
      
  
</form>
</div>

    <div class="fpass">
         <a href ="forgotpassword.jsp">
    <input type ="button" name="submit" value ="Forgot Password?">
    </a>
   </div>
   
    <div class="fpass1">
         <a href ="register.jsp">
    <input type ="button" name="submit" value ="Sign up">
    </a>
    </div>
    
    
    <div class="fpass2">
         <a href ="sell.jsp">
    <input type ="button" name="submit" value ="Back">
    </a>
    </div>
    
    
    
</body>
</html>