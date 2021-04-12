public class Demo {
    public static void main(String[] args) {
        //if语句及else、else if的运用，如下：
        int x = 62;
        //以成绩为例
        //考虑到数值会大于100的情况，先写出Error
        if (x > 100) {
            System.out.println("ERROR");
        } else if (x == 100) {
            System.out.println("NB");
        } else if (x >= 90) {
            System.out.println("好孩子");
        } else if (x > 60) {
            System.out.println("及格万岁");
        } else if (x == 60) {
            System.out.println("多一分浪费");
        } else {
            System.out.println("艹");
        }
    }
}
