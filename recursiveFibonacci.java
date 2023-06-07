package com.example.Java101;

public class recursiveFibonacci {
    public static int isFibonacci(int a){
        if(a==1 || a==2)
            return 1;
        else
            return isFibonacci(a-1)+isFibonacci(a-2);

    }
    public static void main(String[] args){
        System.out.println(isFibonacci(2));
    }
}
