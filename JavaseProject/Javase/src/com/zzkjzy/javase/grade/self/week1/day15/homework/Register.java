package com.zzkjzy.javase.grade.self.week1.day15.homework;

import java.util.Scanner;

/**
 * 用户注册：
 *      1、提示用户进行“用户名”和“密码”输入
 *      2、判断用户名长度，要求用户名长度在[6-14]之间，过大/过小都抛出异常
 */
public class Register {

    public static void start () throws UserNameException {


        // 用户名
        System.out.print("请输入用户名：");
        Scanner s = new Scanner(System.in);
        String userName = s.next();

        // 密码
        System.out.print("请输入密码：");
        Scanner mm = new Scanner(System.in);
        String m = mm.next();

        // 判断用户名是否符合规范
        // null写在userName前面，可以防止手误写成单等号出现的问题
        if (null == userName || userName.length() < 6 || userName.length() > 14){
            throw new UserNameException("用户名长度不符合规范！");
        }else {
            System.out.println("恭喜你，注册成功！");
        }
    }
}
