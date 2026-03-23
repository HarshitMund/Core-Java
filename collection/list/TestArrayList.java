package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

// List can store duplicate values
// List can store multiple null values
// List store in natural order
// ArrayList is used in fast searching

public class TestArrayList {

	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList();
		List list = new ArrayList();
		
//		list.add('a');
//		list.add('b');
//		list.add("Hello");
//		list.add(123);
//		list.add(1.3);
//		list.add(null);
//		list.add(true);
//		list.add(null);
//		list.add('a');
//		list.add("Hello");
		
		list.add(0, 'a');
		list.add(1, 'b');
		list.add(2, "Hello");
		list.add(3, 123);
		list.add(4, 1.3);
		list.add(5, null);
		list.add(6, true);
		list.add(7, null);
		list.add(8, 'a');
		list.add(9, "Hello");
		
		System.out.println(list);
		System.out.println(list.get(4)); //get 4th index element
		System.out.println(list.remove(1)); // remove 1st index element
		System.out.println(list);
		list.set(4, "qwe"); // replace the element of 4th index to "qwe"
		System.out.println(list);
		System.out.println(list.indexOf('a')); // search object from the start
		System.out.println(list.lastIndexOf('a')); // search object from the end
		System.out.println(list.subList(3, 8));
		
	}

}
