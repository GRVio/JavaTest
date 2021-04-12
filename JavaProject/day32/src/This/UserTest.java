package This;

public class UserTest {

    public static void main(String[] args) {

        User u = new User(123456, "zhangSan");
        System.out.println(u.getId());
        System.out.println(u.getName());
        u.setId(321);
        u.setName("liSi");
        System.out.println(u.getId());
        System.out.println(u.getName());
    }
}
