package gradeone.javase.self;

public class ChinesTest {

    public static void main(String[] args) {

        Chinese zhangSan = new Chinese("1","张三","China");
        System.out.println(zhangSan.id + "," + zhangSan.name + "," + zhangSan.country);
        Chinese liSi = new Chinese("2","李四","China");
        System.out.println(liSi.id + "," + liSi.name + "," + liSi.country);
    }
}
