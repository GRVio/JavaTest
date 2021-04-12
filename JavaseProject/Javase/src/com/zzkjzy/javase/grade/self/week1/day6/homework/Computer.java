package com.zzkjzy.javase.grade.self.week1.day6.homework;

public class Computer {

    private InsertDrawable inter;

    // 接外设
    public void main(){
        getInter().doSome();
    }

    // 构造方法

    public Computer() {
    }

    public Computer(InsertDrawable inter) {
        this.inter = inter;
    }

    // setter and getter

    public InsertDrawable getInter() {
        return inter;
    }

    public void setInter(InsertDrawable inter) {
        this.inter = inter;
    }
}
