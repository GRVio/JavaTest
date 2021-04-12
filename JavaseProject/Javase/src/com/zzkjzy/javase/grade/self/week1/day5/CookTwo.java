package com.zzkjzy.javase.grade.self.week1.day5;

/**
 * 厨师二号     实现菜单接口
 */

public class CookTwo implements Menu{
    @Override
    public void xiHongShiChaoJiDan() {
        System.out.println("西红柿炒鸡蛋已经完成！--by厨师2");
    }

    @Override
    public void suanXiangQieZi() {
        System.out.println("还没有学会蒜香茄子... by厨师2");
    }
}
