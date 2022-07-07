package com.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BregServlet")
public class BregServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
		String firstname=request.getParameter("name");
		String lastname = request.getParameter("lname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String username = request.getParameter("uid");
		String password = request.getParameter("psw");
		
		boolean isTrue;
		
		 isTrue=UserDBUtil.insertuser1(firstname, lastname, email, phone, address, dob, gender, username, password);
		 
		 if(isTrue==true)
		 {
			 List<User> u1Details = UserDBUtil.getUserDetails1(username); // get user data
			 request.setAttribute("u1Details", u1Details);
			 
			 RequestDispatcher di = request.getRequestDispatcher("bdisplay.jsp");
			 di.forward(request, response);
			 
		 }else
		 {
			 RequestDispatcher di2 = request.getRequestDispatcher("error.jsp");
			 di2.forward(request, response);
			 
		 }
		
		
	}

}
