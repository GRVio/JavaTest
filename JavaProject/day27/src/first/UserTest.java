package first;

/**
 * 用户测试类
 * 对于当前程序来说:
 *      User类中的age属性在外部程序中可以随意访问，导致age属性的不安全。
 *      一个User对象表示一个用户， 用户的年龄不可能为负数，以下程序当中年龄值
 *      为负数，程序运行的时候并没有报错，这是当前程序存在的缺陷。
 * 面向对象包括三大特征:
 *      -封装
 *      -继承
 *      -多态
 * 当前主要讲解的是封装机制。为什么要封装?封装有什么好处?
 * 封装的好处:
 *      1、封装之后，对于那个事物来说，看不到这个事物比较复杂的那一面，只能看到该事物简单的那一面。
 *      复杂性封装，对外提供简单的操作入口。照相机就是一个很好的封装的案例， 照相机的实现原理非常复杂，
 *      但是对于使用照相机的人来说，操作起来是非常方便的是非常便捷的。还有像电视机也是封装的，电视机
 *      内存实现非常复杂，但是对于使用者来说不需要关心内部的实现原理，只需要会操作遥控器就行。
 *
 *      2、封装之后才会形成真正的“对象”，真正的独立体”
 *
 *      3、封装就意味着以后的程序可以重复使用。并且这个事物应该适应性比较强，在任何场合都可以使用。
 *
 *      4、封装之后，对于事物本身，提高了安全性。[安全级别高]
 */
public class UserTest {

    public static void main(String[] args) {
        // 创建User对象
        User user = new User();

        // 访问User
        //读取年龄
        System.out.println("该用户年龄：" + user.age);
        // 修改
        user.age = 18;
        // 读取年龄
        System.out.println("该用户年龄：" + user.age);
        // 修改'
        user.age = -100;
        // 读取年龄
        System.out.println("该用户年龄：" + user.age);

    }

}
