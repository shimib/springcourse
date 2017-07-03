package com.example.demo.model;

public class Employee {
	private final String id;
	private final int salary;
	public Employee(String id, int salary) {
		this.id = id;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
	
	
}
