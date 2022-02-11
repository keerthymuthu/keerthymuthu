package com.TestQA;

public class CharOccuranceWayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to automation";
		char[] char_array=str.toCharArray();
		char ch='o';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(ch==str.charAt(i)) {
				count++;
			}
		}
		System.out.println("o occurs "+count+" times");
	}

}
