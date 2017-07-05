package com.example.demo.model;

public class IsUppercase {
	public int getSalary(Employee e) {
		return e.getSalary();
	}
	
	public boolean isNegative(int num) {
		return num < 0;
	}
	
	public boolean isAbove50000(Employee e) {
		return e.getSalary() > 50000;
	}
	public String getName(Employee e) {
		return e.getId();
	}
	
	public void printIt(Object o) {
		System.out.println("Got: " + o);
	}
 }
