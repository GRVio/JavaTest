package com.zzkjzy.javase.grade.self.week1.day7.homework;

import java.util.Objects;

/**
 * 一个套娃作业
 *      在重写一个类的equals/toString方法时，这个类中的属性的equals/toString方法不会被重写
 *      具体看下面的例子
 *
 *      补充：String 和 类 是引用数据类型！！
 *      比较引用数据类型使用equals方法
 */

public class EqualsTask01 {

    public static void main(String[] args) {

        // 没有重写addr中的toString方法，name='Jack', addr=Address@4554617c
        User u1 = new User("Jack",new Address("济宁","德源路","0123"));
        User u2 = new User("Jack",new Address("济宁","德源路","0123"));
        System.out.println(u1.equals(u2));

        System.out.println(u1.toString());

    }
}

class User{
    String name;
    Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    // rewrite

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", addr=" + addr ;
    }

    /**
     * equals重写：
     *      两个用户的用户名、家庭住址相同时，表示是同一个用户
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {

        // equals基本重写
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return name.equals(user.name) && addr.equals(user.addr);
    }
}

class Address{

    String city;
    String street;
    String zipcode;

    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "city='" + city + '\'' + ", street='" + street + '\'' + ", zipcode='" + zipcode + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;

        return city.equals(address.city) &&
                street.equals(address.street) &&
                zipcode.equals(address.zipcode);
    }
}
