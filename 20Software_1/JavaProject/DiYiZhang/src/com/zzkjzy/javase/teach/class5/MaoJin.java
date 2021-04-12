package com.zzkjzy.javase.teach.class5;

/**
 * 毛巾
 */
public class MaoJin{
    // 商品编号
    int id = 2;
    // 商品名称
    String name = "毛巾";
    // 商品价格
    double price = 10.0;
    // 数量
    int count;
    //构造方法

    public MaoJin() {
    }

    public MaoJin(int id, String name, double price, int count) {
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
