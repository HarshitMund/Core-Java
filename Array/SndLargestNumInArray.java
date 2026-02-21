package com.rays.basic;

import java.util.Scanner;

public class SndLargestNumInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter the numbers in the array:");
		for(int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
		
		int large = 0, sndLarge = 0;
		
		for(int i : a) {
			if( i > large) {
				sndLarge = large;
				large = i;
			}
			if( i > sndLarge && i != large) {
				sndLarge = i;
			}
		}
		
		System.out.println("Second largest number in the array is " + sndLarge);
		sc.close();

	}

}
