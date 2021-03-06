package gradeone.javase.self03;

/**
 * static关键字
 *      1、静态代码块，格式为：
 *      static{
 *          java语句
 *      }
 *      2、静态代码块在类加载的时候执行，且只执行一次
 *      3、可以有多个静态代码块，自上而下执行
 *      4、静态代码块的作用什么?怎么用?用在哪儿?什么时候用?
 *          -这当然和具体的需求有关，例如项目中要求在类加载的时刻/时机执行代码完成日志的记录。
 *          那么这段记录日志的代码就可以编写到静态代码块当中，完成日志记录。
 *          -静态代码块是java为程序员准备一个特殊的时刻，这个特殊的时刻被称为类加载时刻。若
 *          希望在此刻执行一段特殊的程序，这段程序可以直接放到静态代码块当中。
 */
public class StaticTest {
    static {
        System.out.println("类加载");
    }
    static {
        System.out.println("类加载");
    }
    static {
        System.out.println("类加载");
    }

    public static void main(String[] args) {
        System.out.println("main 运行");
    }
}
