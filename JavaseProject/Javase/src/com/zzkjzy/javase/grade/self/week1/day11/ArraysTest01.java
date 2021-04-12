package com.zzkjzy.javase.grade.self.week1.day11;

import java.util.Arrays;

/**
 * 使用SUN公司提供的数组工具类：java.util.Arrays；
 */

public class ArraysTest01 {
    public static void main(String[] args) {

        int[] arrays = {12,312,413,42,21,1,34};

        // 对数组进行排序
        Arrays.sort(arrays);

        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
}
