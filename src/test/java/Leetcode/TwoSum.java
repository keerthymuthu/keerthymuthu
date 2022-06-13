package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSum {

    public static void main(String[] args){
        int[] num={3,2,4};
        int target=6;
        Set<Integer> indices=new HashSet<Integer>();
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                if(i!=j){
                    if(num[i]+num[j]==target){
                        indices.add(i);
                        indices.add(j);
                    }
                }
            }
        }
        System.out.println(indices);
    }

}
