package com.cg.practice.assignment1;

import java.util.Scanner;

public class CUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
      System.out.println("enter Username:");
      String username=sc.next();
      System.out.println("enter the password");
      String password=sc.next();
      if(username.equalsIgnoreCase("navya123")&&password.equalsIgnoreCase("password"))
    	  System.out.println("welcome"+username);
      else
    	  System.out.println("contact admin");
	}

}
