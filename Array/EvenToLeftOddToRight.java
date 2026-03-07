package com.rays.array;

public class EvenToLeftOddToRight {

	public static void main(String[] args) {
		
		int a[] = new int[] {11, 2, 3, -49, 5, 153, 121, 145, 28, 6, 3, 5, 11, -32};
		int min = 0, max = a.length - 1, temp;
		
		while(min < max) {
			
			while(a[min] % 2 == 0 && min < max)
				min++;
			
			while(a[max] % 2 != 0 && min < max)
				max--;
			
			if(min < max) {
				temp = a[min];
				a[min] = a[max];
				a[max] = temp;
			}
			
			min++;
			max--;
		}
				
		for(int ele : a)
			System.out.print(ele + " ");

	}

}
