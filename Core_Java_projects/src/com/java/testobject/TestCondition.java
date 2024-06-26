package com.java.testobject;

public class TestCondition {

	public static void main(String[] args) {
		
		
		int res=TestClass.add();
//		System.out.println("Result="+res);
		if(res>30)
		{
			System.out.println("Done and exit");
		}
		else
		{
			System.out.println("Entered");
			TestCondition.main(args);
		}
		
		
	}
}
