package com.TestQA;

import java.util.Arrays;

public class Duplicate_Int {

    public static void main(String[] args){
        int[] data= {1,3,8,3,11,5,6,4,7,6,7};
        Arrays.sort(data);
        for(int i=0;i<data.length-1;i++){
            if(data[i]==data[i+1]){
                System.out.println(data[i]);
            }
        }
    }
}