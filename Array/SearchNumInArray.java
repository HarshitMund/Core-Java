package com.rays.basic;

import java.util.Scanner;

public class SearchNumInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println("Please enter the number you want to search in the array");
		int n = sc.nextInt();
		
		int first = 0;
		int last = a.length - 1;
		int position = -1;
		while(first <= last) {
			int mid = (last + first) / 2;
			
			if(a[mid] == n) {
				position = mid;
				break;
			}
			else if(n > a[mid])
				last = mid - 1;
			
			else 
				first = mid + 1;
		}
		 if(position == -1)
			 System.out.println("-1 enter number is not in the array");
		 else
			 System.out.println("Index of the entered number is " + position);
		 
		 sc.close();

	}

}
