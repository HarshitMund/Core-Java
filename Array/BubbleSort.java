package com.rays.basic;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {3,1,6,3,7,1,5,2};
		
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = 0; j < a.length - 1 - i; j++) {
				if(a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
		for(int i : a)
			System.out.print(i + " ");

	}

}
