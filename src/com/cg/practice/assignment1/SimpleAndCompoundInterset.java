package com.cg.practice.assignment1;

import java.util.Scanner;

public class SimpleAndCompoundInterset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double p,t,r,sim,com;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of principal:");
		p=sc.nextDouble();
		
		System.out.println("enter the annual rate of interest:");
		r=sc.nextDouble();
		
		System.out.println("enter the no of years:");
		t=sc.nextDouble();
		
		sim=(p*t*r)/100;
		com=p*Math.pow(1.0+r/100.0,t)-p;
		
		System.out.println("simple interst:" +sim);
		System.out.println("compound interest:" +com);

	}

}
