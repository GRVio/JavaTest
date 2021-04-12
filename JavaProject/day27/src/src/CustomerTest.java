package src;

public class CustomerTest {

    public static void main(String[] args) {
        //无论如何，先新建对象
        Customer c = new Customer();
        //读取、修改不能再用c.id的形式，而需要依赖函数
        c.setAge(13);
        c.setName("Jack");
        c.setAddr("Everywhere");
        System.out.println(c.getAddr());
        System.out.println(c.getName());
        System.out.println(c.getAge());
    }
}
