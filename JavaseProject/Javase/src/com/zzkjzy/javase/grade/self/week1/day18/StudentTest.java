package com.zzkjzy.javase.grade.self.week1.day18;

import java.util.Objects;

/**
 * HashCode方法和equals方法
 */
public class StudentTest {
    int id;
    int age;
    String name;

    public StudentTest() {
    }

    public StudentTest(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentTest that = (StudentTest) o;
        return id == that.id &&
                age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, name);
    }

    @Override
    public String toString() {
        return "StudentTest{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
