package gradeonr.javase.self;

    // 继承 详见ExtendsTest.java
public class CreditAccount extends Account{

    // 信用度
    private double credit;

    // 构造方法
    public CreditAccount(){

    }
    // setter and getter
    public double getCredit(){
        return credit;
    }
    public void setCredit(int credit){
        this.credit = credit;
    }
}
