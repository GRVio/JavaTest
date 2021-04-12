package com.zzkjzy.javase.grade.self.week1.Association;

    /**
     * 案例：
     *  这段代码可以实现在dos窗口进行用户名及密码的输入
     *
     * 原理：
     *  通过向args数组输入元素来输入用户名及密码
     *  使用if语句及equals方法进行判断 用户名与密码是否正确
     *
     *  关于数组：
     *  引用数据类型 基础数据类型
     *
     *  关于if语句：
     *  判断条件 代码块
     *
     */
    public class Demo01 {
        public static void main(String[] args) {
            // 这里的 != 是逻辑运算符中的不等号
            if (args.length != 2){
                System.out.println("请输入用户名和密码！例如 zhangsan 123");
                return;
            }
            // 获取用户名
            String username = args[0];
            // 获取密码
            String password = args[1];
            // 判断
            // admin为用户名
            // 123456为密码
            if ("admin".equals(username) && "123456".equals(password)){
                System.out.println("登陆成功，欢迎回来"+ args[0] +"舰长!");
            }else{
                System.out.println("用户不存在或密码错误！");
            }
        }
}
