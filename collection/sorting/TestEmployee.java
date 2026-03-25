package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Pratik", 3500);
		Employee e2 = new Employee(2, "Payal", 4000);
		Employee e3 = new Employee(3, "Khushi", 5000);
		Employee e4 = new Employee(4, "Dibyansh", 3500);
		Employee e5 = new Employee(5, "Hardik", 4500);
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		for(Object o : list) {
			System.out.println(o);
		}

	}

}
