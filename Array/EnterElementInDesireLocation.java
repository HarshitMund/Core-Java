package com.rays.basic;

import java.util.Scanner;

public class EnterElementInDesireLocation {

	public static void main(String[] args) {
		int a[] = new int[20];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the size of the array");
		int size = sc.nextInt();
		System.out.println("Please enter the elements of the array");
		for(int i = 0; i < size; i++)
			a[i] = sc.nextInt();
		
		System.out.println("Please enter the number you want to add in the array");
		int ele = sc.nextInt();
		System.out.println("Please enter the location where you want to add the number in the array");
		int pos = sc.nextInt();
		
		for(int i = size - 1; i >= pos - 1; i--) {
			a[i+1] = a[i];
		}
		
		a[pos-1] = ele;
		
		for(int i = 0; i <= size; i++)
			System.out.print(a[i] + " ");
		
		sc.close();
	}

}
