package com.zzkjzy.javase.grade.self.week1.day10;

public class ArrayTest01 {
    public static void main(String[] args) {

        // 一维数组
        int[] i = {1,2,3};
        System.out.println(i.length);


        // 二维数组
        int[][] ii ={
                {1,2,3},
                {10,20,30},
                {100,200,300}
        };

        // 二维数组的长度
        System.out.println(ii.length);

        // 二维数组中一维数组的长度
        System.out.println(ii[0].length);


        // 三维数组
        int[][][] iii = {
                {
                        {123,321},
                        {1,2,23}
                },
                {
                        {312,31234},
                        {3124,42353}
                }
        };
        System.out.println(iii.length);
    }
}
