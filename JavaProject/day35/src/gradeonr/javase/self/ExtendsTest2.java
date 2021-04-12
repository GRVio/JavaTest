package gradeonr.javase.self;

public class ExtendsTest2 {

    public static void main(String[] args) {

        C c = new C();
        //此处doSome调用的是B中的doSome方法
        //类比理解为继承遗产
        //爷爷遗产由父亲继承，父亲遗产由儿子继承
        //但儿子继承的是父亲的遗产，不是爷爷的遗产
        c.doSome();
    }
}
class A{
    public void doSome(){
        System.out.println("do some!");
    }
}
class B extends A{

}
class C extends B{

}
