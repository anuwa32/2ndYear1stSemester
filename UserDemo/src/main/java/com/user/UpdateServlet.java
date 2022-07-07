package com.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("cusid");          //catch the values and save
		String firstname = request.getParameter("name");
		String lastname = request.getParameter("lname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		boolean isTrue;
		
		isTrue = UserDBUtil.updateuser(id, firstname, lastname, email, phone, address, dob, gender, username, password);
		
		if(isTrue==true)
		{
			List<User> uDetails = UserDBUtil.getUserDetails(id); // get user data
			request.setAttribute("uDetails", uDetails);
			
			RequestDispatcher rds = request.getRequestDispatcher("userRegister.jsp");
			rds.forward(request, response);
		}else
		{
			List<User> uDetails = UserDBUtil.getUserDetails(id);
			request.setAttribute("uDetails", uDetails);
			
			RequestDispatcher rds1 = request.getRequestDispatcher("userRegister.jsp");
			rds1.forward(request, response);
		}
	}

}
