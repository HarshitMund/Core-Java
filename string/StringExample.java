package com.rays.string;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String username = sc.nextLine();
		System.out.println(username);
		
		String name = "Harshit Mund harshit";
		System.out.println(name);
		
		System.out.println("Length of the string: " + name.length());
		System.out.println("5th character of the string: " + name.charAt(4));
		System.out.println("First h position: " + name.indexOf('h'));
		System.out.println("Last h position: " + name.lastIndexOf('h'));
		System.out.println("Index of 'rsh' is: " + name.indexOf("rsh"));
		System.out.println("Last Index of 'rsh' is: " + name.lastIndexOf("rsh"));
		System.out.println("Replace h with a :" + name.replace('h', 'a'));
		System.out.println("Starting with Hars " + name.startsWith("Hars"));
		System.out.println("Ending with hit " + name.endsWith("hit"));
		System.out.println("Substring from Index 6: " + name.substring(6));
		System.out.println("Uppercase - " + name.toUpperCase());
		System.out.println("Lowercase - " + name.toLowerCase());
		
		sc.close();

	}

}
