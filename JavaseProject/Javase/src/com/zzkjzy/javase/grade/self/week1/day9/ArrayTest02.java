package com.zzkjzy.javase.grade.self.week1.day9;

/**
 * 数组：
 *      main方法的[]和数组一样，可以写在args后面
 */

public class ArrayTest02 {
    public static void main(String args[]) {

        int[] array = {1,235,98456,54,6};
        doSome(array);

        String[] array2 = new String[10];
        doOther(array2);
    }


    public static void doSome(int[] a){
        System.out.println("你传入了一个数组");
    }
    public static void doOther(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
