package gradeone.javase.self;

public class InstanceofTest {

    public static void main(String[] args) {

        //新建一个多态对象
        Animal a = new Cat();

        if (a instanceof Cat){

            Cat c = (Cat) a;
            c.catchMouth();
        }else {
            System.out.println("wrong");
        }
    }
}
