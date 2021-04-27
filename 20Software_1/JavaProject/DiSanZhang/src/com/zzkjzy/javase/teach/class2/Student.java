package com.zzkjzy.javase.teach.class2;

import java.util.Scanner;

/**
 * 学生类。
 * 投票，需要建一个投票方法
 */
public class Student {
    private String name;
    private int number;
    private int ticket;


    /**
     * 投票，为某个学生投一票
     * @param s 学生
     */
    public void vote(Student s){
        s.setTicket();
    }

    /**
     * 统计某个学生的票数
     * @return
     */
    public int reTicked(){
        return this.ticket;
    }

    public Student() {
    }

    public Student(String name, int number, int ticket) {
        this.name = name;
        this.number = number;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket() {
        this.ticket++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "学号为" + number + "的学生，票数为：" + ticket;
    }

}
