package com.zzkjzy.javase.grade.self.week1.day10;

/**
 * 取出二维数组中第一个一维数组中的第一个元素
 */
public class ArrayTest02 {
    public static void main(String[] args) {

        // 定义一个二维数组
        int a[][] = {
                {123,213,321},
                {1,2,3,4},
                {12,23,34,45,56}
        };

        // 取出该数组中的第一个一维数组的第一个元素
        // 第一个一维数组
        int a1[] = a[0];
        // 第一个元素
        int a2 = a1[0];
        System.out.println(a2);

        // 合并以上代码
        System.out.println(a[0][0]);
    }
}
