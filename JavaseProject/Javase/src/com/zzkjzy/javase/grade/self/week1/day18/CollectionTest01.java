package com.zzkjzy.javase.grade.self.week1.day18;

import java.util.*;

/**
 * java.util.Collections    集合工具类
 *      常用方法
 */
public class CollectionTest01 {
    public static void main(String[] args) {

        // ArrayList不是线程安全的
        List<String> s = new ArrayList<>();
        // 变成线程安全的
        Collections.synchronizedList(s);

        // 将数组进行排序
        s.add("491");
        s.add("458");
        s.add("455");
        Collections.sort(s);
        for (String s1 : s){
            System.out.println(s1);
        }

        // 自定义的类要重写比较器(实现Comparable接口，重写CompareTo方法)
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(12));
        cats.add(new Cat(35));
        cats.add(new Cat(26));
        cats.add(new Cat(23));
        Collections.sort(cats);
        for (Cat c : cats){
            System.out.println(c);
        }

        // 对Set集合进行排序？
        // 将Set转换成List集合后调用sort方法
        Set<String> stringSet = new HashSet<>();
        stringSet.add("467");
        stringSet.add("457");
        stringSet.add("421");
        stringSet.add("434");
        // 使用ArrayList的构造方法将Set转换成List
        List<String> set = new ArrayList(stringSet);
        Collections.sort(set);
        for (String ss : set){
            System.out.println(ss);
        }

        // sort方法可以传入一个比较器
        List<Bird> birds = new ArrayList<>();
        birds.add(new Bird(8));
        birds.add(new Bird(12));
        birds.add(new Bird(6));
        birds.add(new Bird(4));
        Collections.sort(birds,new BirdCompare());
        for (Bird bird : birds){
            System.out.println(bird);
        }

    }
}

class Bird{
    int age;

    public Bird(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "age=" + age +
                '}';
    }
}

class Cat implements Comparable<Cat>{

    int age;

    public Cat() {
    }

    public Cat(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return this.age - o.age;
    }
}

class BirdCompare implements Comparator<Bird>{

    @Override
    public int compare(Bird o1, Bird o2) {
        return o1.age - o2.age;
    }
}
