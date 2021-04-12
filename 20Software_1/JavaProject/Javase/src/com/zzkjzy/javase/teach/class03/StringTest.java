package com.zzkjzy.javase.teach.class03;

/**
 * String类常用的构造方法：
 *      String s = "";
 *      String s = new String("");
 *      String s = new String(char);
 *      String s = new String(char,int,int);
 *      String s = new String(byte);
 *      String s = new String(byte,int,int);
 */
public class StringTest {
    public static void main(String[] args) {

        // String(byte[])
        byte[] b = {97,98,99};//a ,b ,c     --对应的ASCII码
        String s = new String(b);
        System.out.println(s);

        // 参数解释：第一个代表byte数组，第二个代表元素下表的起始位置，第三个代表长度
        //String(byte[],int offset(偏移量),int length)
        String s1 = new String(b,1,2);
        System.out.println(s1);// bc

        // char  和byte一样
        char[] c = {'这','是','数','组'};
        String s2 = new String(c);
        System.out.println(s2);
        String s3 = new String(c,2,2);
        System.out.println(s3);
    }
}
