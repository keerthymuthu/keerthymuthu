package com.TestQA;

import java.util.Scanner;

public class FindAllPrThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String: ");
		Scanner sc=new Scanner(System.in);
		String test=sc.nextLine();
		String alp=test.replaceAll("[^a-zA-Z]", "");
		System.out.println(alp);
		String onlyNumber=test.replaceAll("[^0-9]", "");
		System.out.println(onlyNumber);
		String specialChar=test.replaceAll("[a-zA-Z0-9 ]", "");
		System.out.println(specialChar);
	}

}
