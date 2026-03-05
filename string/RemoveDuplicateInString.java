package com.rays.string;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		String s = "abcdefabf";
		String s1 = "";
		int i, j;
		for(i = 0; i < s.length(); i++) {
			
			for(j = 1; j <= i; j++)
			{	
				if(s.charAt(i) == s.charAt(j))
					break;
			}
			if(i == j)
				s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);

	}

}
