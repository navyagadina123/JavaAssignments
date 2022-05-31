package com.cg.exceptions;

import java.util.Scanner;

public class Example{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int numberOne=sc.nextInt();
		int numberTwo=sc.nextInt();
		//Using try,catch block we are handling exception
		try
		{
			int result=(numberOne/numberTwo);
			System.out.println(result);
			
		}
		catch(Exception e)
		{
			System.out.println("Number cannot be divided by zero");
		}
		sc.close();
	}

}

