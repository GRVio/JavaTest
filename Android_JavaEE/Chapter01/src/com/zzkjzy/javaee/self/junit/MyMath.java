package com.zzkjzy.javaee.self.junit;

/**
 * 需要被测试的类
 */
public class MyMath {
    // 加法

    @Deprecated
    public int plus(int a,int b){
        int c = a + b;
        return c;
    }

    public int add(int a, int b) {
        return a + b;
    }
    // 减法
    public int minus(int a,int b){
        return a - b;
    }
}
