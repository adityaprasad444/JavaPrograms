package com.java.programs;

public class ReverseStringLetters {

	public static void main(String[] args) {
		
		String s="String to Reverse";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reversed String is :");
		System.out.println(rev);
		
	}

}
