package com.TestQA;

import java.util.Scanner;

public class FibNumberWayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit: ");
		n=sc.nextInt();
		while(n>0) {
			System.out.print(a+",");
			sum=a+b;
			a=b;
			b=sum;
			n--;
		}
	}

}
