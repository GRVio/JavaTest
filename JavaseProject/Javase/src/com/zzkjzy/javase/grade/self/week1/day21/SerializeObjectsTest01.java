package com.zzkjzy.javase.grade.self.week1.day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 一次性序列化/反序列化多个对象
 */
public class SerializeObjectsTest01 {
    public static void main(String[] args) throws Exception{

        // 一次性序列化多个对象
        ArrayList<People> people = new ArrayList<>();
        people.add(new People("zhangSan",1));
        people.add(new People("liSi",12));
        people.add(new People("wangWu",123));
        people.add(new People("zhaoLiu",1234));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people"));

        oos.writeObject(people);

        oos.close();
        // 一次性反序列化多个对象(反序列化集合)
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people"));
        // obj为一个List<People>集合
        // Object obj = ois.readObject();
        List<People> peopleList = (List<People>)ois.readObject();

        for (People p : peopleList){
            System.out.println(p);
        }



    }
}
