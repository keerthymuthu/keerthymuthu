package com.TestQA;

import java.util.Scanner;

public class StringConvert {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input ?");
        String input=scanner.nextLine();
        String output="";
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch>=97 && ch<=122){
                ch= (char) (ch-32);
                output+=ch;
            }
            else
                output+=ch;
        }
        System.out.println("Output: "+output);
    }

}
