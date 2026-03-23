package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add("Hello");
		list.add(123);
		list.add(1.3);
		list.add(null);
		list.add(true);
		list.add(null);
		list.add('a');
		list.add("Hello");
		
		System.out.println("List: " + list);
		System.out.println("---------------");
		
		Iterator i = list.iterator();
		
		while(i.hasNext()) {
			Object o = i.next();
			i.remove();
			System.out.println(o);
		}
		
		System.out.println("---------------");
		System.out.println("List: " + list);
		
	}

}
