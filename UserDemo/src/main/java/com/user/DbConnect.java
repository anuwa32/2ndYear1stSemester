package com.user;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {

	
	private static String url = "jdbc:mysql://localhost:3306/online_spare";
	private static String user="root";
    private static String pass="lk654321";
    private static Connection con;
    
    public static Connection getConnection()
    {
    	try {
    		
    		
    		Class.forName("com.mysql.jdbc.Driver");
    		con = DriverManager.getConnection(url,user,pass);
    		
    		
    		
    		
    		
    	}catch(Exception e) {
    		System.out.println("Database Connection Is UnSuccessfull");
    	}
    	return con;
    }
	
}
