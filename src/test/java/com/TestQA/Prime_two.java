package com.TestQA;

public class Prime_two {

    public static void main(String[] args){
        int n=19;
        boolean flag=false;
        for (int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                flag=true;
                System.out.println(n+ " is a non-prime number");
                break;
            }
        }
        if(flag==false)
            System.out.println(n+ " is a prime number");

    }

}
