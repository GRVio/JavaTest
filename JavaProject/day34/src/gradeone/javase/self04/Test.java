package gradeone.javase.self04;

/**
 * 实例代码块
 * 格式：
 * {
 *     java语句
 * }
 */
public class Test {
    public Test(){
        System.out.println("缺省构造器执行");
    }
    {
        System.out.println(123);
    }
    {
        System.out.println(123);
    }

    public static void main(String[] args) {

        System.out.println("main begin");
        //创建对象
        new Test();
    }

}
