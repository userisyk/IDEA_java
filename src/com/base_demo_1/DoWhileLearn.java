package com.base_demo_1;

public class DoWhileLearn {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        do{
            sum = sum + n;
            n ++;
        }while(n<=100);
        System.out.println(sum);
    }
}
