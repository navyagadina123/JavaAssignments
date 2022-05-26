package com.cg.practice.assignment1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int temp=n;
		int num=temp;
		double sum=0;
		int rem;
		int count=0;
		while(n!=0) {
			n=n/10;
			count=count+1;
		}
		while(temp!=0) {
			rem=temp%10;
			temp=temp/10;
			sum=sum+Math.pow(rem,count);
		}
		if(sum==num) {
			System.out.println("armstrong number");
			
		}
		else {
			System.out.println("not a armstrong number");
		}

	}

}
