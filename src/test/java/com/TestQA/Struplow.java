package com.TestQA;

public class Struplow {

    public static void main(String[] args) {
        String s = "ABCDefghijkLMNOPqrstuvwxyz";
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=65 && ch[i]<=90){
                ch[i]= (char) (ch[i]+32);
            }
        }
        System.out.print(ch);
    }
}