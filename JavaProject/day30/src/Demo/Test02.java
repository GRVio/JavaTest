package Demo;

public class Test02 {

    public static void main(String[] args) {

        User u = new User(20);
        //此处add中的u为一个地址，是对象u
        //add方法中u的地址指向对象u，所以值会被改变
        //java在传输数据时，传输的是“值”，这个值可能是基本数据类型
        //这个值也可能是一个地址，地址中的东西会被改变
        add(u);
        System.out.println("main-->" + u.age);
    }

    private static void add(User u) {
        u.age++;
        System.out.println("add-->" + u.age);

    }

}
class User{

    int age;

    public User(int i){
        age = i;
    }
}
