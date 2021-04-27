package com.zzkjzy.javase.teach.class2;

import java.util.Scanner;

/**
 * 课本80页，投票案例
 * 本类作为测试类。
 */
public class P80Demo {
    public static void main(String[] args) {

        // 初始化学生对象
        Student[] students = Classroom.makeStudent();

        while (true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("班委竞选现在开始！你现在想...");
            System.out.println(" 1、开始投票 \r\n 2、查询学生票数 \r\n 3、查询所有学生的票数 \r\n 4、退出");

            int flag = scanner.nextInt();
            if (flag == 1){
                for (Student s : students) {
                    while (true) {
                        System.out.println("请输入你要投给学生的学号！\r\n (学号范围：0-9)");
                        int sNumber = scanner.nextInt();

                        if (sNumber > 9 || sNumber < 0) {
                            System.out.println("输入的学号有误！");
                        } else {
                            s.vote(students[sNumber]);
                            break;
                        }
                    }
                }
            } else if (flag == 2){
                System.out.println("请输入想要查询学生的学号：");
                int num = scanner.nextInt();
                Classroom.find(students[num]);
            } else if (flag == 3) {
                Classroom.find(students);
            } else if (flag == 4){
                break;
            } else {
                System.out.println("输入的值有误！");
            }
        }


    }
}
