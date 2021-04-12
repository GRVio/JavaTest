package com.zzkjzy.javase.grade.self.week1.Class.homework;

public class HuaWeiPhone {

    String name = "华为Mate40Pro";
    double size = 6.76;
    double price = 6999.00;
    String configuration = "8G + 256G";

    // 构造方法
    public HuaWeiPhone() {
    }

    public HuaWeiPhone(String name, double size, double price, String configuration) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.configuration = configuration;
    }
}
