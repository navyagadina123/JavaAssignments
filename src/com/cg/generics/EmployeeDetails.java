package com.cg.generics;
import java.util.HashSet;

class Employee
{
	//Declaring states
	int id;
	String name;
	double salary;
	String department;
	//parameterized constructor
	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	//Getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
}

public class EmployeeDetails {

	public static void main(String[] args) {
		
		//Passing Employee has argument
				HashSet<Employee> hashset=new HashSet<Employee>();
				hashset.add(new Employee(3,"Navya",3000000.0,"ECE"));
				//Retrieving genericType(Employee)
				for(Employee hs:hashset)
				{
					System.out.println(hs);
				}
			}

	}
