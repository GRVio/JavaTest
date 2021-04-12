package com.zzkjzy.javase.teach.class10;

import java.util.Scanner;

/**
 * 大伟请假
 */
public class Demo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("请输入：");
        String s1 = s.next();

        String s2 = "你好";
        System.out.println(s1 == s2);
        // 因为s2是固定存在的变量，因此使用s2.equals，防止出现空指针异常
        System.out.println(s2.equals(s1));
    }
}
