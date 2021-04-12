package com.zzkjzy.javase.grade.self.week1.day16;

import java.util.ArrayList;
import java.util.Collection;

/**
 * contains测试：
 *      放在集合中的元素一定要重写equals方法
 */
public class CollectionContainsTest {
    public static void main(String[] args) {

        // 创建两个对象
        Demo d1 = new Demo("123");
        Demo d2 = new Demo("123");

        // 将一个对象放入集合当中，判断另一个对象是否在集合中
        // d2实际上并没有传入进集合当中，根据内容判断还是根据内存地址判断完全看equals方法是否重写
        Collection c = new ArrayList();
        c.add(d1);
        // 没有重写equals方法时：false
        // System.out.println(c.contains(d2));
        // 重写了equals方法之后：true
        System.out.println(c.contains(d2));
    }
}
class Demo{
    private String name;

    public Demo(){
    }

    public Demo(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Demo)) return false;
        Demo demo = (Demo) o;
        return demo.name.equals(this.name);
    }
}
