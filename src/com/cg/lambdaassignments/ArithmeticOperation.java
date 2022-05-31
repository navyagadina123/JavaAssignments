package com.cg.lambdassignment;

@FunctionalInterface
interface Arithmetic{
	int operations(int a, int b);
	
}
public class ArithmeticOperation {

	public static void main(String[] args) {
	
		/*Arithmetic add=new Arithmetic();
		  @Override
		   public int operations(int a,int b){
		   return a+b;
		   }
		 */
		//addition operation
		Arithmetic add=( a, b)-> (a+b);
		System.out.println("Addition:"+add.operations(10, 20));
		
		//subtraction
		Arithmetic sub=(a,b)->(a-b);
		System.out.println("Subtraction:"+sub.operations(30, 10));
		
		//multipication
		Arithmetic mul=(a,b)->(a*b);
		System.out.println("Multiply:"+mul.operations(5, 4));
		
		//division
		Arithmetic div=(a,b)->(a/b);
		System.out.println("division:"+div.operations(51, 3));
		
	}

}
