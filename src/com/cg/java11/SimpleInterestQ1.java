package com.cg.java11;

interface Simpleinterest{
	int solve(int p,int r,int t);
}
public class SimpleInterestQ1 {
public static void main(String args[])
{
	
	
	Simpleinterest a=(p,r,t)->p*r*t;
	System.out.println(a.solve(2,3,4));
}
}

