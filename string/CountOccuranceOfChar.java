package com.rays.string;

import java.util.Arrays;

public class CountOccuranceOfChar {

	public static void main(String[] args) {
		String s1 = "abcabcabddee";
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);

        int count = 1;

        for (int i = 1; i < c1.length; i++) {

            if (c1[i] == c1[i - 1]) {
                count++;
            } else {
                System.out.println(c1[i - 1] + " = " + count);
                count = 1;
            }
        }

        System.out.println(c1[c1.length - 1] + " = " + count);

	}

}
