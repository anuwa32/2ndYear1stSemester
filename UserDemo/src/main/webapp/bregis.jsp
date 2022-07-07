<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>b insert</title>
</head>
<body>


<div class="registerbox">
      <h1>Registration Form</h1>
  
  
  <form action="breg1"method="post">

  <div class="textbox">
  <label for="firstusername"><br>First Name</label>
  <input type ="text" id="reg"  name= "name" placeholder="Enter your firstname" value=""required><br>
  </div>
  
   <div class ="textbox1">
   <label for="lastusername"><br>Last Name</label>
   <input type ="text" id="reg"  name= "lname" placeholder="Enter your lastname" value=""required><br>
   </div>
   
    <div class ="textbox2">
   <label for="email"><br>Email  </label>
   <input type ="text" id="reg" name= "email" placeholder="Enter your email" value=""required><br>
   </div>
   
    <div class ="textbox3">
    <label for="phone number"><br>Phone Number</label>
    <input type ="text" id="reg"  name= "phone" placeholder="Enter your phone number" value=""required><br>
    </div>
   
    <div class ="textbox4">
    <label for="address"><br>Address</label>
    <input type ="text" id="reg"  name= "address" placeholder="Enter your home address" value=""required><br>
    </div>
   
   
     <div class ="textbox5">
     <label for="dob"><br>Date Of Birth</label>
     <input type ="Date" id="reg" name= "dob" placeholder="Enter your dob" value=""required><br>
     </div>
     
      <div class ="textbox6">
     <label for="gender"><br>Gender</label>
     <input type ="text" id="reg"  name= "gender" placeholder="Male/Female" value=""required><br>
     </div>
     
     
     
      <div class ="textbox7">
      <label for="username"><br>User Name</label>
      <input type ="text" id="reg" name= "uid" placeholder="Enter your username" value=""required><br>
      </div>
     
     
      <div class ="textbox8">
      <label for="password"><br>Password</label>
      <input type ="password" id="reg"  name= "psw" placeholder="Enter your password" value=""required><br>
      </div>
      
      
      <div class ="textbutton">
      <br><input type ="submit" name="submit" value ="Submit" onclick="enableButton()"></input>
      </div><br>
      
      
      
     
      </form>

</div>

</body>
</html>