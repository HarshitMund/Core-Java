package com.rays.string;

public class RemoveMultipleSpacesInString {

	public static void main(String[] args) {
		String s = "Hello   world!      How      are  you?";
		String s1 = "";
		char c;
		int i;
		
		for (i = 0; i < s.length(); i++) {
			
			c = s.charAt(i);
			
			if (c != ' ')
				s1 = s1 + c;
			else
			{
				if(s.charAt(i + 1) != ' ')
					s1 = s1 + c;
			}
		}
		
		System.out.print(s1);

	}

}
