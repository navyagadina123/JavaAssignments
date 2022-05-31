package com.cg.generics;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class RandomNumbers {

	public static void main(String[] args) {
		
		HashMap<Integer,Double> hashmap=new HashMap<Integer,Double>();
		//This will make ask user to give input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		int limit=9;
		//Using limit limiting this only to take 10 inputs
		for(int i=0;i<=limit;i++)
		{
			int number=sc.nextInt();
			double dd=sc.nextDouble();
			//Taking key and value from user and passing the same in hashmap
			hashmap.put(number,dd);
		}
		Set<Entry<Integer,Double>> ss=hashmap.entrySet();
		for(Entry<Integer,Double> en:ss)
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
		sc.close();
		}

	}

