package com.zzkjzy.javase.grade.self.week1.day1;

public class Demo2 {

    public static void main(String[] args){

        MyDate md = new MyDate();
        System.out.println(md);
    }
}

class MyDate{
    
    private int year;
    private int month;
    private int day;

    // date
    public MyDate(){
        this(2021,2,16);
    }
    public MyDate(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }

    // setter and getter
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
}