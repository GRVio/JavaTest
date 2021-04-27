package com.zzkjzy.javase.teach.class2;

public class Animal {
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move(){
        System.out.println("动物在移动！");
    }
    public void id(){
        System.out.println("年龄:"+ age + "名字:" + name);
    }
    public void id(String name,int age){
        System.out.println("年龄:"+ age + "名字:" + name);
    }

}
