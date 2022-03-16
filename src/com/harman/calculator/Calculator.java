package com.harman.calculator;

public class Calculator {

    public static void main(String[] args) {
        Substraction subc= new Substraction();
        int a=5,b=6,c;
        c= a+b;
        System.out.println(c);

        int result=subc.sub(a,b);
        System.out.println(result);

    }
}
