package com.cg.practice.strings;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first String:");
	    String	firststr=sc.next();
	    
	    System.out.println("enter the second String:");
	    String	secondstr=sc.next();

	    System.out.println(firststr+""+secondstr);
	}

}
