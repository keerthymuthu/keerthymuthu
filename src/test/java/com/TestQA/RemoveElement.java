package com.TestQA;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args){
        int[] nums = {5,3,2,1,2,3};
        int target=3;
        int left=0;
        for (int right = 0; right < nums.length; right++)
            if(nums[right] != target)
                nums[left++] = nums[right];
        int[] newArray=Arrays.copyOf(nums,target);
        for(int i:newArray)
            System.out.print(i+"\t");
        }
    }
