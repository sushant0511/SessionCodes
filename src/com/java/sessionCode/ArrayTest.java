package com.java.sessionCode;

import java.util.Scanner;

public class ArrayTest {

	public ArrayTest() {
	
		int i=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Numbers");
		int a[] =new int[5];
		for(i=0;i<5;i++)  //i =0,1,2,3,4
		a[i]=scanner.nextInt();// when it reach to 4 line no 14 will exit
		System.out.println("Output is="+i);
		for(i=0;i<5;i++)
		System.out.println(a[i]);
		
		
	}
	
}
