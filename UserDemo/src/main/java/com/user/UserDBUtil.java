package com.user;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import org.apache.catalina.servlets.DefaultServlet.SortManager.Order;

import com.customer.dbconnect;
//import com.sun.jmx.remote.util.OrderClassLoaders;


public class UserDBUtil {
	
	private static Connection con =null;
	private static Statement stn =null;
	private static ResultSet re =null;
	private static boolean isCheck;

	
	//login page
	
	public static boolean validate(String username,String password)
	{
		try {
			con=DbConnect.getConnection();
			stn =con.createStatement();
			
			String sql ="Select * from customer where username='"+username+"' and password='"+password+"'";
			re= stn.executeQuery(sql);
			
			if(re.next())
			{
				isCheck=true;
			}
			else
			{
				isCheck=false;
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return isCheck;
	}
	
	
	public static List<User> getCustomer(String username)
	{
		ArrayList<User> us = new ArrayList<>();
		
		try {
			con=DbConnect.getConnection();
			stn = con.createStatement();
			String sql="select * from customer where username ='"+username+"'";
			re=stn.executeQuery(sql);
			while(re.next())
			{
				int id= re.getInt(1);
				String firstname=re.getString(2);
				String lastname=re.getString(3);
				String email= re.getString(4);
				String phone = re.getString(5);
				String address = re.getString(6);
				String dob=re.getString(7);
				String gender=re.getString(8);
				String userU =re.getString(9);
				String passU = re.getString(10);
				
				User u = new User(id,firstname,lastname,email,phone,address,dob,gender,userU,passU);   //pass the  values to constructor
				us.add(u);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return us;
	}
	
	
	
	
	//insert customer
	
	public static boolean insertuser(String name,String lname,String email,String phone,String address,String dob,String gender,String username,String password)
	{
		boolean isCheck=false;
		 
		
		try {
			con =DbConnect.getConnection();
			stn =con.createStatement();
			
			String sql = "insert into customer values(0,'"+name+"','"+lname+"','"+email+"','"+phone+"','"+address+"','"+dob+"','"+gender+"','"+username+"','"+password+"')";
			int rs = stn.executeUpdate(sql);
			
			if(rs > 0)
			{
				isCheck= true;
			}else
			{
				isCheck = false;
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return isCheck;
	}
	
	
	//update customer
	
	public static boolean updateuser(String id,String firstname,String lastname,String email,String phone,String address,String dob,String gender,String username,String password)
	{
		try {
			
			con = DbConnect.getConnection();
			stn= con.createStatement();
			
			String sql ="update customer set firstname='"+firstname+"',lastname='"+lastname+"',email='"+email+"',phone='"+phone+"',address='"+address+"',dob='"+dob+"',gender='"+gender+"',username='"+username+"',password='"+password+"'"+"where id ='"+id+"'";
			
			int rs= stn.executeUpdate(sql);
			if(rs>0) {
				isCheck =true;
			}else {
				isCheck =false;
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return isCheck;
	}
	
	//retrieve part
	
	public static List<User> getUserDetails(String Id)
	{
		int conID =Integer.parseInt(Id);  //wrapper  class
		
		ArrayList<User> us1 = new ArrayList<>(); //all customer details
		
		try {
			 con = DbConnect.getConnection();
			 stn = con.createStatement();
			 
			 String sql ="select * from customer where id='"+conID+"'"; 
			 re= stn.executeQuery(sql);
			
			 while(re.next())   // assign variables
			 {
				 int id =re.getInt(1);
				 String firstname =re.getString(2);
				 String lastname = re.getString(3);
				 String email = re.getString(4);
				 String phone = re.getString(5);
				 String address = re.getString(6);
				 String dob = re.getString(7);
				 String gender = re.getString(8);
				 String username = re.getString(9);
				 String password =re.getString(10);
				 
				 
				 User u = new User(id,firstname,lastname,email,phone,address,dob,gender,username,password);
				 us1.add(u);
				 
			 }
			
			
		}catch(Exception e) {
			e.printStackTrace();;
		}
		
		
		
		return us1;
	}
	
	
	
	//delete customer
	
	public static boolean deleteuser(String id)
	{
		int convID = Integer.parseInt(id);  //wrapper class
		
		
		 try {
			     con = DbConnect.getConnection();
			     stn = con.createStatement();
			     
			     String sql ="delete from customer where id ='"+convID+"'";
			     int rt =stn.executeUpdate(sql);   //create Result set
			     
			     if(rt >0)
			     {
			    	 isCheck=true;
			    	 
			     }else {
			    	  isCheck=false;
			     }
			     
			 
			 
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		
		return isCheck;
	}
	
	
	
	//forgot password
	
	
	public static boolean validate1(String email,String phone)
	{
		try {
			con=DbConnect.getConnection();
			stn =con.createStatement();
			
			String sql ="Select * from customer where email='"+email+"' and phone='"+phone+"'";
			re= stn.executeQuery(sql);
			
			if(re.next())
			{
				isCheck=true;
			}
			else
			{
				isCheck=false;
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return isCheck;
	}
	
	
	//retrieve part
	
	public static List<User> getCustomer1(String email)
	{
		ArrayList<User> us = new ArrayList<>();
		
		try {
			con=DbConnect.getConnection();
			stn = con.createStatement();
			String sql="select * from seller where email ='"+email+"'";
			re=stn.executeQuery(sql);
			while(re.next())
			{
				int id= re.getInt(1);
				String firstname=re.getString(2);
				String lastname=re.getString(3);
				String emailU= re.getString(4);
				String phoneU = re.getString(5);
				String address = re.getString(6);
				String dob=re.getString(7);
				String gender=re.getString(8);
				String userU =re.getString(9);
				String passU = re.getString(10);
				
				User u = new User(id,firstname,lastname,emailU,phoneU,address,dob,gender,userU,passU);
				us.add(u);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return us;
	}
	
	
	
	
	//rate us
	
	public static boolean insertcustomer1(String comment)
	{
		
		boolean corr =false;
		
		//create db connection
		
		String url ="jdbc:mysql://localhost:3306/spare_part1";
		String user ="root";
		String pass ="lk654321";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
    		con = DriverManager.getConnection(url,user,pass);
    		
    		Statement stmt = con.createStatement();
    		
    		String sql = "insert into customer2 values (0,'"+comment+"')";
    		
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs>0)
    		{
    			corr=true;
    		}else
    		{
    			corr=false;
    		}
			
				
		}catch(Exception e)
		
		 {
			e.printStackTrace();
		 }
		
		return corr;
	}

	
	
	
	//b register
	
	
	public static boolean insertuser1(String name,String lname,String email,String phone,String address,String dob,String gender,String username,String password)
	{
		boolean isCheck=false;
		 
		
		try {
			con =DbConnect.getConnection();
			stn =con.createStatement();
			
			String sql = "insert into customer values(0,'"+name+"','"+lname+"','"+email+"','"+phone+"','"+address+"','"+dob+"','"+gender+"','"+username+"','"+password+"')";
			int rs = stn.executeUpdate(sql);
			
			if(rs > 0)
			{
				isCheck= true;
			}else
			{
				isCheck = false;
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return isCheck;
	}
	
	
	public static List<User> getUserDetails1(String username)
	{
		//int conID1 =Integer.parseInt(Id);  //wrapper  class
		
		ArrayList<User> us1 = new ArrayList<>(); //all customer details
		
		try {
			 con = DbConnect.getConnection();
			 stn = con.createStatement();
			 
			 String sql ="select * from customer where username='"+username+"'"; 
			 re= stn.executeQuery(sql);
			
			 while(re.next())   // assign variables
			 {
				 int id =re.getInt(1);
				 String firstname =re.getString(2);
				 String lastname = re.getString(3);
				 String email = re.getString(4);
				 String phone = re.getString(5);
				 String address = re.getString(6);
				 String dob = re.getString(7);
				 String gender = re.getString(8);
				 String userName = re.getString(9);
				 String password =re.getString(10);
				 
				 
				 User u = new User(id,firstname,lastname,email,phone,address,dob,gender,userName,password);
				 us1.add(u);
				 
			 }
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return us1;
	}
	
	
	
	//order idddd
	
	public static boolean validationstoid(String item_no) {
		
		try {
			
			con = dbconnect.getConnection();
			stn = con.createStatement();
			
			String sql = "select * from automart.order where item_no ='"+item_no+"'";
			
			re=stn.executeQuery(sql);
			
			if(re.next()) {
				
				isCheck = true;
			}else {
				
				isCheck = false;
			}
			
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		return isCheck;
		
	}
	/*
	public static List<Order> getorderstid(String item_no){
		
		ArrayList<Order> os = new ArrayList<>();
		
		try {
			
			con = dbconnect.getConnection();
			stn = con.createStatement();
			
			String sql = "select * from automart.order where item_no ='"+item_no+"'";
			
			re= stn.executeQuery(sql);
			
			while(re.next()) {
				
				int oid = re.getInt(1);
				String date = re.getString(2);
				String bemail = re.getString(3);
				String vbrand = re.getString(4);
				String category = re.getString(5);
				String model = re.getString(6);
				String myear = re.getString(7);
				String scategory = re.getString(8);
				String qty = re.getString(9);
				String name = re.getString(10);
				String item_No = re.getString(11);
				String status = re.getString(12);
				
				Order od2 = new Order(oid,date,bemail,vbrand,category,model,myear,scategory,qty,name,item_no,status);
				os.add(od2);
				
			}
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}
	
	*/
	
	
	
}
