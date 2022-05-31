package com.cg.generics;
public class Pair<Key,Value> {
	
	//Class if of Generic Type
			Key t;
			Value e;
		//Constructor which initializes the value
		public Pair(Key t,Value e)
		{
			this.t=t;
			this.e=e;
		}
		
		//Setters and Getters
		public void setKey(Key t) {
			this.t = t;
		}

		public void setValue(Value e) {
			this.e = e;
		}
		public static void main(String[] args) {
			//First Object
			Pair<String,String> pair=new Pair<String,String>("","");
			pair.setKey("1");
			pair.setValue("Hello");
			System.out.println(pair.toString());
			//Second Object
			Pair<String,String> pair1=new Pair<String,String>("","");
			pair1.setKey("Today is");
			pair1.setValue("new java.util.Date()");
			System.out.println(pair1.toString());
					
		}
		@Override
		public String toString() {
			return "Pair [t=" + t + ", e=" + e + "]";
		}

}

