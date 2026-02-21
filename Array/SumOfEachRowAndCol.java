package com.rays.basic;

import java.util.Scanner;

public class SumOfEachRowAndCol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the row number");
		int row = sc.nextInt();
		System.out.println("Please enter the column number");
		int col = sc.nextInt();
		
		int a[][] = new int[row][col];
		System.out.println("Please enter the elements for the array");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++)
				a[i][j] = sc.nextInt();
		}
		
		for(int i = 0; i < row; i++) {	
			for(int j = 0; j < col; j++) {
				System.out.print(a[i][j] + "\t");;
			}
			System.out.println();
		}
		
		System.out.println();
		
		int rowSum = 0, colSum = 0;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) 
				rowSum += a[i][j];
			System.out.println("Row " + (i+1) + " sum is: " + rowSum);
			rowSum = 0;
		}
		
		System.out.println();
		
		for(int j = 0; j < col; j++){
			for(int i = 0; i < row; i++)
				colSum += a[i][j];
			System.out.println("Col " + (j+1) + " sum is: " + colSum);
			colSum = 0;
		}
		
		sc.close();
	}

}
