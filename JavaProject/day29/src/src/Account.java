package src;
//账号类
public class Account {

    //账户
    private String actno;
    //余额
    private double balance;
    //无参数构造器
    public Account(){
        //创建对象
        //初始化实例变量
    }
    public Account(String s){
        actno = s;
    }
    public Account(double q){
        balance = q;
    }
    public Account(String a,double q){
        actno = a;
        balance = q;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
