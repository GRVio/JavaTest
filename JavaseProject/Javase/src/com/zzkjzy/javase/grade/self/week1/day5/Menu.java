package com.zzkjzy.javase.grade.self.week1.day5;

/**
 * 目标：顾客调用菜单接口，厨师实现菜单接口
 *
 * 分析：1、创建菜单以及菜品
 *      2、创建厨师并使其实现菜单接口
 *      3、创建顾客并使其调用菜单接口
 *      4、追加一位厨师并实现菜单接口
 *      5、让顾客调用菜单，分别点两道菜
 */

public interface Menu {
    void xiHongShiChaoJiDan ();
    void suanXiangQieZi ();
}
