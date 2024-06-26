package com.java.testcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		Scanner scanner=new Scanner(System.in);
		
		List<Integer> list=new ArrayList();  // Data type
		
		list.add(23);
		list.add(12);
		list.add(14);
		list.add(9);
		list.add(12);
		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
		
		Set<Integer> set=new TreeSet<Integer>();  // Data type
		
		set.add(23);
		set.add(12);
		set.add(14);
		set.add(9);
		set.add(12);
		System.out.println(set);
		
		
		
		
		
		
		
	}
	
	
}
