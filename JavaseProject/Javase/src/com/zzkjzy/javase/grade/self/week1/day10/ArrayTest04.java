package com.zzkjzy.javase.grade.self.week1.day10;

/**
 * 创建参数为二维数组的方法
 */

public class ArrayTest04 {
    public static void main(String[] args) {
        // 静态初始化
        int[][] a1 = {{1,2,3,4}, {12,23,34,45}, {123,234,345}};
        printArray(a1);

        // 没有这种语法：
        //printArray({{1,2,3,4}, {12,23,34,45}, {123,234,345}});z1

        // 若想省略，使用以下语法：
        printArray(new int[][]{{1,2,3,4}, {12,23,34,45}, {123,234,345}});

    }

    public static void printArray(int[][] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
