package com.cg.javaassignment.strings;

public class StringBuilderAssignment {

	public static void main(String[] args) {
		
			StringBuilder sb=new StringBuilder();
			sb.append("StringBuilder ");
			sb.append("is a peer class of String ");
			sb.append("that provides much of ");
			sb.append("the functionality of strings");
	          System.out.println(sb);
	          
	          StringBuilder sb1=new StringBuilder("This method returns the  reversed object on which  it was called");
	          System.out.println("original string: " +sb1);
	          sb1.reverse();
	         System.out.println("reverse string: " +sb1);
	          
	          StringBuilder sb2= new StringBuilder("It is used to _  at the specified position");
	          sb2.insert(14, "insert text");
	          System.out.println(sb2);

	}

}
