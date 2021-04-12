package com.zzkjzy.javase.grade.self.week1.day18;

import java.util.TreeSet;

/**
 * 对自定义的类型，TreeSet可以排序吗？
 *      不能。甚至在储存的时候就会出问题。
 *      出现异常：ClassCastException
 *      出现这个异常的原因是自定义的类没有实现java.long.Comparable接口。
 */
public class TreeSetTest02 {
    public static void main(String[] args) {

        Student student1 = new Student(10);
        Student student2 = new Student(12);
        Student student3 = new Student(26);

        Person p = new Person(12);

        TreeSet<Student> studentTreeSet = new TreeSet<>();
        TreeSet<Person> people = new TreeSet<>();

        people.add(p);

        for (Person person : people){
            System.out.println(person);
        }

        //studentTreeSet.add(student1);
        //studentTreeSet.add(student2);
        //studentTreeSet.add(student3);
        //
        //for (Student student : studentTreeSet){
        //    System.out.println(student);
        //}
    }
}

class Person{
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "This person is" + age + "years old";
    }
}

class Student {
    int id;

    public Student(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "这个学生的id为" + id;
    }
}
