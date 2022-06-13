package com.TestQA;

import java.util.HashMap;
import java.util.Map;

public class OccuChar {

    public static void main(String[] args) {
        String str = "welcome to automation";
        char[] ch=str.toCharArray();
        Map<Character,Integer> counter=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            if(counter.containsKey(ch[i]))
                counter.put(ch[i],counter.get(ch[i])+1);
            else
                counter.put(ch[i],1);
        }
        for(Map.Entry<Character,Integer> entry:counter.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}