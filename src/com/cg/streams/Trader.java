package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class Trader {
  String name;
  String city;
public Trader(String name, String city) {
	super();
	this.name = name;
	this.city = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public static void main(String[] args) {
	List<Trader> list = Arrays.asList(new Trader("shashank", "Pune"), new Trader("Pranab", "Bangalore"),
			new Trader("Jayesh", "Pune"), new Trader("Pratik", "Delhi"));

	// Question 9
	list.stream().map(x -> x.city).distinct().forEach(System.out::println);

	System.out.println("==========================================");

	// Question 10
	list.stream().filter(x -> x.city.contains("Pune")).map(x -> x.name).sorted().forEach(System.out::println);

}
  
}
