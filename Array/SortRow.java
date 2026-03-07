package com.rays.array;

import java.util.Scanner;

public class SortRow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[10][10];
		
		System.out.println("Enter the order of matrix");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		System.out.println("Enter the elements of array");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++)
				a[i][j] = sc.nextInt();
		}
		
		int temp;
		for(int i = 0; i < row - 1; i++) {
			for(int j = 0; j < col - 1; j++) {
				if(a[i][j + 1] < a[i][j]) {
					temp = a[i][j];
					a[i][j] = a[i][ j + 1];
					a[i][j + 1] = temp;
				}
			}
		}
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++)
				System.out.print(a[i][j] + " ");
			System.out.println("");
		}
		
		sc.close();
	}
}
