package com.zzkjzy.javase.grade.self.week1.day8;

/**
 * 重写Object类中的finalize方法：
 *      此方法在java9+版本已经过时，但大多数还是java8
 *
 */

public class FinalizeTest01 {
    public static void main(String[] args) {

        /*for (long i = 1;i <= 10000000;i++){
            A1 a1 = new A1();
            a1 = null;
        }*/

        A1 a1 = new A1();
        a1 = null;

        System.gc();
    }
}

class A1{
    protected void finalize() throws Throwable {
        System.out.println("即将火化！");
    }
}
