package com.base_demo_1;

import java.util.Scanner;

public class SwitchLearn {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("������1-3ѡ��");
        int num = scan.nextInt();
        switch (num){
            case 1 :
                System.out.println("��ѡ�������ǣ�1");
                break;
            case 2 :
                System.out.println("��ѡ��������ǣ�2");
                break;
            case 3:
                System.out.println("������������ǣ�3");
                break;
            default:
                System.out.println("����������ֲ�����Ҫ��");
        }
    }
}