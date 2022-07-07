package com.user; 

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteCusServlet")
public class DeleteCusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("cusid");
		boolean isTrue; 
		
		isTrue = UserDBUtil.deleteuser(id);
		 
		if(isTrue == true)
		{ 
			RequestDispatcher dis = request.getRequestDispatcher("register.jsp");
			dis.forward(request, response);
		}
		else {
			List<User> uDetails = UserDBUtil.getUserDetails(id);
			request.setAttribute("uDetails", uDetails);
			
			RequestDispatcher dis1 =request.getRequestDispatcher("userRegister.jsp");
			dis1.forward(request, response);
		}
		
	}

}
