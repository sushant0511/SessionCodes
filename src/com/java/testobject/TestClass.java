package com.java.testobject;

import java.util.Scanner;

public class TestClass {

	
	public TestClass() { 
		System.out.println("Hi from call");
	}
	
	
	protected static int add() {
		
		int a,b,c;
		Scanner scanner=new Scanner(System.in);  // 
		System.out.println("ENetr your number");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=a+b;
		return c;
		
		
	}
	
}
