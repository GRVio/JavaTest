package This;

public class Date {

    //属性
    private int year;
    private int month;
    private int day;
    //构造方法
    public Date() {
        /* 此处代码与有参数的代码重复，所以不需要写，直接调用
        this.year = 1970;
        this.month = 1;
        this.day = 1;
        */
        //以上代码可以通过调用另一个构造方法完成
        //但前提是不能创建新的对象，以下代码表示创建了一个全新的对象
        //new Date(1970,1,1);
        //需要采用以下语法完成构造方法的调用，这种方法不会创建新的对象且可以调用其他的构造方法
        //这个语句只能出现在第一行！！！！ 
        //(this可以在构造方法中调用另一构造方法)格式：this（实参）
        this(1970,1,1);
    }
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //setter and getter
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    //对外提供一个方法输出日期
    public void print(){
        System.out.println(this.year + "年" + this.month + "月" + this.day + "日");
    }
}
