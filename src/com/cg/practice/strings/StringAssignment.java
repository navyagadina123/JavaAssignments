package com.cg.practice.strings;

import java.util.Scanner;

public class StringAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String str="Hello World";
		int len=str.length();
		System.out.println(len);
		
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string:");
		str1=sc.next();
		System.out.println("enter the second string:");
		str2=sc.next();
		System.out.println("concatenated String");
		System.out.println(str1.concat(str2));*/
		
		String str="Java String pool refers to the collection of string which are stored in heap memory";
		String s=str.toLowerCase();
		System.out.println(s);
		
		String st="Java String pool refers to the collection of string which are stored in heap memory";
		String s1=st.toUpperCase();
		System.out.println(s1);
		
		String sr="Java String pool refers to the collection of string which are stored in heap memory";
		String s2=sr.replace('a', '$');
		System.out.println(s2);
		
		String stt="Java String Pool refers to the Collection of string which are stored in heap memory";
		if(stt.contains("Collection"))
			System.out.println("collection is present in string");
		
		else
			System.out.println("collection is not present in string");
		
		
		String str5="Java String  pool referrs to the collection of Strings which are stored in heap memory";
		String str6="java string  pool referrs to the collection of strings which are stored in heap memory";
		
		  System.out.println(str5.matches(str6));
		
	}

}


