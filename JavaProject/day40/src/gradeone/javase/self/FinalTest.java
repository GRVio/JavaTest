package gradeone.javase.self;

/**
 * 关于java语言当中final关键字:
 *      1、final是个关键字,表示最终的,不可变的。
 *      2、final修饰的类无法被继承
 *      3、final保饰的方法无法被覆盖
 *      4、final修饰的变量”—旦”"贼值之后,不可重新赋值【不可二次赋值】
 *      5、final修饰的实例变量必须手动赋值，不能采用系统默认值
 *      6、final修饰的引用一旦指向某个对象后，不能再指向其他对象，同时也不能被垃圾回收站回收
 *          final修饰的引用虽然指向某个对象之后不能指向其他对象，但是所指向的对象内部的内存是可以被修改的
 */
public class FinalTest {

    // 实例变量
    // 一旦加“final”就不能重新赋值
    // 综合考虑，java语言规定，实例变量必须手动赋值，不能采用系统默认值。

    // 解决方法：
    //      1、直接赋值
    //      2、使用构造方法赋值
    // 实例变量在赋值时，是在构造方法运行时进行赋值
    // 因此将值写在构造方法里与直接加等号并无区别

    // 解决方案1：
    final int a = 1;

    // 解决方案2：
    final int a1;

    public FinalTest() {
        a1 = 243;
    }

    public static void main(String[] args) {

        int b = 12;
        b = 31;

        final int c = 20;
        //c = 40;

        final int d;
        d = 10;
        //d = 20;

    }
}
