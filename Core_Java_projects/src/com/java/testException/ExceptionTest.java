package com.java.testException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
	 System.out.println("Input your values");
	 try
		{	
	     a=scanner.nextInt();
		b=scanner.nextInt();
		
		c=a/b;
		System.out.println(c);
		}
		
		
		catch (Exception e) {
			System.out.println("Please do proper input");
		}
		
		
	}
	
}
