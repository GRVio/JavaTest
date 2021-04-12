package com.zzkjzy.javase.grade.self.week1.day14;

/**
 * 思考以下程序中divide方法的缺陷在哪里？
 */
public class EnumTest01 {
    public static void main(String[] args) {

        System.out.println(divide(10,2));   // 1
        System.out.println(divide(10,20));  // 1

        System.out.println(divideT(10,5));
        System.out.println(divideT(10,0));
    }

    /**
     * 进行除法运算
     * @param a 除数
     * @param b 被除数
     * @return  若返回值为1则运算成功，若返回值为0则运算失败
     */
    // 在编写过程中，我们可能会因为"手抖"而将返回值"1"错打成其他数字
    // 且这个方法不需要返回计算结果，只需要返回计算是否完成
    // 因此，这里我们可以使用布尔类型的返回值
    public static int divide(int a,int b){

        // 在数学中，除数不能为0
        // 因此在Java中当除数为0时，会出现异常
        // 此处是对异常的处理
        try {
            int c = a / b;
            return 1;
        }catch (Exception e){
            return 0;
        }
    }

    public static boolean divideT(int a,int b){

        try {
            int c = a / b;
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
