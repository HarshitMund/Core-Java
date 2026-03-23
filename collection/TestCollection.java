package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("Hello");
		c.add('a');
		c.add(123);
		c.add(5.4);
		c.add(false);
		
		System.out.println(c.size());
		System.out.println(c);
		System.out.println(c.isEmpty());
		System.out.println(c.contains('a'));
		c.remove(123);
		System.out.println(c);
		c.clear();
		System.out.println(c.size());

	}

}
