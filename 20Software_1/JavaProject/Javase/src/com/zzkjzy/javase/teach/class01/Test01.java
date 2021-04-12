package com.zzkjzy.javase.teach.class01;

/**
 * equals:
 *      1、源代码：
 *      public boolean equals(Object obj) {
 *          return (this == obj);
 *      }
 *      2、Sun公司设计equals的目的是什么？
 *      判断两个对象是否相等
 *      3、判断两个Java对象是否相等，不能使用“==”。因为“==”比较的是两个对象的内存地址。
 *      4、equals方法的默认实现，就是使用“==”去判断两个对象是否相等。
 *        而我们需要判断两个对象的内容是否相等。所以，要对equals方法进行重写。
 */

public class Test01 {
    public static void main(String[] args) {

        MyTime m1 = new MyTime(2002,1,1);
        MyTime m2 = new MyTime(2002,1,1);

        // 判断两个对象地址是否相等
        // System.out.println(m1 == m2);

        // 重写equals方法前：false
        // 重写equals方法后：true
        System.out.println(m1.equals(m2));
    }
}

class MyTime{

    int year;
    int month;
    int day;

    // 重写Object类中的equals方法
    public boolean equals(Object obj){

        // 第一个类的日期
        int year1 = this.year;
        int month1 = this.month;
        int day1 = this.day;

        // 向下转型第二个类
        MyTime m = (MyTime)obj;

        // 第二个类的日期
        int year2 = m.year;
        int month2 = m.month;
        int day2 = m.day;

        // 比较
        if (year1 == year2){
            if(month1 == month2){
                if (day1 == day2){
                    return true;
                }
                else return false;
            }
            else return false;
        }
        else return false;
    }

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
