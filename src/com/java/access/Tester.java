package com.java.access;


public class Tester {

	private void acRemote()
	{
		System.out.println("I have a remote with a private access");
	}
	
	
	public static void main(String[] args) {
		
		Tester remote=new Tester();
		remote.acRemote();
	}
}
