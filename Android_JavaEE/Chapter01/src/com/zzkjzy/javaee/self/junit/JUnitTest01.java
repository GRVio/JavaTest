package com.zzkjzy.javaee.self.junit;

import java.util.Date;

/**
 * JUnit
 * 用于做单元测试的工具
 * 单元测试：测试某个类中的方法是否有错误。
 */
public class JUnitTest01 {
    public static void main(String[] args) {

        // 之前学习中测试一个类中方法
        MyMath mm = new MyMath();
        int a = mm.add(1,2);
        System.out.println(a);

    }
}


