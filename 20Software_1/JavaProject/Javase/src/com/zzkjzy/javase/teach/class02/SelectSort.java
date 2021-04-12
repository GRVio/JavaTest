package com.zzkjzy.javase.teach.class02;

/**
 * 选择排序算法:
 *
 */
public class SelectSort {
    public static void main(String[] args) {

        // 定义一个数组
        int[] array = {9 ,28 ,55 ,34 ,67 ,42 ,95 ,70 ,80 ,19};
        // 排序算法
        for (int i = 0; i < array.length - 1 ; i++) {
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]){
                    min = j;
                }
            }
            // 此时min为最小值，i为第一个值
            // 最小值不为第一个值
            if (min != i){
                int temp;
                temp = array[min];
               array[min] = array[i];
               array[i] = temp;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
