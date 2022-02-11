package com.TestQA;

import java.util.Arrays;
import java.util.List;

public class MissingElementLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] data = {3,2,1,4,6,7};
		int sum=0,max=0;
		List<Integer> inte=Arrays.asList(data);
		for(int n:inte) {
			sum+=n;
			if(n>max)
				max=n;
		}
		System.out.println(((max*(max+1)/2)-sum));
	}

}
