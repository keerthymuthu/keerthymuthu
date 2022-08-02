package com.TestQA;

import java.util.HashMap;
import java.util.Map;

public class IntCount_two {

    public static void main(String[] args){
        int n=153;
        int reminder;
        Map<Integer,Integer> count=new HashMap<Integer, Integer>();
        while(n>0){
            reminder=n%10;
            if(count.containsKey(reminder)){
                count.put(reminder,count.get(reminder)+1);
            }
            else
                count.put(reminder,1);
            n=n/10;
        }
        for (Map.Entry<Integer,Integer> entry:count.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}