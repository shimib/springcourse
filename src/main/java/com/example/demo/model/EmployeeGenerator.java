package com.example.demo.model;

import java.util.ArrayList;

import fj.data.List;

public class EmployeeGenerator {

	public Company genCompany() {
		List<Employee> emps = List.arrayList(new Employee("1", 90000),
				new Employee("2", 30000),
				new Employee("3", 40000),
				new Employee("4", 70000),
				new Employee("5", 80000));
		return new Company(emps, "boogle");
	}
	
	
	public  java.util.List<Employee> generateEmps() {
		java.util.List<Employee> result = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			result.add(new Employee("" + Math.random()*100000, (int) (Math.random()* 100000) - 50000));
		}
		return result;
	}
	
	
	
	
}
