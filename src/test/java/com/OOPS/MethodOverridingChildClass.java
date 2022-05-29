package com.OOPS;

public class MethodOverridingChildClass extends MethodOverridingParentClass{

    public void myMethod(){
        System.out.println("I am a method from Child Class");
    }

    public static void main(String [] args){
        MethodOverridingParentClass obj = new MethodOverridingChildClass();
        // It calls the child class method myMethod()
        obj.myMethod();
    }
}