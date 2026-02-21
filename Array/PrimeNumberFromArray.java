package com.rays.basic;

import java.util.Scanner;

public class PrimeNumberFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the size of the array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Please enter the element of the array: ");
		for(int i = 0; i < size; i++)
			a[i] = sc.nextInt();
		
		System.out.println("Prime Numbers in array are : ");
		for(int i : a) {
			int flag = 0;
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
	}
}
