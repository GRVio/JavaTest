package com.zzkjzy.javase.grade.self.week1.day15.homework;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {

        // 开始注册
        try {
            Register.start();
        } catch (UserNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
