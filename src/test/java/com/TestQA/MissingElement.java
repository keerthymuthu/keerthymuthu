package com.TestQA;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,1,4,6,7};
		int sum=0,max=0;
		for(int n:data) {
			sum+=n;
			if(n>max)
				max=n;
		}
		System.out.println((max*(max+1)/2)-sum);
	}
}
