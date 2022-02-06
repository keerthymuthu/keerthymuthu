package com.TestQA;

import java.util.Scanner;

public class ArmsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,input,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		input=sc.nextInt();
		n=input;
		while(n>0) {
			sum+=Math.pow(n%10, 3);
			n=n/10;
		}
		if(input==sum) {
			System.out.println("Armstrong number");
		}
		else
			System.out.println("Not an Armstrong number");
	}
}
