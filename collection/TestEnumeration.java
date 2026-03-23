package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement("Ram");
		v.addElement(45);

		System.out.println("Vector: " + v);

		System.out.println("--------------");

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}

		System.out.println("--------------");
		System.out.println("Vector: " + v);

	}

}
