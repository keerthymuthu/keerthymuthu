package com.TestQA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayUnion {

    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5};
        List<Integer> arrayList=new ArrayList<Integer>();
        for(int i=0;i<arr1.length;i++){
            arrayList.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            arrayList.add(arr2[i]);
        }
        Set<Integer> newSet=new HashSet<Integer>(arrayList);
        System.out.println(newSet);
    }

}
