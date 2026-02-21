package com.rays.basic;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int count = 0, sum = 0, temp = num, temp2 = num;

		while(temp > 0) {
			count++;
			temp = temp/10;
		}
		
		while(temp2 > 0) {
			int a = temp2 % 10;
			int b = 1;
			for(int i = 0; i < count; i++) {
				b=b*a;
			}
			sum = sum + b;
			temp2 = temp2/10;
		}
		
		if (num == sum) {
			System.out.println("Is a armstrong");
		}
		else {
			System.out.println("Not a armstrong");
		}
		
		sc.close();
	}

}
