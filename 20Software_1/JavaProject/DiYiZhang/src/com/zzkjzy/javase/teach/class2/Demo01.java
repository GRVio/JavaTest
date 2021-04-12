package com.zzkjzy.javase.teach.class2;

/**
 * 求圆形的面积：
 */
public class Demo01 {
    // PI,固定数值，定义为常量
    public static final float PI = 3.14f;
    public static void main(String[] args) {
        // 面积公式
        // S = PI * R ^ 2

        System.out.println(sumS(5));
    }
    // 求和方法
    public static float sumS(float r){
        float s = PI * (r * r);
        return s;
    }
}
