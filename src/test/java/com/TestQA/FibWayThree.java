package com.TestQA;

import java.util.Scanner;

public class FibWayThree {

    public static void main(String[] args){
        int a=0,b=1,n,sum=0;
        System.out.println("Enter a limit:");
        n=new Scanner(System.in).nextInt();
        while(n>0){
            System.out.print(a+",");
            sum=a+b;
            a=b;
            b=sum;
            n--;
        }
    }

}
