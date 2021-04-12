package com.zzkjzy.javase.teach.class5;

/**
 * 牙刷
 */
public class YaShua{
    // 商品编号
    int id = 1;
    // 商品名称
    String name = "牙刷";
    // 商品价格
    double price = 8.8;
    // 数量
    int count;

    // 构造方法

    public YaShua() {
    }

    public YaShua(int id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    // setter and getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
