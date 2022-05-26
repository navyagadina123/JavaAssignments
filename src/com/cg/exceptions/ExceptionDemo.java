package com.cg.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ExceptionDemo {
	public static void main(String[] args) {
//		  try{
//		  int a = 0;
//		  int b = 7 / a;
//		  System.out.println("After exception");
//		  } catch (ArithmeticException ex) { 
//		   System.out.println("Division by zero.");
//		   ex.printStackTrace();
//		  }
//		  System.out.println("After catch statement.");
//		 }
		

int b = 0;
List<Integer> numList = new ArrayList<Integer>();
// Putting values in a list
numList.add(2);
numList.add(3);
numList.add(0);// putting zero
numList.add(6);
numList.add(12);
// looping the list and dividing 30 by each integer retrieved from the list
for (Integer i : numList) {
	try {
		System.out.println("Dividing by " + i);
		// Division by zero will throw exception
	     	b = 30 / i;
	} catch (ArithmeticException ex) {
		System.out.println("Division by zero.");
		// Setting value to zero in case of exception
		b = 0;
		ex.printStackTrace();
	}
	System.out.println("Value of b " + b);
}
System.out.println("After for loop");
}
}
