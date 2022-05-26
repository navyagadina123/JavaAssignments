package com.cg.practice.assignment2;

public class SingletonClass1 {
	// Singleton class
	// A singleton class is a class that can have only one object at a time
	// we can not create the object of a singleton class more than once.
	// However, if we try to create a object of a singletone class after the fisrt
	// time, the new reference variable
	// will also point to the first instance created

	// 1)Make the constructor is private
	private static SingletonClass1 uniqueInstance;
    
	public String str;
	private SingletonClass1() {
	}
    
	//To avoid more than one instance we can do method declare as synchronized
	public static synchronized SingletonClass1 getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonClass1();
		}
		return uniqueInstance;

	}
	public static void main(String[] args) {
		SingletonClass1 single1=SingletonClass1.getInstance();
		single1.str="Hi I am the singleton class String";
	    System.out.println("First reference: "+single1.str);
	    SingletonClass1 single2=SingletonClass1.getInstance();
	    single2.str="Hii";
	    System.out.println("Second reference: "+single2.str);
	}

}