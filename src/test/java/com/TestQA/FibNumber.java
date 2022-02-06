package com.TestQA;

import java.util.Scanner;

public class FibNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit: ");
		n=sc.nextInt();
		System.out.print(a+","+b);
		while(n>2) {
			sum=a+b;
			System.out.print(","+sum);
			a=b;
			b=sum;
			n--;
		}
	}

}
