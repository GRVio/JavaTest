package com.zzkjzy.javase.teach.class2;

/**
 * 教室类
 * 初始化学生对象
 */
public class Classroom {

    /**
     * 初始化10个学生对象，并依次赋上学号
     * @return  返回一个学生数组
     */
    public static Student[] makeStudent(){

        Student[] students = new Student[10];

        // 赋学号
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setNumber(i);
            students[i] = student;
        }

        return students;
    }

    public static void find(Student student){
        System.out.println("该学生的票数为：" + student.reTicked());
    }
    public static void find(Student[] students){
        for (Student s : students){
            System.out.println(s);
        }
    }
}
