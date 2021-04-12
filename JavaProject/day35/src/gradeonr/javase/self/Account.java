package gradeonr.javase.self;

public class Account {
    // 卡号 // 余额
    private int actNo;
    private double balance;

    // 构造方法
    public Account() {
    }

    public Account(int actNo, double balance) {
        this.actNo = actNo;
        this.balance = balance;
    }
    // setter and getter
    public int getActNo() {
        return actNo;
    }

    public void setActNo(int actNo) {
        this.actNo = actNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
