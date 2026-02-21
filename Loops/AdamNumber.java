package com.rays.basic;

public class AdamNumber {

	public static void main(String[] args) {
		int num = 104;
		int sqnum = num*num;
		
		int rnum = 0;
		while ( num > 0) {
			int a = num % 10;
			rnum = rnum * 10 + a;
			num = num / 10;
		}
		
		int rnumsq = rnum*rnum;
		int rrnumsq = 0;
		while ( rnumsq > 0) {
			int a = rnumsq % 10;
			rrnumsq = rrnumsq * 10 + a;
			rnumsq = rnumsq / 10;
		}
		
		if (sqnum == rrnumsq) {
			System.out.println("Is a Adam Number");
		}
		else {
			System.out.println("Not a Adam Number");
		}

	}

}
