package com.java.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CallFromDB {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/1juntest", "root", "root");
			Statement statement=connection.createStatement();
			List<Employee>  list=new ArrayList<Employee>();
			ResultSet rs=statement.executeQuery("select * from employee");
			while(rs.next())
			{
				Employee employee=new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setSalary(rs.getFloat(3));
				list.add(employee);
			}
			
			for(Employee e:list)
			{
				System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
