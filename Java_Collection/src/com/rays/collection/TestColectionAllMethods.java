package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestColectionAllMethods {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add("Hello");
		c1.add('a');
		c1.add(123);
		c1.add(5.4);
		c1.add(false);

		System.out.println("Size of c1: " + c1.size());
		System.out.println(c1);

		System.out.println("-------------------------");

		Collection c2 = new ArrayList();

		c2.add("World");
		c2.add('b');
		c2.add(true);

		System.out.println(c2.size());
		System.out.println(c2);
		
		System.out.println("-------------------------");
		
		c1.addAll(c2);
		System.out.println(c1.size());
		System.out.println(c1);
		System.out.println(c1.containsAll(c2));
		System.out.println(c1.removeAll(c2));
		System.out.println(c1);
		
	}

}
