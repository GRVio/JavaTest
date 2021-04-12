package com.zzkjzy.javase.grade.self.week1.day5;

/**
 * 厨师一号     实现菜单接口
 */

public class CookOne implements Menu{
    @Override
    public void suanXiangQieZi() {
        System.out.println("蒜香茄子已经完成！--by厨师1");
    }

    @Override
    public void xiHongShiChaoJiDan() {
        System.out.println("还没有学会西红柿炒鸡蛋... --by厨师1");
    }
}
