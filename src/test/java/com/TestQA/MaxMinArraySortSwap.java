package com.TestQA;

public class MaxMinArraySortSwap {
	public static void main(String[] args) {
		int[] arr = {1, 45, 77, 88, 33, 23, 4};
		int max=arr[0];
		int min=arr[0];
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Maximum Number: "+max);
		System.out.println("Minumum Number: "+min);
	}
}