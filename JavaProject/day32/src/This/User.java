package This;

public class User {

    //属性
    private int id;
    private String name;

    //构造函数
    public User(){

    }
    public User(int id,String name){
        this.id = id;
        this.name = name;
    }
    //setter and getter
    /*这样写可以，但变量名不方便理解
    public void setId(int a){
        id = a;
    }
    */

    public int getId() {
        return id;
    }
    public void setId(int id){
        //此处this.id代表上边的实例变量
        //id代表int后的形参
        //若此处不添加this，由于java的就近原则，两个id都会被当成形参
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
