<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Status</title>
</head>
<body>


    <div class = "orderbox">
    <h1>Status</h1>
    
    <table>
    
    <c:forEach var ="st" items="${stDetails}">
    
    <c:set var = "oid" value ="${st.oid}"/>
    <c:set var = "date" value ="${st.date}"/>
    <c:set var = "bemail" value ="${st.bemail}"/>
    <c:set var = "vbrand" value ="${st.vbrand}"/>
    <c:set var = "category" value ="${st.category}"/>
    <c:set var = "model" value ="${st.model}"/>
    <c:set var = "myear" value ="${st.myear}"/>
    <c:set var = "scategory" value ="${st.scategory}"/>
    <c:set var = "qty" value ="${st.qty}"/>
    <c:set var = "name" value ="${st.name}"/>
    <c:set var = "item_no" value ="${st.item_no}"/>
    <c:set var = "status" value ="${st.status}"/>
    
    
    <tr>
        <td>Status</td>
        <td>${st.status}</td>
    </tr>
    </c:forEach>
    
    
    </table>
    
    </div>
   

</body>
</html>