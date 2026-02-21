package com.rays.basic;

public class SumOfEvenOddInArray {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4, 5, 6, 9, 8, 12};
		
		int oddSum = 0, evenSum = 0;
		for(int i : a) {
			if(i % 2 == 0) 
				evenSum += i;
			else
				oddSum += i;
		}
		
		for(int i: a) 
			System.out.print(i + " ");
		
		System.out.println();
		System.out.println("Sum of odd numbers in the array is : " + oddSum);
		System.out.println("Sum of even numbers in the array is : " + evenSum);
	}

}
