package com.zzkjzy.javase.grade.self.week1.day2;

public class superTest04 {
    public static void main(String[] args){
        Vip v = new Vip("zhangsan");
        v.shopping();
        v.doSome();
        
    }
}

class Customer{
    String name;
    public Customer(){
    }
    public Customer(String name){
        this.name = name;
    }
    public void doSome(){
        System.out.println("doSome!");
    }
}

class Vip extends Customer{

    String name;

    public Vip(){
    }
    public Vip(String name){
        super(name);
    }
    public void shopping(){
        System.out.println(this.name + "正在购物！");
        System.out.println(super.name + "正在购物！");
        System.out.println(name + "正在购物！");
    }
}
