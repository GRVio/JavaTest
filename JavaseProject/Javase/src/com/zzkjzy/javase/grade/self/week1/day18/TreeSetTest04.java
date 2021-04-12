package com.zzkjzy.javase.grade.self.week1.day18;

import java.util.TreeSet;

/**
 * 字符串的排序：
 *      直接调用字符串中的CompareTo方法即可
 */
public class TreeSetTest04 {
    public static void main(String[] args) {

        Teacher t1 = new Teacher(23,"zhangsan");
        Teacher t2 = new Teacher(23,"zhangsi");
        Teacher t3 = new Teacher(45,"wangwu");
        Teacher t4 = new Teacher(45,"lisi");
        Teacher t5 = new Teacher(32,"zhaoliu");
        Teacher t6 = new Teacher(32,"zhaoer");


        TreeSet<Teacher> teachers = new TreeSet<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);
        teachers.add(t5);
        teachers.add(t6);

        for (Teacher teacher : teachers){
            System.out.println(teacher);
        }
    }
}

class Teacher implements Comparable<Teacher>{
    int age;
    String name;

    public Teacher() {
    }

    public Teacher(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 根据年龄排序，若年龄相同，则根据名字排序
     * @param teacher   本类
     * @return
     */
    @Override
    public int compareTo(Teacher teacher) {
        //    if (this.age == teacher.age){
        //        return this.name.compareTo(teacher.name);
        //    } else {
        //        return this.age - teacher.age;
        //    }
        // 使用三目运算符，写法更巧妙一些。
        return this.age == teacher.age ? this.name.compareTo(teacher.name) : this.age - teacher.age;
    }
}
