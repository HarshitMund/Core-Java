package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet(5, "Pratik", 70, 80, 91);
		Marksheet m2 = new Marksheet(2, "Ashu", 50, 60, 64);
		Marksheet m3 = new Marksheet(1, "Khushi", 75, 64, 79);
		Marksheet m4 = new Marksheet(3, "Payal", 65, 61, 70);
		Marksheet m5 = new Marksheet(4, "Dev", 45, 53, 41);
		
		List<Marksheet> list = new ArrayList<Marksheet>();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		for(Object o : list)
			System.out.println(o);
		
		System.out.println("----------------------------------------------");
		
		Collections.sort(list);
		
		for(Object o : list)
			System.out.println(o);
		
	}

}
