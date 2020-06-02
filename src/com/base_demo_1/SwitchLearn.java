package com.base_demo_1;

import java.util.Scanner;

public class SwitchLearn {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入1-3选择");
        int num = scan.nextInt();
        switch (num){
            case 1 :
                System.out.println("您选择数字是：1");
                break;
            case 2 :
                System.out.println("您选择的数字是：2");
                break;
            case 3:
                System.out.println("您输入的数字是：3");
                break;
            default:
                System.out.println("你输入的数字不符合要求！");
        }
    }
}