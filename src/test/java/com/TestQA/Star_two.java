package com.TestQA;

import java.util.Scanner;

public class Star_two {

    public static void main(String[] args){
        System.out.println("Enter a limit:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n%2==0){
            System.out.println("Program Terminated!! Please enter an odd number.");
            System.exit(n);
        }

        for (int i=1;i<=n;i++){
            //System.out.print(" ");
            for(int k=i;k<n;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                //System.out.format("%4d", j);
                System.out.print(" "+j);
            }

            System.out.println();
        }

        for(int i=n-1;i>=1;i--)
        {
            //System.out.print(" ");
            for(int k=n;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                //System.out.format("%4d", j);
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }

}
