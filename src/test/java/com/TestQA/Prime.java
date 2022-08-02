package com.TestQA;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=true;
                System.out.println(n+" is a non prime number");
                break;
            }
        }
        if(!flag)
            System.out.println(n+" is a prime number");

    }

}
