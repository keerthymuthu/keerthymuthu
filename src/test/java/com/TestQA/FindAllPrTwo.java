package com.TestQA;

import java.util.Scanner;

public class FindAllPrTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int letter=0,digit=0,space=0,specialChar=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for (int i=0;i<s.length();i++) {
			if(ch[i]>=65 && ch[i]<=122) {
				if(ch[i]>=91 && ch[i]<=96)
					specialChar++;
				else
					letter++;
			}
			else if(ch[i]>=48 && ch[i]<=57)
				digit++;
			else if(ch[i]==32)
				space++;
		}
		System.out.println("Number of Letters: "+letter);
		System.out.println("Number of digits: "+digit);
		System.out.println("Number of Spaces: "+space);
		System.out.println("Number of Special Char: "+specialChar);
	}

}
