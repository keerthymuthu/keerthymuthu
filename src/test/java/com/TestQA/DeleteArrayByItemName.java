package com.TestQA;

import java.util.Scanner;

public class DeleteArrayByItemName {

    public static void main(String[] args){
        int loc=0;
        Scanner sc=new Scanner(System.in);
        int item=sc.nextInt();
        int a[]={10,20,30,4,50,60};
        int newArray[] =new int[a.length-1];
        for(int i=0;i<a.length;i++){
            if(item==a[i]){
                loc=i;
                break;
            }
        }
        for(int i=loc;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        for(int i=0;i<a.length-1;i++){
            newArray[i]=a[i];
        }
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+",");
        }
    }

}
