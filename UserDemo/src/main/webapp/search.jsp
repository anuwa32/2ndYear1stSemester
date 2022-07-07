<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


        <div class="container">
            
            
                    <div class="form-group">
                        <h2>Find City</h2>
                    </div>
                <br>
                <div class="form-group">
            <form method="get" action="servlett">     
                      <div class="form-group">
                          <h3>Select the City</h3>
       <%
            Connection con;
            PreparedStatement pst;
            ResultSet rs;
         try
	{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/melwa","root","");
            pst = con.prepareStatement("select veicle brand");
	    rs=pst.executeQuery();
            
            if(rs.next())
	   {
	      out.println("<tr>");
              out.println("<td>Choose Vehicle Brand</td>");
	      out.println("<td>");
	      out.println("<select name='combo'>");
	  do{
            String cityname = rs.getString("city");
	    out.println("<option value='"+ cityname   +"'>" +  cityname +  "</option>");
          }
            while(rs.next());
	   out.println("</select>");
           rs.close();
	   out.println("</td></tr>");
           out.println("</tr><td colspan=2 align=center><input type=submit  value=Retrieve></td></tr>");
           }
           else
            {
           out.println("<tr>");
 	   out.println("<td colspan=2 align=right>");
	   out.println("Sorry table is Empty");
           out.println("</td>");
            }	
 
	   out.println("</form>");
	  }
        catch(Exception e)
        {
                 e.printStackTrace(); // Or System.out.println(e);
        }	 
                              
        %>
         </div>
                    
           
                    
          </form>                     
                    
              </div>      
               
     </div>

 



</body>
</html>