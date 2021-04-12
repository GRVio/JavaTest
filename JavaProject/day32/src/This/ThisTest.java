package This;

public class ThisTest {

    //带有static的方法
    public static void main(String[] args) {

        //带static方法的调用
        ThisTest.doSome();
        doSome();
        System.out.println("*****************");
        //不带static方法的调用
        ThisTest tt = new ThisTest();
        tt.doOther();
        System.out.println("****************");
        tt.run();
    }
    //带有static的方法
    public static void doSome(){
        System.out.println("do Some!");
    }
    //不带static的方法
    public void doOther() {
        System.out.println("do Other!");
    }
    //不带static的方法默认含有this，所以可以直接调用其他实例方法
    //因为这个方法也是一个实例方法，被执行时一定会有对象，所以在这个方法里默认是有对象的情况
    public void run(){
        System.out.println("Run!");
        doOther();
    }
}
