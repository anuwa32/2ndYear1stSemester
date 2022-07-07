package com.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.customer.*;
import com.user.User;
import com.user.UserDBUtil;


@WebServlet("/LogServlet")
public class LogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out =response.getWriter(); 
		response.setContentType("text/html");
		
		
		String username =  request.getParameter("uid");
		String password = request.getParameter("pass");
		
		
		boolean isTrue;  
		isTrue =UserDBUtil.validate(username, password);  // call validate method
		
		if(isTrue== true)
		{
			List<User> uDetails = UserDBUtil.getCustomer(username); //navigate userRegister form
			request.setAttribute("uDetails", uDetails);
			

			RequestDispatcher rs = request.getRequestDispatcher("userRegister.jsp");
			rs.forward(request, response);
		}else
		{
			out.println("<script type= 'text/javascript'>");   
			out.println("alert('your username or password is incorrect please check again');");
			out.println("location ='login.jsp'");
			out.println("</script>");
		}
		
		
		
	}

}
