package com.TestQA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};

		List<Integer> arrayList=new ArrayList<Integer>();
		for (int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					arrayList.add(arr2[j]);
				}
			}
		}
		Collections.sort(arrayList);
		for(int i=0;i<arrayList.size();i++) {
			System.out.print(arrayList.get(i)+"\t");
		}
	}

}
