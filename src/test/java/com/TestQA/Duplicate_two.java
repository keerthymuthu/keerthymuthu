package com.TestQA;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_two {

    public static void main(String[] args){
        int[] data= {1,3,8,3,11,5,6,4,7,7,7};
        Map<Integer,Integer> duplicate=new HashMap<Integer, Integer>();
        for(int i=0;i<data.length;i++){
            if(duplicate.containsKey(data[i]))
                duplicate.put(data[i],duplicate.get(data[i])+1);
            else
                duplicate.put(data[i],1);
        }
        for(Map.Entry<Integer,Integer> count:duplicate.entrySet()){
            if(count.getValue()>1)
                System.out.println(count.getKey()+":"+count.getValue());
        }
    }

}
