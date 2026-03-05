package com.rays.array;

public class NoteCounter {

	public static void main(String[] args) {
		int amount = 5730;
		
		int[] note = {2000, 500, 100, 50, 20, 10};
		
		for (int i = 0; i < note.length; i++) {

		    if (amount >= note[i]) {
		        int count = amount / note[i];
		        System.out.println(note[i] + " : " + count);
		        amount = amount % note[i];
		    }
		}

	}

}
