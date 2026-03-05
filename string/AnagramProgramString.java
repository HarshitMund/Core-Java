package com.rays.string;

public class AnagramProgramString {

	public static void main(String[] args) {
		String name = "ray";
		String anagramName = "";
		
		for(int i = name.length() - 1; i >= 0; i--) 
			anagramName += name.charAt(i);

		System.out.println(anagramName);

	}

}
