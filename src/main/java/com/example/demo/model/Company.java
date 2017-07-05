package com.example.demo.model;

import fj.data.List;

public class Company {
	private final List<Employee> emps;

	private final String name;

	public Company(List<Employee> emps, String name) {
		this.emps = emps;
		this.name = name;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public String getName() {
		return name;
	}
	
	
}
