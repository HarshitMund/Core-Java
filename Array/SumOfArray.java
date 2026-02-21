package com.rays.basic;

public class SumOfArray {
	public static void main(String[] args) {
		int[] table = {1,2,3,4,5};
		int sum =0 ;
		
		for(int i : table) {
			sum = sum + i;
		}
		
		System.out.println("The array is: ");
		for(int i : table) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("Sum of Array is " + sum);
	}
}
