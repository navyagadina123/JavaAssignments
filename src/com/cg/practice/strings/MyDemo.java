package com.cg.practice.strings;

public class MyDemo {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("welcome");
		sb.append("home");
		sb.insert(7, "to");
		sb.replace(13,15,"world");
		sb.delete(7, 18);
		sb.reverse();
		System.out.println(sb);
		
		
		StringBuilder sbd= new StringBuilder("welcome");
		sbd.append("home");
		sbd.insert(7, "to");
		sbd.replace(13,15,"world");
     	sbd.delete(7, 18);
		sbd.reverse();
		System.out.println(sbd);


	}

}
