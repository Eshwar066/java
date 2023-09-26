package Projects.BankProject;

public class Account {

    private Integer AccNum;
    private String AccHolder;
    private double balance;

    public Account(Integer accNum, String accHolder, double balance) {
        AccNum = accNum;
        AccHolder = accHolder;
        this.balance = balance;
    }

    public void credit(double amount){
        balance=balance+amount;
    }

    public void debit(double amount){
        if(amount>balance){
            balance=balance-amount;
        }else{
            System.out.println("insufficient funds");
        }
    }

    public double getBalance(){
        return balance;
    }

    public Integer getAccNum() {
        return AccNum;
    }

    public void setAccNum(Integer accNum) {
        AccNum = accNum;
    }

    public String getAccHolder() {
        return AccHolder;
    }

    public void setAccHolder(String accHolder) {
        AccHolder = accHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccNum=" + AccNum +
                ", AccHolder='" + AccHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
