package com.zzkjzy.javase.grade.self.week1.day9;

public class ArrayTest03 {
    public static void main(String[] args) {

        // 传入一个静态数组
        int[] a1 = {1,2,3};
        printArray(a1);

        // 直接传入静态数组
        printArray(new int[]{3,2,1});

        // 传入一个动态数组
        int[] a2 = new int[5];
        printArray(a2);

        // 直接传入动态数组
        printArray(new int[8]);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
