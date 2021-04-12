package src;

public class customerTest {
    public static void main(String[] args) {

        //创建customer对象
        customer c1 = new customer();
        c1.name = "zhangSan";

        //再创建customer对象
        customer c2 = new customer();
        c2.name = "liSi";

        c1.shopping();
        c2.shopping();
    }
}
