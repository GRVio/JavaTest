package com.zzkjzy.javase.grade.self.week1.day11;

/**
 * 冒泡排序算法：
 *  如何实现冒泡排序算法？
 *      冒泡排序的本质实际上是循环与比较
 *      说到循环，for循环无疑是最好的选择，比较部分则使用if语句
 *      
 *      由于冒泡排序需要在一次循环中进行多次比较，且又需要多次循环
 *      因此使用for循环嵌套来实现这种算法。
 */
public class BubbleTest01 {
    public static void main(String[] args) {
        
        // 定义一个数组
        int[] array = {9,4,1,5,8};
        
        // 冒泡排序算法
        
        // 第一个for循环代表需要进行循环的次数
        /*
            为什么此处i要使用倒序？
            因为i正序倒序没有意义，第一个循环只代表循环次数
            只要循环次数满足即可，而为了方便后续比较时的代码编写，此处使用倒序更为合适
         */
        for (int i = array.length-1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                if (array[j]>array[j+1]){
                    // 进行位置交换
                    // 两个数据交换时，需要一个临时空间
                    // temp 临时的
                    int temp;
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

        // 遍历输出排序后的结果
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
