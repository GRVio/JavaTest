package com.zzkjzy.javase.grade.self.week1.day10;

/**
 * 遍历二维数组
 */

public class ArrayTest03 {
    public static void main(String[] args) {

        int[][] a = {
                {11,12,13},
                {21,22,23},
                {31,32,33}
        };

        for (int i = 0; i < a.length; i++) {
            int[] a1 = a[i];
            for (int j = 0; j < a1.length; j++) {
                int a2 = a1[j];
                System.out.print(a2 + " ");
            }
            System.out.println();
        }
    }
}
