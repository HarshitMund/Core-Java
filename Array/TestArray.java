package com.rays.basic;

public class TestArray {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		
		System.out.println("Length of array a is " + a.length);
		System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[4]);
		System.out.println(a[0]+a[1]+a[2]-a[4]);
		
		System.out.println("-----------------------------");
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(i + " = " + a[i]);
		}
	}

}
