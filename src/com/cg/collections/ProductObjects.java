package com.cg.collections;

import java.util.HashSet;
import java.util.Scanner;

public class ProductObjects {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int att=9;
		HashSet<String> hash=new HashSet<String>();
		System.out.println("enter values:");
		
		for(int i=0;i<=att;i++)
		{
			
			String ss=sc.next();
			hash.add(ss);
		}
		
		System.out.println(hash);
		for(String res:hash)
		{
			
			System.out.println(res);
		}
		sc.close();
	}



	}


