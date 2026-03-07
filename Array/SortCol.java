/* 
			1 2 3		1 2 3
			7 8 9  =>	4 5 6
			4 5 6		7 8 9
*/		

package com.rays.array;

import java.util.Scanner;

public class SortCol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[10][10];
		
		System.out.println("Enter the order of matrix");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		System.out.println("Enter the elements of matrix");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++)
				a[i][j] = sc.nextInt();
		}
		
		int temp;
		for(int i = 0; i < row - 1; i++) {
			for(int j = 0; j < col - 1; j++) {
				if(a[i][j] > a[i + 1][j]) {
					temp = a[i][j];
					a[i][j] = a[i + 1][j];
					a[i + 1][j] = temp;
				}
			}
		}
		
		for(int i = 0;i < row; i++){
			for(int j = 0;j < col; j++)
				System.out.print(a[i][j] + " ");
			System.out.println("");
		}
		
		sc.close();

	}

}
