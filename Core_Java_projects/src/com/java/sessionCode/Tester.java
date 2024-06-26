package com.java.sessionCode;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("1-->Add");
		System.out.println("2-->Array");
		System.out.println("3-->If Else");
		System.out.println("4-->Exit");
		System.out.println("Enter your choice");
		int choice=scanner.nextInt();
		if(choice==1)
		{
			new AddTest();
			Tester.main(args);
		}
		else if (choice==2)
		{
			new ArrayTest();
			Tester.main(args);
		}
			else if (choice==3)
			{
			new IfElseTest();
			Tester.main(args);
			}
		else if (choice==4)
			System.exit(0);
		else
			Tester.main(args);
		
		
		
		

	}

}
