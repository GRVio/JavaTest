package src;

public class UserTest {

    public static void main(String[] args) {

        //只有方法才带括号
        new User();
        User u = new User();
        User u1 = new User(1);
        User u2 = new User("asd");
        User u3 = new User(1, "qwe");

        //调用含有static的方法
        //1、在同一文件中直接输出
        //2、类名.方法名();
        doSome();
        UserTest.doSome();
        //调用不含有static的方法
        //因为方法在UserTest中，所以创建UserTest对象
        //对象名.方法名
        UserTest ut = new UserTest();//类中没有创造方法，系统默认提供一个无参数的构造方法
        ut.doOther();
    }

    //带有static的方法
    public static void doSome() {
        System.out.println("doSome");
    }

    //不带static的方法
    public void doOther() {
        System.out.println("doOther");
    }
}
