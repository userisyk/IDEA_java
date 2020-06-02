package com.base_demo_1;
import java.util.Arrays;
public class ArrayLearn {
    public static void main(String[] args) {
        //数组定义初始化1：
        int[] ns1 = new int[5];
        ns1[0] = 10;
        ns1[2] = 11;
        ns1[3] = 12;
        System.out.println(Arrays.toString(ns1));
        //数组初始化方式2：
        int[] ns2 = new int[]{20,21,22};
        System.out.println(ns2.length);
        System.out.println(Arrays.toString(ns2));
        //数组初始化方式3：
        int[] ns3 = {30,31,32};
        System.out.println(Arrays.toString(ns3));
        //数组一旦创建，大小不可改变，但是可以改变指向，引用类型
        ns2 =new int[]{7,8};
        System.out.println(ns2.length);
        System.out.println(Arrays.toString(ns2));
    }
}
