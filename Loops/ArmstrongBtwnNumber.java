package com.rays.loops;

import java.util.Scanner;

public class ArmstrongBtwnNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n, i, temp1, temp2, count = 0, sum = 0, x, y, rem = 0;
		
		System.out.println("Enter a number");
		n = sc.nextInt();
		
		for(i = 1; i <= n; i++) {
			
			count = 0;
			sum = 0;
			temp1 = i;
			
			for( ;temp1 > 0; ) {
				
				temp1 = temp1 / 10;
				count++;
			}
			
			temp2 = i;
			for( ;temp2 > 0; ) {
				
				rem = temp2 % 10;
				x = 1;
				y = count;
				
				while(y>0) {
					
					x = x * rem;
					y--;
				}
				
				sum = sum + x;
				temp2 = temp2 / 10;
			}
			
			if(i == sum)
				System.out.print(i + " ");
		}

	}

}
