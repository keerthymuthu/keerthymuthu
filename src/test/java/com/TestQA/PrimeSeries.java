package com.TestQA;

public class PrimeSeries {

    public static void main(String[] args){
        int n=31;
        int temp = 0;
        int total = 0;
        for(int i=1;i<=n;i++){
            temp=0;
            for(int j=2;j<=i-1;j++){
                if(i%j==0) {
                    temp+=1;
                    break;
                }

            }
            if (temp == 0) {
                System.out.print(i + " ");
                total = total + 1;
            }
        }
        System.out.println();
        System.out.println("Total Prime Number between 1 to " + n + " is " + total);
    }
}