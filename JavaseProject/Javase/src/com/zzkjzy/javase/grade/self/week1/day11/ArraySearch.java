package com.zzkjzy.javase.grade.self.week1.day11;


/**
 * 数组的元素查找：
 *  数组元素查找有两种方式：
 *      1、一个一个找
 *      2、二分法查找，这个方式效率较高
 */
public class ArraySearch {
    public static void main(String[] args) {
/*
        // 定义一个数组
        int[] array = {23 ,76 ,71 ,6 ,8 ,30 ,26 ,78 ,77 ,7};

        // 查找某个元素
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 8){
                System.out.println("8元素的下标是" + i);
                return;
            }
        }

        System.out.println("该元素不存在!");

 */

        int[] array = {23 ,76 ,71 ,6 ,8 ,30 ,26 ,78 ,77 ,7};

        int index = find(array,6);
        System.out.println(index == -1? "该元素不存在":"该元素的下标是：" + index);
    }

    // 将以上程序抽象成方法
    // 思考传入的值：数组、需要的元素 返回值是下标 即int，不存在则返回-1

    /**
     * 从数组中检索某个元素的下标
     * @param a 被检索的数组
     * @param b 被检索的元素
     * @return  大于等于0时，代表该元素的下标；-1表示该元素不存在
     */
    public static int find(int[]a,int b){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b){
                return i;
            }
        }
        return -1;
    }
}
