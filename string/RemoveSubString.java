package com.rays.string;

public class RemoveSubString {

	public static void main(String[] args) {
		String s = "Welcome to Rays Tech";
		String s1 = "Rays";
		
		String str[] = s.split(" ");
		String a = "";
		
		for(int i = 0; i < str.length; i++) {
			
			if (str[i].equals(s1))
				continue;
			else
				a = a + " " + str[i];
		}
		
		System.out.println(a);


	}

}
