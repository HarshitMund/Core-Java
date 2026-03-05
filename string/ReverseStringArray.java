package com.rays.string;

public class ReverseStringArray {

	public static void main(String[] args) {
		String s[] = {"abc", "def", "xyz", "pvr", "Let go to PVR"};
		
		for(int i = s.length - 1; i >= 0; i--)
			System.out.println(s[i]);

	}

}
