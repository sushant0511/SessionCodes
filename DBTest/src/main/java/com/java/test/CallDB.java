package com.java.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class CallDB {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class Found");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
			System.out.println("Connection is "+connection);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
	}
}
