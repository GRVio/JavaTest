package com.zzkjzy.javase.grade.self.week1.day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest05 {
    public static void main(String[] args) {

        Collection c = new ArrayList();

        c.add("qwe");
        c.add("asd");
        c.add("zxc");

        Iterator i = c.iterator();

        // 出现异常
        // while (i.hasNext()){
        //     i.remove();
        // }
        while (i.hasNext()){
            Object o = i.next();
            i.remove();
            System.out.println(o);
        }
        System.out.println(c.size());
    }
}
