package com.java.programs;

public class FindDuplicates {

	public static void main(String[] args) {
		
		String s="aditya";
		int count=0;
		char[] inp=s.toCharArray();
		System.out.println("Duplicate Chars are:");
		for (int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if (inp[i]==inp[j])
				{
					System.out.println(inp[j]);
					count++;
					System.out.println(count);
					break;
				}
			}
		}
	}

}
