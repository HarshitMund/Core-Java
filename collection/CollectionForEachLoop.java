package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionForEachLoop {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();

		c1.add("Hello");
		c1.add('a');
		c1.add(123);
		c1.add(5.4);
		c1.add(false);

		System.out.println("Size of c1: " + c1.size());
		System.out.println(c1);
		
		for(Object o : c1)
			System.out.println(o);

	}

}
