package Then;

/**
 * 封装
 * 封装的步骤:
 * 1、所有属性私有化,使用private关键字进行修饰, private表示私有的,修饰的所有数据只能在本类中访问。
 * 2、对外提供简单的操作入口,也就是说以后外部程序要想访问age属性,必须通过这些简单的入口进行访问:
 * -对外提供两个公开的方法,分别是set方法和get方法
 * -想修改age属性,调用set方法
 * -想读取age属性,调用get方法
 * 3、set方法的命名规范:
 * public void setAge (int a) {
 * age = a;
 * }
 * 4、get方法的命名规范:
 * public int getAge() {
 * return age;
 * }
 * I
 * 回想一下，-个属性通常访问的时候包括几种访问形式?
 * -第一种方式:想读取这个属性的值，读取get
 * -第二种方式:想修改这个属性的值，修改set
 */
public class User {
    //封装一个年龄
    private int age;

    //动作方法，用void
    //setter
    //在此处编译代码，进行安全控制
    public void setAge(int a) {
        //age = a;
        if (a < 0 || a > 200) {
            System.out.println("对不起，您输入的年龄不合法！");
            return;
        }
        //程序运行到此处，说明年龄合法，进行赋值；
        age = a;
    }

    //getter
    public int getAge() {
        return age;
    }
}
