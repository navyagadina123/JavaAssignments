package com.cg.exceptions;

import java.io.FileNotFoundException;

public class ExceptionPropogation2 {

	public static void main(String[] args) {
		  ExceptionPropogation2 obj = new ExceptionPropogation2();
		  obj.method1();
		  System.out.println("After handling exception");
		 }
		 
		 // This method declares the exception in throws clause
		 private void method3() throws FileNotFoundException{
		  System.out.println("In method3");
		  // throwing exception
		  throw new FileNotFoundException("File not found..");  
		 }
		 
		 // This method also declares the exception in throws clause
		 private void method2() throws FileNotFoundException{
		  System.out.println("In method2");
		  method3();
		 }
		 
		 // Exception will be handled here
		 private void method1(){
		  try{
		   method2();
		  } catch(FileNotFoundException ex){
		   System.out.println("FileNotFoundException caught:"+ex.getMessage());
		  }
		 }
		}

