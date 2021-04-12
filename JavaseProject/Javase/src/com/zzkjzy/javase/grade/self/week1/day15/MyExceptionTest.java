package com.zzkjzy.javase.grade.self.week1.day15;

/**
 * 自定义异常的使用测试
 */
public class MyExceptionTest {
    public static void main(String[] args) {

        MyException e = new MyException("刘智程是傻逼！！！");

        // 打印异常信息
        e.printStackTrace();
    }
}
