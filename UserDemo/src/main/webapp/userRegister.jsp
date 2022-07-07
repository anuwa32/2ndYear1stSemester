<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Class</title>
<link rel="stylesheet" type="text/css" href ="styles/styles4.css">
</head>
<body>
<div class ="regbox">
    <h1>My Profile</h1>
    
    
    
    <table>
   <c:forEach var="ur" items = "${uDetails}">
   
   <c:set var ="id" value="${ur.id}"/>
   <c:set var ="firstname" value="${ur.firstname}"/>
   <c:set var ="lastname" value="${ur.lastname}"/>
   <c:set var ="email" value="${ur.email}"/>
   <c:set var ="phone" value="${ur.phone}"/>
   <c:set var ="address" value="${ur.address}"/> 
   <c:set var ="dob" value="${ur.dob}"/>
   <c:set var ="gender" value="${ur.gender}"/>
   <c:set var ="username" value="${ur.userName}"/>
   <c:set var ="password" value="${ur.password}"/> 
      
  
   <tr>
       <td>Customer ID:-</td>
       <td>${ur.id}</td>
   </tr>
   
   <tr>
       <td>First Name:-</td>
       <td>${ur.firstname}</td>
   </tr>
   <tr>
       <td>Last Name:-</td>
       <td>${ur.lastname}</td> 
   </tr>
   <tr>
       <td>Email:-</td>
       <td> ${ur.email}</td>
  </tr>
  <tr>
       <td>Phone Number:-</td>
       <td>${ur.phone}</td>
   </tr>
   <tr>
       <td>Address:-</td>
       <td>${ur.address}</td>
   </tr>
   <tr>
        <td>Date Of Birth:-</td>
        <td>${ur.dob}</td>
   </tr> 
   <tr>
        <td>Gender:-</td>
        <td>${ur.gender}</td>
   </tr>
   <tr>
        <td>Username:-</td>
        <td>${ur.userName}</td>
   </tr>
   <tr>
        <td>Password:-</td>
        <td> ${ur.password}</td>
   </tr>

   <br>
   
    </c:forEach>
    </table>
    
    
    <c:url value="updatecustomer.jsp" var="usupdate">
     <c:param name ="id" value="${id}"/>
     <c:param name ="firstname" value="${firstname}"/>
     <c:param name ="lastname" value="${lastname}"/>
     <c:param name ="email" value="${email}"/>
     <c:param name ="phone" value="${phone}"/>
     <c:param name ="address" value="${address}"/>
     <c:param name ="dob" value="${dob}"/>
     <c:param name ="gender" value="${gender}"/>
     <c:param name ="username" value="${username}"/>
     <c:param name ="password" value="${password}"/>
     
      
    </c:url>
    <br>
    
    <div class ="upd">
    <a href ="${usupdate}" onclick ="window.print()"> 
    <input type ="button" name="update" value ="Update Account">
    
    </a>
    </div>
    <br><br>
    
    
    <c:url value ="deletecustomer.jsp" var="usdelete"> 
    
    <c:param name ="id" value ="${id}"/>
    <c:param name ="firstname" value ="${firstname}"/>
    <c:param name ="lastname" value ="${lastname}"/>
    <c:param name ="email" value ="${email}"/>
    <c:param name ="phone" value ="${phone}"/>
    <c:param name ="address" value ="${address}"/>
    <c:param name ="dob" value ="${dob}"/>
    <c:param name ="gender" value ="${gender}"/>
    <c:param name ="username" value ="${username}"/>
    <c:param name ="password" value ="${password}"/>
    </c:url>
    
    <div class ="del">
    <a href ="${usdelete}">
    <input type ="button" name="delete" value ="Delete Account">
    </a>
    </div>
    <br><br>
    
    <div class ="homebn">
    <a href ="#">
    <input type ="button" name="submit" value ="Go Home page" disabled >
    </a>
    </div>
    
    <div class ="logbn">
    <a href ="login.jsp">
    <input type ="button" name="submit" value ="Back">
    </a>
    </div>
    
</div>  
 
    
</body>
</html>html>