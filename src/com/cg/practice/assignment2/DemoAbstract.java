package com.cg.practice.assignment2;

abstract class DemoClass{
	public void displayDemo() {
		System.out.println("This is concrete method");
	}
}
abstract class Demo{
	
	public abstract void display();
	
}
class ConcreteClass extends Demo {
	
    @Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}
}
public class DemoAbstract {

	public static void main(String[] args) {
		
		Demo demo=new Demo() {
			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("This is display method");
			}
		};
		
		//In Concrete class we can create object directly using new keyword
		ConcreteClass c=new ConcreteClass();
		c.display();
	}

}

