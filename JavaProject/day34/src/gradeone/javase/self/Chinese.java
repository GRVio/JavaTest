package gradeone.javase.self;

/**
 * 中国人 ---- 类
 * 假设：每个人的姓名不同、身份证号不同、但国籍必须相同
 * 方法一 -- 使用实例变量，如下所示
 * 方法二见self02
 */
public class Chinese {

    //身份证
    String id;
    //名字
    String name;
    //国籍
    String country;

    public Chinese(){

    }
    public Chinese(String id,String name,String country){
        this.id = id;
        this.name = name;
        this.country = country;
    }

}
