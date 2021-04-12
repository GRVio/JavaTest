package com.zzkjzy.javase.grade.self.week1.day9;

/**
 * 模拟一个系统：
 *      使用String[] args做一个登陆系统。
 *      要求：
 *          1、必须输入用户名和密码
 *          2、密码正确/错误
 */

public class ArrayTest05 {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("请输入用户名和密码！例如 zhangsan 123");
            return;
        }
        // 获取用户名
        String username = args[0];
        // 获取密码
        String password = args[1];
        // 判断
        // 使用以下编程方式可以避免出现空指针异常(老杜の经验)
        if ("admin".equals(username) && "123465".equals(password)){
            System.out.println("登陆成功，欢迎回来"+ args[0] +"舰长");
        }else{
            System.out.println("用户不存在或密码错误！");
        }
    }
}
