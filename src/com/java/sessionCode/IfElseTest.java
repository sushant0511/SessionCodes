package com.java.sessionCode;

import com.java.testobject.TestClass;
import com.java.testobject.TestCondition;

public class IfElseTest {

	public IfElseTest() {

		int res=TestClass.add();
//		System.out.println("Result="+res);
		if(res>30)
		{
			System.out.println("Done and exit");
		}
		else
		{
			System.out.println("Entered");
			
		}
		

	}
}
