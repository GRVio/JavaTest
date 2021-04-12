package com.zzkjzy.javase.grade.self.week1.day18;

import java.util.TreeSet;

/**
 * 自定义类的排序(实现Comparable接口并重写CompareTo方法)
 */
public class TreeSetTest03 {
    public static void main(String[] args) {

        Customer c1  = new Customer(18);
        Customer c2  = new Customer(23);
        Customer c3  = new Customer(14);

        TreeSet<Customer> customers = new TreeSet<>();

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        for (Customer c :customers){
            System.out.println(c);
        }
    }
}

// 注意这里进行实现接口时，要在接口后面使用泛型。
class Customer implements Comparable<Customer>{

    int age;

    public Customer() {
    }

    public Customer(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "这个顾客的年龄是：" + age;
    }

    /**
     * 重写CompareTo方法，实现Customer类之间的比较
     * @param customer  传入一个Customer类
     * @return  若年龄相等，返回0；若前者大，返回正数；若后者大，返回负数。
     */
    @Override
    public int compareTo(Customer customer) {
        // 这里this是c1
        // customer是c2
        // c1与c2比较，就是this与customer比较
        /*
        这段代码可以使用一行代码来实现。
        本质上就是相等返回0，大于返回正数，小于返回负数
        使用减法可以轻松实现
        int age1 = this.age;
        int age2 = customer.age;
        if (age1 == age2){
            return 0;
        }else if (age1 > age2){
            return 1;
        }else if (age1 < age2){
            return -1;
        }*/
        return this.age - customer.age;
    }
}
