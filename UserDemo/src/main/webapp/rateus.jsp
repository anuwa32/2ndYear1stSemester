<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rate us</title>

<link rel="stylesheet" type="text/css" href ="styles/styles9.css">

</head>
<body>
  <div class="rateusbox">
      <h1>Enjoying this site?</h1><br>
      <h2>Tell us how we did(Good/Bad)</h2>
      
      <br>
      <form action="rate" method="post">
      <div class="textbox">
      <label for="comment"><br><h3>Comment</h3></label>
      <input type ="text" name= "comment" placeholder="Enter your comment" value=""required><br>
      </div>
      
      
      <div class ="textbutton">
      <br><input type ="submit" name="submit" value ="Submit" onclick="enableButton()"></input>
      </div><br>
      
    <div class ="rsbn">
    <a href ="home.jsp">
    <input type ="button" name="submit" value ="Back">
    </a>
    </div>
      
      
      
      </form>
      
      
  </div>
</body>
</html>