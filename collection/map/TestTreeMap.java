package com.rays.collection.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		
		SortedMap m = new TreeMap();

		m.put(1, "One");
		m.put(2, "Two");
//		m.put("Three", 3);

		System.out.println(m);

	}

}
