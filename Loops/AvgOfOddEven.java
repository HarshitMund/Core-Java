package com.rays.basic;

import java.util.Scanner;

public class AvgOfOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int oddSum = 0, evenSum = 0, oddCount = 0, evenCount = 0;
		for(int i = 1; i <= num; i += 2) {
			oddSum += i;
			oddCount++;
		}
		
		for(int i = 2; i <= num; i+= 2) {
			evenSum += i;
			evenCount++;
		}
		
		System.out.println("Average of Odd numbers is " + (oddSum/oddCount));
		System.out.println("Average of Even numbers is " + (evenSum/evenCount));
		
		sc.close();
	}

}
