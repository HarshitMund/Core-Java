package com.rays.basic;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int a[] = {3, 6, 4, 9, 19, 23};
		int b[] = {4, 19, 3, 9, 6};
		int aSum = 0, bSum = 0;
		for(int i = 0; i < 6; i++) {
			aSum += a[i];
		}
		for(int i = 0; i < 5; i++) {
			bSum += b[i];
		}
		
		System.out.println("The missing element in the 2nd array is " + (aSum-bSum));

	}

}
