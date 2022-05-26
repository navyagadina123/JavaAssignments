package com.cg.exceptions;

import java.io.IOException;

public class Cat extends Animal {
	public void eat()  throws NullPointerException{
		System.out.println("cat is eating");
	}
	public void sleep()  throws IOException{
		System.out.println("cat is sleeping");
	}

}
