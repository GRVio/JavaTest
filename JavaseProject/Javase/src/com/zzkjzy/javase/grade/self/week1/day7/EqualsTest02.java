package com.zzkjzy.javase.grade.self.week1.day7;

import java.util.Objects;

/**
 * 经典白学：
 *      IDEA自动生成toString()、equals()方法
 */

public class EqualsTest02 {

    public static void main(String[] args) {
        MyTime02 m2 = new MyTime02(2002,1,1);
        System.out.println(m2.toString());
    }
}

class MyTime02{

    private int year;
    private int month;
    private int day;

    // 构造方法

    public MyTime02() {
    }

    public MyTime02(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // setter and getter

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // rewrite toString()

    @Override
    public String toString() {
        return "MyTime02{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    // rewrite equals()

    @Override
    public boolean equals(Object o) {

        // if语句只有一行时，可以省略大括号
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTime02 myTime02 = (MyTime02) o;
        return year == myTime02.year &&
                month == myTime02.month &&
                day == myTime02.day;
    }
}
