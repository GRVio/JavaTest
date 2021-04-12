package com.zzkjzy.javase.grade.self.week1.day8;

public class HashCodeTest {
    public static void main(String[] args) {
        A2 a1 = new A2();
        A2 a2 = new A2();
        A2 a3 = new A2();
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());
    }
}

class A2{

}
