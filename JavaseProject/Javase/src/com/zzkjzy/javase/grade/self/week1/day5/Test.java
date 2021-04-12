package com.zzkjzy.javase.grade.self.week1.day5;

/**
 *  自己打了一遍，与视频中出入较大 多看视频 太绕了 P514
 *  大概就是在顾客类里加了一个Menu的属性  *这里一直想不明白，为什么能想得到这里加一个属性
 *  按老杜的说法：可以用has a表示的，用属性表达，可以用is a表示的，用继承表达
 *  所以这里有了一个Menu属性
 *  在顾客类里创建order()方法，方法体里调用本类的Menu属性，再调用Menu接口中的方法。
 *  虽然是调用的接口的方法，但由于有 “含有实参的构造方法” 的存在
 *  在创建对象时，传入一个Menu变量。所以，实际完成这个方法的是使用多态创建的厨师
 *  然后在测试方法里，先使用多态创建厨师对象，然后创建有参数的顾客对象点菜
 *  这里参数理所当然的把厨师传进去
 *
 *  至此，程序完成。
 *
 *  程序存在的问题：创建无参数顾客时，虽然编译可以通过，但会出现空指针异常
 *      原因是因为顾客类中的Menu属性没有被赋值(没错，Menu属性从始至终都是由构造方法实现的)
 *      由于引用为空，所以order方法中的接口类会调用实际接口中的方法。而接口中方法为抽象方法，没有被实现
 *      因此出现空指针异常
 *
 *  个人感觉order()方法可以修改成order(Menu menu)
 *  修改后的方法在没有厨师对象传入时直接报错，在一定程度上可以避免空指针异常的出现。
 *  但未经实际测试，无法确定是否会出现其他错误。
 */

public class Test {

    public static void main(String[] args) {

        // 创建厨师对象
        Menu cook1 = new CookOne();
        Menu cook2 = new CookTwo();

        // 创建顾客对象
        Customer c1 = new Customer(cook1);
        Customer c2 = new Customer(cook2);

        // 点菜
        c1.order();
        c2.order();

    }
}
