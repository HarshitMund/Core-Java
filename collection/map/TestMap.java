package com.rays.collection.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		Map m = new HashMap();

		m.put(1, "One");
		m.put(2, "Two");
		m.put("Three", 3);
		m.put(null, "null Value");

		System.out.println(m);
		System.out.println(m.get(2));
		System.out.println(m.entrySet());
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.containsKey("Three"));
		System.out.println(m.containsValue(4));
	}

}
