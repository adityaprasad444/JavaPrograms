package com.java.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesinString {

	public void findit(String str) {
		Map<Character,Integer> baseMap=new HashMap<Character,Integer>();
		char[] charArray=str.toCharArray();
		for (Character ch : charArray) {
			if(baseMap.containsKey(ch)) {
				baseMap.put(ch, baseMap.get(ch)+1);
				}
			else {
				baseMap.put(ch, 1);
				
			}
		}
		
		Set <Character>Keys =baseMap.keySet();
		for (Character ch:Keys) {
			if(baseMap.get(ch)>1)
			{
				System.out.println(ch+ " Is " +baseMap.get(ch)+ " Times");
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		FindDuplicatesinString dup=new FindDuplicatesinString();
		dup.findit("QA Testing QA");
	}

}
