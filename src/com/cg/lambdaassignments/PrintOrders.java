package com.cg.lambdassignment;

interface AcceptedCompleted
{
	void check(int a);
}
public class PrintOrders {

	public static void main(String[] args) {
		//Object of interface(OR) Function
		AcceptedCompleted acceptedcompleted=(int a)->
		{
			//Checking the condition
			if(a>10000)
			{
				System.out.println("Number "+a+" is ACCEPTED,COMPLETED.");
			}
			else
			{
				System.out.println("Number "+a+" is NOT  ACCEPTED.");
			}
		};
		//Calling the object reference function and passing value
		acceptedcompleted.check(10000);
		acceptedcompleted.check(12000);
	}

}

