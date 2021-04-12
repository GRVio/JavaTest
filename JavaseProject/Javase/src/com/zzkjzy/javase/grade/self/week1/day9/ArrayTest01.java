package com.zzkjzy.javase.grade.self.week1.day9;

/**
 * 数组：
 *      如何声明一个数组？
 *          int[] array1;
 *          String[] array2;
 */

public class ArrayTest01 {

    public static void main(String[] args) {
        // 静态初始化数组
        int[] a = {1,213,5,2,1654,5132};

        // 数组的length属性
        System.out.println(a.length);

        // 对数组中元素进行存取
        // 读取
        System.out.println("第一个元素是：" + a[0]);
        System.out.println("最后一个元素是：" + a[a.length-1]);
        // 存放/修改
        a[0] = 0;
        a[a.length-1] = 114514;
        System.out.println("第一个元素是：" + a[0]);
        System.out.println("最后一个元素是：" + a[a.length-1]);

        // 遍历数组-for循环
        // 直接进行倒序遍历，因为容易出错
        // 注意：i最大不能大于 a.length-1 否则会出错：
        // 下标越界异常：ArrayIndexOutOfBoundsException
        for (int i = a.length - 1;i >= 0;i--){
            System.out.print(a[i] + "   ");
            System.out.println();
        }

    }
}
