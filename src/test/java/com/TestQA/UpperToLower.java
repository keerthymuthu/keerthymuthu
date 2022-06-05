package com.TestQA;

import java.util.Scanner;

public class UpperToLower {

    public static void main(String[] args){
        System.out.println("Input ?");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String output="";
        for (int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch>=65 && ch<=90){
                ch= (char) (ch+32);
                output+=ch;
            }
            else
                output+=ch;
        }
        System.out.println(output);
    }

}
