package com.java.programs;

public class ReverseWordsinString {

	public static void main(String[] args) {
		
		
		String[] s="I like Programming in Java".split(" ");
		String rev="";
		
		for (int i=s.length-1;i>=0;i--)
		{
			rev+=s[i]+" ";
		}
		System.out.print("Reversed String is:");
		System.out.println(rev.substring(0,rev.length()-1));
	}

}
