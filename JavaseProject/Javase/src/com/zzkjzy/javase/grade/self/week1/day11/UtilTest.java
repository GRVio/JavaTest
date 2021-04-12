package com.zzkjzy.javase.grade.self.week1.day11;

import java.util.Arrays;

/**
 * 测试数组工具类
 *      注意：在调用方法进行二分法查找时
 *      如果查找一个重复出现的元素，返回给的下标是根据二分法查找的顺序决定的
 *      某种意义上说，是由数组长度决定的
 */
public class UtilTest {
    public static void main(String[] args) {
        // 定义一个数组
        int[] array = {68 ,7 ,29 ,58 ,42 ,4 ,30 ,96 ,77 ,99};

        // 调用数组工具类排序，idea会自动导包
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // 查找
        System.out.println(Arrays.binarySearch(array,68));
    }
}
