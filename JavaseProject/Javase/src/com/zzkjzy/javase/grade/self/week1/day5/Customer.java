package com.zzkjzy.javase.grade.self.week1.day5;

/**
 * 顾客   调用菜单点菜
 *      以下内容为附加，由杜老师所讲
 *      顾客手里有一个菜单：Customer has a menu.
 *      凡是能用has a表达的，同一以属性的方式存在！    即，为顾客赋一个实例变量
 *      猫是一个动物：Cat is an animal.
 *      凡是能用has a表达的，同一设置为继承！   即，class Cat extends Animal{}
 */

public class Customer {

    /*
    // 以下为自己所写
    // 看过视频后发现：
    // 这种写法耦合度过高，若使用CookOne则只能使用CookOne,尝不到CookTwo
    public static void main(String[] args) {

        // 厨师一号
        Menu qieZi = new CookOne();
        qieZi.suanXiangQieZi();
        qieZi.xiHongShiChaoJiDan();

        // 厨师二号
        Menu jiDan = new CookTwo();
        jiDan.xiHongShiChaoJiDan();
        jiDan.suanXiangQieZi();
    }
    */


    // 养成封装的习惯
    private Menu menu;

    // setter and getter

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    // 构造方法

    public Customer() {
    }

    public Customer(Menu menu) {
        this.menu = menu;
    }

    // 提供一个点菜方法

    public void order(){
        getMenu().suanXiangQieZi();
        getMenu().xiHongShiChaoJiDan();
    }
}
