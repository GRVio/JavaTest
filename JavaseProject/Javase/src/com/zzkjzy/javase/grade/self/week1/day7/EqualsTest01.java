package com.zzkjzy.javase.grade.self.week1.day7;

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

public class EqualsTest01 {
    public static void main(String[] args) {

        MyTime m1 = new MyTime(2002,1,1);
        MyTime m2 = new MyTime(2002,1,1);
        MyTime m3 = null;

        // 判断两个对象地址是否相等
        // System.out.println(m1 == m2);

        // 重写equals方法前：false
        // 重写equals方法后：true
        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));
    }
}

class MyTime{

    int year;
    int month;
    int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

/*
    此代码写法有bug，当对象为null时，会出现空指针异常
    在转型之前，先使用if语句进行判断，若为null，直接返回false

    且此方法效率不高，使用了多个if判断，可以将代码简化：
        例如：
        在使用if语句判断日期是否相等时，可以直接将if语句删去，直接return if中的条件
        因为逻辑运算符在判断不止可以连接条件，还会返回一个布尔值
        在向下转型时，使用instanceof进行判断。可以将与null的判断使用逻辑运算符链接

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
        if (year1 == year2 && month1 == month2 && day1 == day2){
            return true;
        }
        else return false;
    }
*/

    // 个人认为null的判断比较多余---经验证，不多余
    // 重写equals方法 -杜老师改版
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof MyDate)){
            return false;
        }
        if (this == obj){
            return true;
        }
        MyDate m = (MyDate) obj;
        return this.year == m.year && this.month == m.month && this.day == m.day;
    }
}
