package com.rays.string;

public class CountAllCharOfString {

	public static void main(String[] args) {
		String str = "access";
		int[] a = new int[128];
		
		for(int i = 0; i < str.length(); i++) {
			a[(int)str.charAt(i)]++;
		}
		
		for(int i = 0; i < 128; i++) {
			if(a[i] != 0)
				System.out.println((char)i+ " - " + a[i]);
		}

	}

}
