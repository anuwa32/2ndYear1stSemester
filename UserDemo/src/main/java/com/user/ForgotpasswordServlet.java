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


@WebServlet("/ForgotpasswordServlet")
public class ForgotpasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		
		
		String email =  request.getParameter("email");
		String phone = request.getParameter("phone");
		
		boolean isTrue;
		isTrue =UserDBUtil.validate1(email, phone);
		
		
		if(isTrue== true)
		{
			List<User> uDetails = UserDBUtil.getCustomer1(email);
			request.setAttribute("uDetails", uDetails);
			

			RequestDispatcher rs = request.getRequestDispatcher("forgotpassword2.jsp");
			rs.forward(request, response);
		}else
		{
			out.println("<script type= 'text/javascript'>");
			out.println("alert('your email or phone number is incorrect please check again');");
			out.println("location ='forgotpassword.jsp'");
			out.println("</script>");
		}
		
	}

}
