package com.zzkjzy.javase.grade.self.week1.day11;

/**
 * 二分法查找：
 *
 */
public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {55 ,27 ,66 ,62 ,6 ,1 ,12 ,31 ,38 ,10};

        int index = binarySearch(array,959);
        System.out.println("该元素的下标是：" + index);

    }

    /**
     * 二分法查找，使用while循环和if语句进行判断
     * @param array 被查找的数组
     * @param i     需要查找的变量
     * @return      变量的下标值，若为-1则代表该元素不存在
     */
    // 二分法查找
    public static int binarySearch(int[] array, int i) {

        // 开始下标
        int begin = 0;
        // 结束下标
        int end = array.length - 1;

        //  要将中间下标写进循环，因为中间下标会随着循环而不断变化，但begin 和 end不能改变
        while(begin <= end) {
            // 中间下标
            int mid = begin + end / 2;

            if (i == array[mid]) {
                return mid;
            }
            // 当i大于中间元素时，i在数组右边，即开始下标要改变为中间元素
            else if (i > array[mid]) {
                begin = mid + 1;
            }
            // 当i小于中间元素时，i在数组左边，即结束坐标要改为中间元素
            else if (i < array[i]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
