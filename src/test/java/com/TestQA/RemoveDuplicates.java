package com.TestQA;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args){
        int array[]= {1,3,3,3,3,5,6,6,7,7,7};
        Arrays.sort(array);
        System.out.println("Length: "+array.length);
        for(int i=0;i<array.length-1;i++){
              if(array[i]==array[i+1])
                  System.out.println(array[i]);
        }
    }
}
