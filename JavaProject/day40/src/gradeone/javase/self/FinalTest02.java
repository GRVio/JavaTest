package gradeone.javase.self;

public class FinalTest02 {

    public static void main(String[] args) {

        // 新建一个User对象
        User u = new User(100);

        // 再新建一个对象重新赋值
        // 程序执行到此，代表上面的对象已经变成垃圾数据，等待回收处理
        u = new User(200);

        // 新建User对象 加了final关键字
        final User q = new User(120);
        System.out.println(q.getA());
        // final修饰的引用一旦指向某个对象后，不能再指向其他对象，同时也不能被垃圾回收站回收
        // q = new User(210);

        // final修饰的引用虽然指向某个对象之后不能指向其他对象，但是所指向的对象内部的内存是可以被修改的
        q.setA(210);
        System.out.println(q.getA());
    }
}
