package com.zzkjzy.javase.grade.self.week1.day9;

/**
 * 数组拷贝：
 *      System.arraycopy()
 *      注意：引用类型数组拷贝的是对象的内存地址
 */

public class ArrayTest07 {
    public static void main(String[] args) {

        // 基本数据类型数组
        // 源数组
        int[] array = {21,43,12341,5,42};
        // 目标数组
        int[] newArray = new int[15];
        // 拷贝
        System.arraycopy(array,0,newArray,2,array.length);

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

        System.out.println("=====================================");

        // 引用数据类型数组
        String[] strings = {"hello","niHao","Java","String"};
        String[] newStrings = new String[10];
        System.arraycopy(strings,0,newStrings,0,strings.length);
        for (int i = 0; i < newStrings.length; i++) {
            System.out.println(newStrings[i]);
        }
    }
}
