package gradeone.javase.self;

/**
 * 主人
 */
/*
    这种方式没有使用java语言当中的多态机制，存在的缺点：
    Master的拓展力很差，因为只要加一个新的宠物，Master类就要添加新的方法
public class Master {

    // 喂养动物
    public void feed (Cat c){
        c.eat();
    }
    public void feed (Dog d){
        d.eat();
    }
}
// Master 与 Cat、Dog 的关联性很强，关联性高
*/
// 降低程序的耦合度【解耦合】，提高程序的拓展力【软件开发很重要的目标】
public class Master {

    // 喂养动物
    public void feed(Pet pet){
        pet.eat();
    }
}