package com.zzkjzy.javase.grade.self.week1.day21;

import java.io.Serializable;

/**
 * 人
 * 需要实现Serializable接口，不然不可序列化
 */
public class People implements Serializable {
    // IDEA自动生成
    private static final long serialVersionUID = -5269178206757548801L;

    // 手动创建序列化版本号
    //private static final long serialVersionUID = 12345678L;

    String name;
    // transient:游离的。表示不参与序列化。
    transient int id;
    boolean gender;
    String address;

    public People(){
    }

    public People(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
