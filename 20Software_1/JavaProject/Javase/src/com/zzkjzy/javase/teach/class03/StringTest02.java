package com.zzkjzy.javase.teach.class03;

/**
 * String类当中的方法:
 *
 */
public class StringTest02 {
    public static void main(String[] args) {

        // String.charAt(int index)     掌握
        // 返回字符串中的某个字符
        String s1 = "你好";
        System.out.println(s1.charAt(0));
        System.out.println("======================================");

        // String.compareTo(String)     了解
        // 比较两个字符串中第一个不同的字符在字典中的位置
        // 用前面的位置-后面的位置，返回差值，若相同则返回0
        String s2 = "这是一个字符串";
        String s3 = "这是一个字符串";
        int a = s2.compareTo(s3);
        System.out.println(s2.compareTo(s3));       // 前后一致 = 0
        System.out.println(s2.compareTo(s1));       // 前大后小 = 正数
        System.out.println(s1.compareTo(s2));       // 前小后大 = 负数
        System.out.println("======================================");

        // String.contains(String)      掌握
        // 判断前字符串是否包含后字符串
        String s4 = "Hello World!";
        String s5 = "World";
        boolean bool = s4.contains(s5);
        System.out.println(s4.contains(s5));
        System.out.println("======================================");

        // String.endsWith(String)       掌握
        // 判断当前字符串是否以某个字符串结尾
        String s6 = "begin,mid,end";
        String s7 = "end";
        boolean bool2 = s6.endsWith(s7);
        System.out.println(s6.endsWith(s7));
        System.out.println("======================================");

        // p436  6.26
    }
}
