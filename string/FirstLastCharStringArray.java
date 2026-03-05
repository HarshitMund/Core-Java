package com.rays.string;

public class FirstLastCharStringArray {

	public static void main(String[] args) {
		String s[]={"abc","def","xyz","pvr","Let go to PVR"};
		
		for(int i=0;i<s.length;i++)
			System.out.println(s[i].charAt(0)+" "+s[i].charAt(s[i].length()-1));
		

	}

}
