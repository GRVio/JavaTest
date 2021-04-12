package Then;

/**
 *
 */
public class UserTest {

    public static void main(String[] args) {
        //创建新User对象
        User user = new User();
        //使用set更改user对象的实例变量
        user.setAge(45);
        //使用get读取值
        System.out.println("user的年龄为" + user.getAge());
    }
}
