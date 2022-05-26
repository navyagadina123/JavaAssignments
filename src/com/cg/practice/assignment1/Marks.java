package com.cg.practice.assignment1;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sub1, sub2,sub3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sub1 marks:");
		sub1=sc.nextInt();
		System.out.println("enter the sub2 marks:");
		sub2=sc.nextInt();
		System.out.println("enter the sub3 marks:");
		sub3=sc.nextInt();
		
		if(sub1==60 && sub2==60 && sub3==60)
			System.out.println("passed");
		else if((sub1>60&&sub2>60)||(sub2>60&&sub3>60)||(sub1>60&&sub3>60))
			System.out.println("promoted");
		else if(sub1<60&&sub2<60&&sub3<60)
			System.out.println("failed");
		else
			System.out.println("failed");
		

	}

}
