package com.java.testDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnect {

	public static void main(String[] args) {
		
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			//  This line is used to create connection with any DB
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/1juntest", "root", "root");
			// execute my query 
			Statement statement=connection.createStatement();
			System.out.println("Enter id of employee to delete");
			Scanner scanner=new Scanner(System.in);
			int id=scanner.nextInt();
			//String name=scanner.next();
//			System.out.println("Enter updated salary");
//			float salary=scanner.nextFloat();
			//String add=scanner.next();
			//String query="insert into employee(`name`,`salary`,`address`) values('"+name+"','"+salary+"','"+add+"')";
			//String query ="update employee SET `salary`='"+salary+"' where (id='"+id+"')";
			String query="delete from employee where id='"+id+"'";
			int i=0;
			i=statement.executeUpdate(query);
			if(i!=0)
			{
				System.out.println("Data deleted Successfully");
			}
			else
			{
				System.out.println("Data not updated ");
			}
			
			
			
//			ResultSet set=statement.executeQuery("SELECT * FROM employee");
//			while(set.next())
//			{
//				System.out.println(set.getInt(1)+"  "+set.getString(2)+" "+set.getFloat(3)+"  "+set.getString(4));
//			}
			
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
