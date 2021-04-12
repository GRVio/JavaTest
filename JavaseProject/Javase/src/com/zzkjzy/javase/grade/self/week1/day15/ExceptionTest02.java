package com.zzkjzy.javase.grade.self.week1.day15;

/**
 * 建议再次观看day27课堂笔记
 *
 * 可以使用UML图来描述继承结构
 *  画UML图有很多工具，如：Rational Rose（收费）；starUML等
 *
 * 什么是UML？有什么用？
 *  UML是一种统一建模语言，一种图标式语言（画图的）
 *  UML不是仅为Java设计的，只要是面向对象的语言，都有UML。
 *  一般画UML图的都是软件架构师或是系统分析师，所使用的。
 *
 * 在UML图中，可以描述类和类之间的关系，程序执行的流程，对象的状态等。
 *
 * 在现实世界中，可以类比为建筑设计图纸。由设计师画图纸，学过建筑的都可以看懂。因此UML我们也必须要看得懂。
 *
 *
 * 不管是异常（Exception）还是错误（Error）都是可以抛出的，继承了抛出类（Throwable）
 *      Error：
 *      所有的错误（Error）只要发生，Java项目就会终止执行，退出JVM。
 *      错误是不能处理的。
 *      Exception：
 *          运行时异常
 *          这个异常是发生在运行时阶段的
 *          因为这种异常出现时会new一个异常对象
 *          RuntimeException:
 *
 *          编译时异常
 *          Exception的直接子类
 *          ExceptionSubClass
 *
 * 编译时异常，是在编译时发生的吗？
 *      不是，编译时是在编写程序的时候必须预先对这种异常进行处理，如果不处理编译器会报错。
 *      运行时异常在编写程序阶段可以自主选择处理或不处理
 */
public class ExceptionTest02 {
    public static void main(String[] args) {

        /*
        程序执行到此处发生了ArithmeticException异常
        底层new了一个异常对象，
        由于是main方法调用的异常，于是将异常抛给了main方法
        由于没有对异常的捕捉，因此只能继续向上抛
        main方法没有进行处理，自动将异常上抛给JVM
        JVM最终终止了对程序的运行

        ArithmeticException属于RuntimeException，运行时异常
        在编写阶段不需要对这个异常进行预先处理
        */
        System.out.println(2 / 0);
        System.out.println("Hello World");
    }
}

