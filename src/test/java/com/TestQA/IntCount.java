package com.TestQA;

import java.util.HashMap;
import java.util.Map;

public class IntCount {

    public static void main (String[] args){
        int sum=123123123;
        Map<Character,Integer> count=new HashMap<Character, Integer>();
        String strsum=Integer.toString(sum);
        System.out.println(strsum);
        char[] ch=strsum.toCharArray();
        for(char c:ch){
            if(count.containsKey(c))
                count.put(c,count.get(c)+1);
            else
                count.put(c,1);
        }
        for(Map.Entry<Character,Integer> entry:count.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }

}