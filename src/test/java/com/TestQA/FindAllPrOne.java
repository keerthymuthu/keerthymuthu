package com.TestQA;

import java.util.Scanner;

public class FindAllPrOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for (int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i]))
				num++;
			else if(Character.isLetter(ch[i]))
				letter++;
			else if(Character.isSpaceChar(ch[i]))
				space++;
			else
				specialChar++;
		}
		System.out.println("Number of Digits: "+num);
		System.out.println("Number of Letters: "+letter);
		System.out.println("Number of Spaces: "+space);
		System.out.println("Number of Special Characters: "+specialChar);
}
}