package com.cg.practice.strings;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interned way of string literals
        String str1= "Hello";
        String str2= "Hello";
//        String str1=new String("Hello");
//        String str2=new String("Hello");
        //we are not comparing content i.e"hello"
        //we are comparing hashcodes of str1 and str2 are same
        if(str1==str2)
        	System.out.println(str1==str2);
        
        else
        	System.out.println(str1!=str2);
        
        
        //string object we used new operator
        //str3& str4 are pointing different memory in heap
        String str3=new String("Hello");
        String str4=new String("Hello ");
        if(str3==str4)
        	System.out.println(str3==str4);
        
        else
        	System.out.println(str1!=str2);
        
        //== will compare reference variables i.e hashcodes not content
        //how should we compare strings i.e content within
        if(str3.equals(str4))
        	System.out.println("str3 is equal to str4");
        else
        	System.out.println("str3 is not equal to str4");
        
        if(str3.compareTo(str4)==0)
        	System.out.println("str3 is compare to str4");
        else
        	System.out.println("str3 is not compare to str4");
        
//        
        //String methods
      String str="John,Jennie,Jim,Jack,Joe";
        System.out.println("str is:"+str);
        
        int len= str.length();
        System.out.println("length of str;"+len);
        System.out.println(str.charAt(0)+"|"+str.charAt(len-1));
        str.toUpperCase();
        System.out.println("str after uppercase"+str);
      
        
        //new string generated
        String s1=str.toUpperCase();
        System.out.println("str after uppercase is:"+str); //No changes Strings are Immuutable
        System.out.println("s1 is:"+s1);
        
        
        if(str.contains("jim")) {
        	System.out.println("jim in the string");
        	
        }
        String s2=str.substring(5);
        System.out.println("s2 is:"+s2);
        
        String s3=str.substring(6,10);//starts with index 6 and till index 9 i.e less than 10
        System.out.println("s3 is:"+s3);
        
        	String s4=str.replace('J','K');
        	System.out.println("s4 is:"+s4);
        	
        	char[] chArr=str.toCharArray();
        	for(char ch:chArr) {
        		System.out.println(ch+"");
        		
        	}
        System.out.println();
        
        String[] strArr=str.split(",");
    	for(String s:strArr) {
    		System.out.println(s.trim());
    		
    		
    		
    		String email="Johngmailcom";
    		String phone="993433232";
    		String pass="pass123";
    		if(!email.isEmpty()) {
    			System.out.println("email is available");
    			if(!email.contains("@")&& !email.contains(".")) {
    				System.out.println("but,email is not a valid email");
    				
    			}
    			else {
    				System.out.println("email is validOne");
    			}
    		}	
    		else {
    			System.out.println("plz provide valid one");
    		}
    		
    	
    	
    	if(!phone.isEmpty()) {
			System.out.println("phno is available");
			if(phone.length()!=0) {
				System.out.println("but,phno is not a valid number");
				
			}
			else {
				System.out.println("phno is valid");
			}
		}	
		else {
			System.out.println("plz provide valid one");
		}
       
    	//Strings are immutable
    	String string=new String("Hello");
    	string.concat("world");
    	System.out.println("String is:"+string);
    	
    	StringBuffer buffer=new StringBuffer("Hello");
    	buffer.append("world");
    	System.out.println("buffer is:"+buffer);
    	
    	StringBuilder builder=new StringBuilder("Hello");
    	builder.append("world");
    	System.out.println("builder is:"+builder);
    
    	
    	
    	//run time polymorphism
    	
  	CharSequence cs=null;
   	cs=new String("Hello");
   	cs=new StringBuffer("awesome");
   	cs=new StringBuilder("bye");
    	
      System.out.println(cs);
      
      
      String strrr="Hello world";
      int sr=strrr.length();
      System.out.println(sr);
      
     String st1= strrr.toUpperCase();
      System.out.println(st1);
	
      String st2= strrr.toLowerCase();
      System.out.println(st2);
      
    	}
        
	}

}


