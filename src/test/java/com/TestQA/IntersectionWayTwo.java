package com.TestQA;

import java.util.ArrayList;
import java.util.List;

public class IntersectionWayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};

		List<Integer> firstList = new ArrayList<Integer>(); 
		for (int i : arr1)
			firstList.add(i);
	
		List<Integer> secondList = new ArrayList<Integer>(); 
		for (int i : arr2)
			secondList.add(i);
		firstList.retainAll(secondList);
		System.out.println(firstList);
	}

}
