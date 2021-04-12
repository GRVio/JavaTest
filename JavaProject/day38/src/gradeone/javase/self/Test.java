package gradeone.javase.self;

// 测试类
public class Test {

    public static void main(String[] args) {
        Bird b1 = new Bird();
        Animal a1 = new Animal();
        // 新建对象可以看做一个创建变量的过程
        // 对象的类型需在前面声明，而new则代表这个对象内在的本质
        Animal a2 = new Cat();
        Cat c1 = new Cat();

        a1.move();

        a2.move();
        b1.move();
        c1.move();
        c1.catchMouth();
        System.out.println("================");

        // 怎么使a2可以调用catchMouth的方法？
        // answer : 强制类型转换
        Cat c2 = (Cat) a2;
        c2.catchMouth();

        /**
         * Bird与Cat之间是没有继承关系的
         * 所以Bird Cat之间不能互相转换
         * 以下程序编译是没有问题的，a3的数据类型是Animal
         * Animal与Cat之间有继承关系，且Animal为父类型 Cat为子类型
         * 父类型(a3)转换为子类型(c3) 向下转型
         *
         * 但在运行过程中 由于a3的内在为Bird类型
         * Bird对象无法转换为Cat对象 因为两者之间不存在继承关系
         * 此时出现报错(经典报错之一，上一个是空指针异常)：
         *      java.lang.ClassCastException
         *      这种异常只有在“向下类型转换”时发生
         */
        Animal a3 = new Bird();
        Cat c3 = (Cat) a3;
        /**
         * 1、以上异常只有在强制类型转换时才会发生，也就是说“向下转型”存在隐患
         * 2、而向上转型只要编译通过，运行一定不会出问题：Animal a = new Cat();
         * 3、如何避免向下转型出现的ClassCastException?
         *      使用instanceof运算符可以避免出现以上的异常
         * 4、怎么使用instanceof?
         *      4.1、语法格式：
         *          (引用 instanceof 数据类型名)
         *
         *      4.2、以上运算符执行的结果类型是布尔类型，结果可能是true/false
         *
         *      4.3、关于结果true/false
         *          假设：(a instanceof Animal)
         *          true:
         *              a这个引用指向的对象是一个Animal类型
         *          false:
         *              a这个引用指向的对象不是一个Animal类型
         * 关于此运算符 这个运算符判断的是对象的本质，即等号右边的部分
         *      在运行层面上判断，这个对象是不是Animal，而不是等号左边部分，编译期的层面
         * 为方便理解，新开一个test
         * 建议：在对对象进行强制类型转换时，使用instanceof运算符进行判断，避免ClassCastException错误
         */
    }
}
