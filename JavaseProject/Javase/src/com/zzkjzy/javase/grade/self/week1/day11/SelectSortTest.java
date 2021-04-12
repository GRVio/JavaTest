package com.zzkjzy.javase.grade.self.week1.day11;


/**
 * 选择排序算法：
 *  如何实现选择排序算法？
 *      选择排序算法的实质也是循环与比较
 *      但选择排序的比较，是每次都与这堆数据中‘最前面的’数据比较
 *      这个最前面不是array[0]，而是每次比较的，一个较为相对的‘最前面’
 *
 *      这个算法的难点不是最前面，而是如何找出最小值
 *      对于找最小值的方法：
 *      首先默认第一个值i为最小值，将其与后面的值逐一进行比对
 *      若有值比i还小，则将该值与i交换位置，然后再次进行对比
 *      如此往复，第一轮对比就结束了，此时最小值也被找出并排在第一位
 *
 */
public class SelectSortTest {
    public static void main(String[] args) {

        // 定义一个数组
        int[] array = {8,5,2,3,6,7,0};

        // 选择排序算法
        // 定义循环次数
        // 与冒泡排序不同，这里i是正序还是倒序是有意义的
        // i决定了最小值的下标
        for (int i = 0; i < array.length - 1; i++) {
            // 定义最小值的下标，默认为第一个元素
            /**
             * 此处出现失误：
             *      int min = array[i];
             *      错误将下标array定义成了第i个元素
             *      导致不断出现数组越界无法解决
             */
            int min = i;
            // j = i + 1；这样无论怎么样，都是后面的值与前面的值进行对比
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    // 直接将下标进行交换
                    min = j;
                }
            }

            // 此时，array[min]是最小的值，array[i]是最前面的值，在此基础上交换位置即可
            // 当min与i相等时，代表最初定义的最小值就是最小值
            // 当min与i不等时，代表最初定义的最小值并不是最小
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
