package com.rays.string;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Harshit");
		System.out.println(sb);
		
		sb.append(" Mund");
		System.out.println(sb);
		
		System.out.println("Length: " + sb.length());
		System.out.println("Capacity: " + sb.capacity());
		System.out.println("Char at 5: " + sb.charAt(5));
		System.out.println("Index of 'und': " + sb.indexOf("und"));
		System.out.println("Replace: " + sb.replace(3, 7, "dik"));
		System.out.println("Reverse: " + sb.reverse());
	}

}
