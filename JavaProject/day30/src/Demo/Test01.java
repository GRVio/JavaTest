package Demo;

public class Test01 {

    public static void main(String[] args) {

        int i = 10;
        //虽然调用方法，但void方法不返回值
        //方法返回值需新建变量接受
        add(i);
        System.out.println("main------>" + i);

    }
    public static void add(int i){

        //方法执行后输出
        i++;
        System.out.println("add------>" + i);
    }
}
