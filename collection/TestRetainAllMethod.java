package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAllMethod {

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

		Collection c3 = new ArrayList();

		c3.add("Hello");
		c3.add('a');
		c3.add(true);

		System.out.println("Size of c3: " + c3.size());
		System.out.println(c3);

		System.out.println(c1.retainAll(c3));
		System.out.println(c1);

	}

}
