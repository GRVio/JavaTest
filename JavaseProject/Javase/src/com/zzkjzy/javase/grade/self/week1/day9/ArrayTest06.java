package com.zzkjzy.javase.grade.self.week1.day9;

/**
 * 一维数组的深入--引用数据类型数组：
 *      引用数据类型与多态
 *      子类可以写进父类型数组中，
 *      但调用子类特有的方法时，必须使用instanceof判断子类类型
 */

public class ArrayTest06 {
    public static void main(String[] args) {

        // 数组
        Animal[] animals = {new Cat(),new Bird()};

        for (int i = 0; i < animals.length; i++) {

            if (animals[i] instanceof Cat){
                Cat cat = (Cat) animals[i];
                cat.catchMouse();
            }else if (animals[i] instanceof Bird){
                Bird bird = (Bird) animals[i];
                bird.sing();
            }
        }
    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动！");
    }
}

class Cat extends Animal{
    public void move(){
        System.out.println("猫在走猫步！");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
}

class Bird extends Animal{
    public void move() {
        System.out.println("Bird Fly!!");
    }
    public void sing(){
        System.out.println("鸟儿在歌唱！");
    }
}
