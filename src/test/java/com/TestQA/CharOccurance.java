package com.TestQA;

import java.util.HashMap;
import java.util.Map;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to automation";
		char[] char_array=str.toCharArray();
		Map<Character,Integer> charCounter=new HashMap<Character,Integer>();
		for(char ch:char_array) {
			if(charCounter.containsKey(ch)) 
				charCounter.put(ch, charCounter.get(ch)+1);
			else
				charCounter.put(ch,1);
		}
		System.out.println(charCounter);
	}
}