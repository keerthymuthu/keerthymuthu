package com.TestQA;

public class MaxMinArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 45, 77, 88, 33, 23, 4};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Array Elements: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Largest Number: ");
		System.out.println(arr[arr.length-1]);
	}

}
