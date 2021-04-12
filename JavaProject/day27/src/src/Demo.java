package src;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Student a = new Student();
        a.name = "Jack";
        a.no = 12306;
        System.out.println("我的名字是" + a.name);
        System.out.println("我的学号为" + a.no);
    }
}
