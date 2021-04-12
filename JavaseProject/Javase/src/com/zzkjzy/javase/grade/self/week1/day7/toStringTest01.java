package com.zzkjzy.javase.grade.self.week1.day7;

/**
 * toString()方法的使用与重写
 *      toString()方法应为：
 *      简洁的，详实的，易阅读的。
 *      所以，重写要朝着这个方向去写。
 *      当然，更重要的是贴合当前项目。
 */
public class toStringTest01 {

    public static void main(String[] args) {

        MyDate md = new MyDate();
        // 未重写方法前的输出：MyDate@4554617c
        // 重写方法后的输出：1970年1月1日
        System.out.println(md);     // 直接输出一个引用时，会默认调用toString()方法
        System.out.println(md.toString());
    }
}

class MyDate{

    int year = 1970;
    int month = 1;
    int day = 1;

    // 重写toString()方法
    public String toString(){
        return this.year + "年" + this.month + "月" + this.day + "日" ;
    }
    // 构造方法

    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

}
