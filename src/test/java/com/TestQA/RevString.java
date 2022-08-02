package com.TestQA;

public class RevString {

    public static void main(String[] args){
        String input="input String";
        String output="";
        char[] chArray=input.toCharArray();
        for(int i=1;i<=chArray.length;i++){
            output=output+chArray[chArray.length-i];
        }
        System.out.println(output);

    }

}
