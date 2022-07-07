<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


    
    <table>
   <c:forEach var="ur" items = "${u1Details}">
   
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
  


</body>
</html>