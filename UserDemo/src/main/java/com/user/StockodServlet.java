package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StockodServlet")
public class StockodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out =response.getWriter(); 
		response.setContentType("text/html");
		
		
		String item_no =  request.getParameter("item");
		
		
		
		boolean isTrue;  
		isTrue =UserDBUtil.validationstoid(item_no);  // call validate method
		
		if(isTrue== true)
		{
			List<User> uDetails = UserDBUtil.getCustomer(item_no); //navigate userRegister form
			request.setAttribute("uDetails", uDetails);
			

			RequestDispatcher rs = request.getRequestDispatcher("");
			rs.forward(request, response);
		}else
		{
			out.println("<script type= 'text/javascript'>");   
			out.println("alert('');");
			out.println("location =''");
			out.println("</script>");
		
	}

}
}
