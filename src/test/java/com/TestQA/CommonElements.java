package com.TestQA;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {

    public static void main(String[] args){
        int[] arr1 = {3,2,11,4,6,7};
        int[] arr2 = {1,2,8,4,9};

        List<Integer> firstList=new ArrayList<Integer>();
        List<Integer> secondList=new ArrayList<Integer>();
        for(int i=0;i<arr1.length;i++)
            firstList.add(arr1[i]);
        for(int i=0;i<arr2.length;i++)
            secondList.add(arr2[i]);
        firstList.retainAll(secondList);
        System.out.println(firstList);

    }

}
