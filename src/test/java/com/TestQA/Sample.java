package com.TestQA;

import java.util.Scanner;

public class Sample {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Result:");
        System.out.println("--------");
        String alp=s.replaceAll("[^a-zA-Z]","");
        String digit=s.replaceAll("[^0-9]","");
        System.out.println(digit);
    }
}