package com.zzkjzy.javase.grade.self.week1.day18;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 使用TreeMap对自定义类进行排序
 *      写一个比较器，并传入集合
 *      这个比较器需要实现java.util.Comparator接口，而不是java.lang.Comparable接口
 *
 *      也可以使用匿名内部类的方式去实现这一功能
 */
public class TreeSetTest05 {
    public static void main(String[] args) {
        //
        //// 创建集合对象，并传入比较器
        //TreeSet<Animal> animals = new TreeSet<>(new AnimalComparator());

        // 使用匿名内部类的方式实现Comparator接口
        TreeSet<Animal> animals = new TreeSet<>(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.id - o2.id;
            }
        });

        Animal animal1 = new Animal(15);
        Animal animal2 = new Animal(24);
        Animal animal3 = new Animal(65);
        Animal animal4 = new Animal(48);
        Animal animal5 = new Animal(32);
        Animal animal6 = new Animal(21);

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);
        animals.add(animal6);

        for (Animal animal : animals){
            System.out.println(animal);
        }
    }
}


class Animal{
    int id;

    public Animal() {
    }

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "这只动物的编号为：" + id;
    }
}

//class AnimalComparator implements Comparator<Animal> {
//    @Override
//    public int compare(Animal o1, Animal o2) {
//        return o1.id - o2.id;
//    }
//}
