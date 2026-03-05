package com.rays.string;

import java.util.Arrays;

public class Check2StringAnagram {

	public static void main(String[] args) {
		String a = "ray";
		String b = "yar";
		
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(d);
		
		if(Arrays.equals(c, d)) 
			System.out.println(a + " & " + b + " are anagram");
		else
			System.out.println(a + "& " + b + " are not anagram");

	}

}
