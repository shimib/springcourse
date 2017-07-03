package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeGenerator {

	public  List<Employee> generateEmps() {
		List<Employee> result = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			result.add(new Employee("" + Math.random()*100000, (int) (Math.random()* 100000) - 50000));
		}
		return result;
	}
	
	
	
	
}
