package Leetcode;

import java.util.Arrays;

public class TwoDArray {

    public static void main(String[] args){
        int[][] boxTypes={{5,10},{2,5},{4,7},{3,9},{1,8}};
        int count=0;
        Arrays.sort(boxTypes,(a,b)->a[0]-b[0]);
        for(int[] b:boxTypes){
            System.out.println(b[0]+":"+b[1]);
        }
        //System.out.println(count);
    }

}
