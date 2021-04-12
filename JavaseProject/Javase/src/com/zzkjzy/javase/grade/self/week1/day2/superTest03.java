package com.zzkjzy.javase.grade.self.week1.day2;

/**
 * 例子：在恰当的时机使用：super(实际参数列表);
 */

public class superTest03 {

    public static void main(String[] args){
        CreditAccount ca1 = new CreditAccount();
        CreditAccount ca2 = new CreditAccount("zhangsan",8000.0,0.9);
        System.out.println(ca1.getActno() + "," + ca1.getBalance() + "," + ca1.getCredit());
        System.out.println(ca2.getActno() + "," + ca2.getBalance() + "," + ca2.getCredit());
    }
}

// 账户
class Account{
    // 属性
    private String actno;
    private double balance;
    // 构造方法
    public Account(){
    }
    public Account(String actno,double balance){
        this.actno = actno;
        this.balance = balance;
    }
    // setter and getter
    public void setActno(String actno){
        this.actno = actno;
    }
    public String getActno(){
        return actno;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
}
//信用账户
class CreditAccount extends Account{
    // 属性
    private double credit;
    // 构造方法
    public CreditAccount(){
        super();
    }

    public CreditAccount(String actno,double balance,double credit){

        // actno与balance都是私有属性(private)，只能在本类中访问
        /*
        this.actno = actno;
        this.balance = balance;
         */
        // 即使这里不写super(actno,balance),也会有一个默认存在的无参super()
        // 这个无参super()会调用父类的无参构造方法，将父类的成员变量设为默认值。
        super(actno,balance);
        this.credit = credit;

    }
    // setter and getter
    public void setCredit(double Credit){
        this.credit = credit;
    }
    public double getCredit(){
        return credit;
    }
}