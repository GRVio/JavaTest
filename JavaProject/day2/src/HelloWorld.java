//public表示公开的
//class表示一个类
//HelloWorld表示一个类名
public class HelloWorld {     //表示定义一个公开的类，"HelloWorld",即为src底下的java项目名称
    //可以定义多个class，但public class只能有一个，且必须与文件名称一致
    //每个class下都可以编写main方法，“程序的入口”
    /**从这到下行代码之间为“类体”，除声明变量之外不得编写Java语句。
    /**
     public表示公开的
     static表示静态的
     void表示空
     main表示方法名是main
     (String[] args)是一个main方法的形式参数列表
     以下的方法是程序的主方法，是程序的入口
     */
    public static void main(String[] args) {  //arg为变量名，可以随便写
        /*
        表示定义一个公开的静态的主方法，这句话为程序的入口，记一下
         */
        //Java语句以分号结尾，半角分号
        //字符串必须用双引号
        System.out.println("Hello World!");
        System.out.println("你好，世界！");
        System.out.println("a");
        int a = 10;
        byte b = 3;
        int c = 4;
        int d;
        d = a + c;
        System.out.println("d=" + d);
        System.out.println(a+b);
        byte e;
        e = (byte) a;
        System.out.println(e);
        System.out.print("他说“早上好”");//早上好，两边字符串为全角，不会影响两头
    }
}
//以上  2020/11/19