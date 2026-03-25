package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Dev", "Bhubaneshwer");
		Student s2 = new Student(2, "Prateek", "Khariar");
		Student s3 = new Student(3, "Sai", "Hyd");
		Student s4 = new Student(4, "Raghav", "Hyd");
		Student s5 = new Student(5, "Ashu", "Pune");
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		for(Object o : list)
			System.out.println(o);

	}

}
