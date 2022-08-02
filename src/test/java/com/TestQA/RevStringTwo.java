package com.TestQA;

public class RevStringTwo {

    public static void main(String[] args){
        String input="input String";
        String output="";
        for(int i=1;i<=input.length();i++){
            output=output+input.charAt(input.length()-i);
        }
        System.out.println(output);
    }

}
